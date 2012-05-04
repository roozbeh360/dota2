package com.github.clentfort.dota2.parser;

import java.util.Iterator;
import java.util.List;

import com.github.clentfort.dota2.dota.Hero;
import com.github.clentfort.dota2.dota.HeroRole;
import com.github.clentfort.dota2.dota.Heroes;
import com.github.clentfort.dota2.dota.Unit;
import com.github.clentfort.dota2.dota.UnitAttribute;
import com.github.clentfort.dota2.dota.UnitStatus;
import com.github.clentfort.dota2.dota.Units;

public class ParserConverter {
	public static final String BASE_UNIT = "npc_dota_units_base";
	public static final String BASE_HERO = "npc_dota_hero_base";
	
	public static Unit baseUnit(ParserObject baseObject) throws ParserException  {
		Unit baseUnit = new Unit();
		baseUnit.setName("base");
		baseUnit.setLevel(baseObject.getInt("Level"));
		baseUnit.setAncient(baseObject.optBoolean("IsAncient"));
		baseUnit.setNeutral(baseObject.optBoolean("IsNeutralUnitType"));
		
		Unit.Abilities abilities = new Unit.Abilities();
		baseUnit.setAbilities(abilities);
		
		Unit.Armor armor = new Unit.Armor();
		armor.setPhysical(baseObject.getDouble("ArmorPhysical"));
		armor.setMagical(baseObject.getDouble("ArmorMagical"));
		baseUnit.setArmor(armor);
		
		Unit.Attack attack = new Unit.Attack();
		attack.setAttackCapabilities(baseObject.getString("AttackCapabilities"));
		Unit.Attack.Damage damage = new Unit.Attack.Damage();
		damage.setDamageType(baseObject.getString("AttackDamageType"));
		damage.setMin(baseObject.getInt("AttackDamageMin"));
		damage.setMax(baseObject.getInt("AttackDamageMax"));
		attack.setDamage(damage);
		attack.setRate(baseObject.getDouble("AttackRate"));
		attack.setRange(baseObject.getInt("AttackRange"));
		attack.setProjectileSpeed(baseObject.getInt("ProjectileSpeed"));
		baseUnit.setAttack(attack);
		
		Unit.Attributes attributes = new Unit.Attributes();
		attributes.setPrimary(baseObject.getString("AttributePrimary"));
		UnitAttribute strength = new UnitAttribute();
		strength.setBase(baseObject.getInt("AttributeBaseStrength"));
		strength.setGain(baseObject.getDouble("AttributeStrengthGain"));
		attributes.setStrength(strength);
		UnitAttribute intelligence = new UnitAttribute();
		intelligence.setBase(baseObject.getInt("AttributeBaseIntelligence"));
		intelligence.setGain(baseObject.getDouble("AttributeIntelligenceGain"));
		attributes.setIntelligence(intelligence);
		UnitAttribute agility = new UnitAttribute();
		agility.setBase(baseObject.getInt("AttributeBaseAgility"));
		agility.setGain(baseObject.getDouble("AttributeAgilityGain"));
		attributes.setAgility(agility);
		baseUnit.setAttributes(attributes);
		
		Unit.Bounty bounty = new Unit.Bounty();
		bounty.setXp(baseObject.getInt("BountyXP"));
		Unit.Bounty.Gold gold = new Unit.Bounty.Gold();
		gold.setMin(baseObject.getInt("BountyGoldMin"));
		gold.setMax(baseObject.getInt("BountyGoldMax"));
		bounty.setGold(gold);
		baseUnit.setBounty(bounty);
		
		Unit.Movement movement = new Unit.Movement();
		movement.setMovementCapabilities("MovementCapabilities");
		movement.setSpeed(baseObject.getInt("MovementSpeed"));
		movement.setTurnRate(baseObject.getDouble("MovementTurnRate"));
		baseUnit.setMovement(movement);
		
		Unit.Stats stats = new Unit.Stats();
		UnitStatus health = new UnitStatus();
		health.setBase(baseObject.getInt("StatusHealth"));
		health.setRegeneration(baseObject.getDouble("StatusHealthRegen"));
		stats.setHealth(health);
		UnitStatus mana = new UnitStatus();
		mana.setBase(baseObject.getInt("StatusMana"));
		mana.setRegeneration(baseObject.getDouble("StatusManaRegen"));
		stats.setMana(mana);
		baseUnit.setStats(stats);
		
		Unit.Vision vision = new Unit.Vision();
		vision.setDay(baseObject.getInt("VisionDaytimeRange"));
		vision.setNight(baseObject.getInt("VisionNighttimeRange"));
		baseUnit.setVision(vision);
		return baseUnit;
	}
	
	public static Units toUnits(ParserObject object) throws ParserException {
		ParserObject baseObject;
		if (object.has(BASE_UNIT)) {
			baseObject = object.getParserObject(BASE_UNIT);
			object.remove(BASE_UNIT);
		}
		else if (object.has(BASE_HERO)) {
			baseObject = object.getParserObject(BASE_HERO);
			object.remove(BASE_HERO);
		}
		else throw new ParserException("The ParserObject is not a valid units object!");
		
		Unit baseUnit = baseUnit(baseObject);
				
		Units u = new Units();
		List<Unit> units = u.getUnit();
				
		for (Iterator i = object.keys(); i.hasNext();) {
			String name = (String)i.next();
			if (!name.startsWith("npc_dota_")) continue;
			ParserObject unitObject = object.getParserObject(name);
			Unit unit = baseUnit.clone();
			unit.setName(name);
			// Level
			if (unitObject.has("Level"))
				unit.setLevel(unitObject.getInt("Level"));
			// Is ancient
			if (unitObject.has("IsAncient"))
				unit.setAncient(unitObject.getBoolean("IsAncient"));
			// Is neutral
			if (unitObject.has("IsNeutralUnitType"))
				unit.setNeutral(unitObject.getBoolean("IsNeutralUnitType"));
			
			// Abilities
			for (Iterator j = unitObject.keys(); j.hasNext();) {
				String key = (String)j.next();
				if (key.startsWith("Ability") && !key.endsWith("Preview") && !unitObject.getString(key).isEmpty()) {
					unit.getAbilities().getAbility().add(unitObject.getString(key));
				}
			}
			
			// Armor
			// Physical
			if (unitObject.has("ArmorPhysical"))
				unit.getArmor().setPhysical(unitObject.getDouble("ArmorPhysical"));
			// Magical
			if (unitObject.has("ArmorMagical"))
				unit.getArmor().setMagical(unitObject.getDouble("ArmorMagical"));

			// Attack
			// AttackCapabilities
			if (unitObject.has("AttackCapabilities"))
				unit.getAttack().setAttackCapabilities(unitObject.getString("AttackCapabilities"));
			// Damage
			// Damage Type
			if (unitObject.has("AttackDamageType")) 
				unit.getAttack().getDamage().setDamageType("AttackDamageType");
			// Min Damage
			if (unitObject.has("AttackDamageMin"))
				unit.getAttack().getDamage().setMin(unitObject.getInt("AttackDamageMin"));
			// Max Damage
			if (unitObject.has("AttackDamageMax")) 
				unit.getAttack().getDamage().setMax(unitObject.getInt("AttackDamageMax"));
			// - End Damage
			// Attack Rate
			if (unitObject.has("AttackRate")) 
				unit.getAttack().setRate(unitObject.getDouble("AttackRate"));
			// Attack Range
			if (unitObject.has("AttackRange")) 
				unit.getAttack().setRange(unitObject.getInt("AttackRange"));
			// Projectile Speed
			if (unitObject.has("ProjectileSpeed")) 
				unit.getAttack().setProjectileSpeed(unitObject.getInt("ProjectileSpeed"));
			
			// Attributes
			// Primary
			if (unitObject.has("AttributePrimary"))
				unit.getAttributes().setPrimary(unitObject.getString("AttributePrimary"));
			// Strength
			if (unitObject.has("AttributeBaseStrength"))
				unit.getAttributes().getStrength().setBase(unitObject.getInt("AttributeBaseStrength"));
			if (unitObject.has("AttributeStrengthGain"))
				unit.getAttributes().getStrength().setGain(unitObject.getDouble("AttributeStrengthGain"));
			// Intelligence
			if (unitObject.has("AttributeBaseIntelligence"))
				unit.getAttributes().getIntelligence().setBase(unitObject.getInt("AttributeBaseIntelligence"));
			if (unitObject.has("AttributeIntelligenceGain"))
				unit.getAttributes().getIntelligence().setGain(unitObject.getDouble("AttributeIntelligenceGain"));
			// Agility
			if (unitObject.has("AttributeBaseAgility"))
				unit.getAttributes().getAgility().setBase(unitObject.getInt("AttributeBaseAgility"));
			if (unitObject.has("AttributeAgilityGain"))
				unit.getAttributes().getAgility().setGain(unitObject.getDouble("AttributeAgilityGain"));
			
			// Bounty
			// XP
			if (unitObject.has("BountyXP"))
				unit.getBounty().setXp(unitObject.getInt("BountyXP"));
			// Gold
			if (unitObject.has("BountyGoldMin"))
				unit.getBounty().getGold().setMin(unitObject.getInt("BountyGoldMin"));
			if (unitObject.has("BountyGoldMax"))
				unit.getBounty().getGold().setMax(unitObject.getInt("BountyGoldMax"));
			
			// Movement
			// Capabilities
			if (unitObject.has("MovementCapabilities"))
				unit.getMovement().setMovementCapabilities("MovementCapabilities");
			// Speed
			if (unitObject.has("MovementSpeed"))
				unit.getMovement().setSpeed(unitObject.getInt("MovementSpeed"));
			// Turn rate
			if (unitObject.has("MovementTurnRate"))
				unit.getMovement().setTurnRate(unitObject.getDouble("MovementTurnRate"));
			
			// Stats
			// Health
			if (unitObject.has("StatusHealth"))
				unit.getStats().getHealth().setBase(unitObject.getInt("StatusHealth"));
			// Health Regen
			if (unitObject.has("StatusHealthRegen"))
				unit.getStats().getHealth().setRegeneration(unitObject.getDouble("StatusHealthRegen"));
			// Mana
			if (unitObject.has("StatusMana"))
				unit.getStats().getMana().setBase(unitObject.getInt("StatusMana"));
			// Mana Regen
			if (unitObject.has("StatusMana"))
				unit.getStats().getMana().setRegeneration(unitObject.getDouble("StatusManaRegen"));
			
			// Vision
			// Day
			if (unitObject.has("VisionDaytimeRange"))
				unit.getVision().setDay(unitObject.getInt("VisionDaytimeRange"));
			if (unitObject.has("VisionNighttimeRange"))
				unit.getVision().setNight(unitObject.getInt("VisionNighttimeRange"));
			units.add(unit);
		}
		
		return u;
	}
	
	public static Heroes toHeroes(ParserObject object) throws ParserException {
		Units u = toUnits(object);
		List<Unit> units = u.getUnit();
		Heroes h = new Heroes();
		List<Hero> heroes = h.getHero();
		for (Unit unit : units) {
			//Hero hero = (Hero)unit;
			Hero hero = new Hero(unit);
			ParserObject heroObject = object.getParserObject(hero.getName());
			if (heroObject.has("HeroID"))
				hero.setId(heroObject.getInt("HeroID"));
			
			if (heroObject.has("Role"))
				hero.setRole(HeroRole.fromValue(heroObject.getString("Role")));
			
			if (heroObject.has("NameAliases"))
				hero.setAlias(heroObject.getString("NameAliases"));
			
			heroes.add(hero); 
		}
		return h;
	}
}
