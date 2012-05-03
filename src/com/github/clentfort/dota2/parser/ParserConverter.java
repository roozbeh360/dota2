package com.github.clentfort.dota2.parser;

import java.util.Iterator;
import java.util.List;

import com.github.clentfort.dota2.dota.Unit;
import com.github.clentfort.dota2.dota.UnitAttribute;
import com.github.clentfort.dota2.dota.UnitStatus;
import com.github.clentfort.dota2.dota.Units;

public class ParserConverter {
	public static final String BASE_UNIT = "npc_dota_units_base";
	
	public static Units toUnits(ParserObject object) throws ParserException {
		if (!object.has(BASE_UNIT)) {
			throw new ParserException("The ParserObject is not a valid units object!");
		}
		ParserObject baseObject = object.getParserObject(BASE_UNIT);
		object.remove(BASE_UNIT);
		Unit baseUnit = new Unit();
		baseUnit.setName("base");
		baseUnit.setLevel(baseObject.getInt("Level"));
		baseUnit.setAncient(baseObject.getBoolean("IsAncient"));
		baseUnit.setNeutral(baseObject.getBoolean("IsNeutralUnitType"));
		
		Unit.Abilities abilities = new Unit.Abilities();
		baseUnit.setAbilities(abilities);
		
		Unit.Armor armor = new Unit.Armor();
		armor.setPhysical(baseObject.getInt("ArmorPhysical"));
		armor.setMagical(baseObject.getInt("ArmorMagical"));
		baseUnit.setArmor(armor);
		
		Unit.Attack attack = new Unit.Attack();
		attack.setAttackCapabilitie(baseObject.getString("AttackCapabilities"));
		Unit.Attack.Damage damage = new Unit.Attack.Damage();
		damage.setDamageType("AttackDamageType");
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
		strength.setBase(baseObject.getInt("AttributeStrengthGain"));
		attributes.setStrength(strength);
		UnitAttribute intelligence = new UnitAttribute();
		intelligence.setBase(baseObject.getInt("AttributeBaseIntelligence"));
		intelligence.setBase(baseObject.getInt("AttributeIntelligenceGain"));
		attributes.setIntelligence(intelligence);
		UnitAttribute agility = new UnitAttribute();
		agility.setBase(baseObject.getInt("AttributeBaseAgility"));
		agility.setBase(baseObject.getInt("AttributeAgilityGain"));
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
			
			// TODO Abilities
			/*if (unitObject.has("IsNeutralUnitType")) {
				Unit.Abilities abilities = new Unit.Abilities();
				unit.setAbilities(abilities);
			}*/
			
			// Armor
			// Physical
			if (unitObject.has("ArmorPhysical"))
				unit.getArmor().setPhysical(unitObject.getInt("ArmorPhysical"));
			// Magical
			if (unitObject.has("ArmorMagical"))
				unit.getArmor().setMagical(unitObject.getInt("ArmorMagical"));

			// Attack
			// AttackCapabilities
			if (unitObject.has("AttackCapabilities"))
				unit.getAttack().setAttackCapabilitie(unitObject.getString("AttackCapabilities"));
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
				unit.getAttributes().getStrength().setBase(unitObject.getInt("AttributeStrengthGain"));
			// Intelligence
			if (unitObject.has("AttributeBaseIntelligence"))
				unit.getAttributes().getIntelligence().setBase(unitObject.getInt("AttributeBaseIntelligence"));
			if (unitObject.has("AttributeIntelligenceGain"))
				unit.getAttributes().getIntelligence().setBase(unitObject.getInt("AttributeIntelligenceGain"));
			// Agility
			if (unitObject.has("AttributeBaseAgility"))
				unit.getAttributes().getAgility().setBase(unitObject.getInt("AttributeBaseAgility"));
			if (unitObject.has("AttributeAgilityGain"))
				unit.getAttributes().getAgility().setBase(unitObject.getInt("AttributeAgilityGain"));
			
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
}
