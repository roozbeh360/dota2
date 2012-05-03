//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.03 um 10:14:43 PM CEST 
//


package com.github.clentfort.dota2.dota;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für unit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="unit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="abilities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ability" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="armor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="physical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="magical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="damage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute ref="{http://clentfort.github.com/dota2/dota}damageType"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="projectileSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{http://clentfort.github.com/dota2/dota}attackCapabilitie"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attributes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="strength" type="{http://clentfort.github.com/dota2/dota}unitAttribute"/>
 *                   &lt;element name="intelligence" type="{http://clentfort.github.com/dota2/dota}unitAttribute"/>
 *                   &lt;element name="agility" type="{http://clentfort.github.com/dota2/dota}unitAttribute"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="primary" default="DOTA_ATTRIBUTE_STRENGTH">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DOTA_ATTRIBUTE_STRENGTH"/>
 *                       &lt;enumeration value="DOTA_ATTRIBUTE_INTELLECT"/>
 *                       &lt;enumeration value="DOTA_ATTRIBUTE_AGILITY"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bounty">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="gold">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="movement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="turnRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stats">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="health" type="{http://clentfort.github.com/dota2/dota}unitStatus"/>
 *                   &lt;element name="mana" type="{http://clentfort.github.com/dota2/dota}unitStatus"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vision">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="night" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="neutral" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ancient" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unit", propOrder = {
    "name",
    "level",
    "abilities",
    "armor",
    "attack",
    "attributes",
    "bounty",
    "movement",
    "stats",
    "vision"
})
@XmlSeeAlso({
    Hero.class
})
public class Unit implements Cloneable
{

    @XmlElement(required = true)
    protected String name;
    protected int level;
    @XmlElement(required = true)
    protected Unit.Abilities abilities;
    @XmlElement(required = true)
    protected Unit.Armor armor;
    @XmlElement(required = true)
    protected Unit.Attack attack;
    @XmlElement(required = true)
    protected Unit.Attributes attributes;
    @XmlElement(required = true)
    protected Unit.Bounty bounty;
    @XmlElement(required = true)
    protected Unit.Movement movement;
    @XmlElement(required = true)
    protected Unit.Stats stats;
    @XmlElement(required = true)
    protected Unit.Vision vision;
    @XmlAttribute(name = "neutral")
    protected Boolean neutral;
    @XmlAttribute(name = "ancient")
    protected Boolean ancient;

    /**
     * Creates a new {@code Unit} instance.
     * 
     */
    public Unit() {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
    }

    /**
     * Creates a new {@code Unit} instance by deeply copying a given {@code Unit} instance.
     * 
     * 
     * @param o
     *     The instance to copy.
     * @throws NullPointerException
     *     if {@code o} is {@code null}.
     */
    public Unit(final Unit o) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
        if (o == null) {
            throw new NullPointerException("Cannot create a copy of 'Unit' from 'null'.");
        }
        // CBuiltinLeafInfo: java.lang.String
        this.name = ((o.name == null)?null:o.getName());
        // CBuiltinLeafInfo: java.lang.Integer
        this.level = o.getLevel();
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Abilities
        this.abilities = ((o.abilities == null)?null:((o.getAbilities() == null)?null:o.getAbilities().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Armor
        this.armor = ((o.armor == null)?null:((o.getArmor() == null)?null:o.getArmor().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Attack
        this.attack = ((o.attack == null)?null:((o.getAttack() == null)?null:o.getAttack().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Attributes
        this.attributes = ((o.attributes == null)?null:((o.getAttributes() == null)?null:o.getAttributes().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Bounty
        this.bounty = ((o.bounty == null)?null:((o.getBounty() == null)?null:o.getBounty().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Movement
        this.movement = ((o.movement == null)?null:((o.getMovement() == null)?null:o.getMovement().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Stats
        this.stats = ((o.stats == null)?null:((o.getStats() == null)?null:o.getStats().clone()));
        // CClassInfo: com.github.clentfort.dota2.dota.Unit$Vision
        this.vision = ((o.vision == null)?null:((o.getVision() == null)?null:o.getVision().clone()));
        // CBuiltinLeafInfo: java.lang.Boolean
        this.neutral = ((o.neutral == null)?null:o.isNeutral());
        // CBuiltinLeafInfo: java.lang.Boolean
        this.ancient = ((o.ancient == null)?null:o.isAncient());
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der level-Eigenschaft ab.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Legt den Wert der level-Eigenschaft fest.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Ruft den Wert der abilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Abilities }
     *     
     */
    public Unit.Abilities getAbilities() {
        return abilities;
    }

    /**
     * Legt den Wert der abilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Abilities }
     *     
     */
    public void setAbilities(Unit.Abilities value) {
        this.abilities = value;
    }

    /**
     * Ruft den Wert der armor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Armor }
     *     
     */
    public Unit.Armor getArmor() {
        return armor;
    }

    /**
     * Legt den Wert der armor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Armor }
     *     
     */
    public void setArmor(Unit.Armor value) {
        this.armor = value;
    }

    /**
     * Ruft den Wert der attack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Attack }
     *     
     */
    public Unit.Attack getAttack() {
        return attack;
    }

    /**
     * Legt den Wert der attack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Attack }
     *     
     */
    public void setAttack(Unit.Attack value) {
        this.attack = value;
    }

    /**
     * Ruft den Wert der attributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Attributes }
     *     
     */
    public Unit.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Legt den Wert der attributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Attributes }
     *     
     */
    public void setAttributes(Unit.Attributes value) {
        this.attributes = value;
    }

    /**
     * Ruft den Wert der bounty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Bounty }
     *     
     */
    public Unit.Bounty getBounty() {
        return bounty;
    }

    /**
     * Legt den Wert der bounty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Bounty }
     *     
     */
    public void setBounty(Unit.Bounty value) {
        this.bounty = value;
    }

    /**
     * Ruft den Wert der movement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Movement }
     *     
     */
    public Unit.Movement getMovement() {
        return movement;
    }

    /**
     * Legt den Wert der movement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Movement }
     *     
     */
    public void setMovement(Unit.Movement value) {
        this.movement = value;
    }

    /**
     * Ruft den Wert der stats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Stats }
     *     
     */
    public Unit.Stats getStats() {
        return stats;
    }

    /**
     * Legt den Wert der stats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Stats }
     *     
     */
    public void setStats(Unit.Stats value) {
        this.stats = value;
    }

    /**
     * Ruft den Wert der vision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unit.Vision }
     *     
     */
    public Unit.Vision getVision() {
        return vision;
    }

    /**
     * Legt den Wert der vision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit.Vision }
     *     
     */
    public void setVision(Unit.Vision value) {
        this.vision = value;
    }

    /**
     * Ruft den Wert der neutral-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNeutral() {
        if (neutral == null) {
            return false;
        } else {
            return neutral;
        }
    }

    /**
     * Legt den Wert der neutral-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeutral(Boolean value) {
        this.neutral = value;
    }

    /**
     * Ruft den Wert der ancient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAncient() {
        if (ancient == null) {
            return false;
        } else {
            return ancient;
        }
    }

    /**
     * Legt den Wert der ancient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAncient(Boolean value) {
        this.ancient = value;
    }

    /**
     * Creates and returns a deep copy of this object.
     * 
     * 
     * @return
     *     A deep copy of this object.
     */
    @Override
    public Unit clone() {
        try {
            {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                final Unit clone = ((Unit) super.clone());
                // CBuiltinLeafInfo: java.lang.String
                clone.name = ((this.name == null)?null:this.getName());
                // CBuiltinLeafInfo: java.lang.Integer
                clone.level = this.getLevel();
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Abilities
                clone.abilities = ((this.abilities == null)?null:((this.getAbilities() == null)?null:this.getAbilities().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Armor
                clone.armor = ((this.armor == null)?null:((this.getArmor() == null)?null:this.getArmor().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Attack
                clone.attack = ((this.attack == null)?null:((this.getAttack() == null)?null:this.getAttack().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Attributes
                clone.attributes = ((this.attributes == null)?null:((this.getAttributes() == null)?null:this.getAttributes().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Bounty
                clone.bounty = ((this.bounty == null)?null:((this.getBounty() == null)?null:this.getBounty().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Movement
                clone.movement = ((this.movement == null)?null:((this.getMovement() == null)?null:this.getMovement().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Stats
                clone.stats = ((this.stats == null)?null:((this.getStats() == null)?null:this.getStats().clone()));
                // CClassInfo: com.github.clentfort.dota2.dota.Unit$Vision
                clone.vision = ((this.vision == null)?null:((this.getVision() == null)?null:this.getVision().clone()));
                // CBuiltinLeafInfo: java.lang.Boolean
                clone.neutral = ((this.neutral == null)?null:this.isNeutral());
                // CBuiltinLeafInfo: java.lang.Boolean
                clone.ancient = ((this.ancient == null)?null:this.isAncient());
                return clone;
            }
        } catch (CloneNotSupportedException e) {
            // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
            throw new AssertionError(e);
        }
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ability" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ability"
    })
    public static class Abilities implements Cloneable
    {

        protected List<String> ability;

        /**
         * Creates a new {@code Abilities} instance.
         * 
         */
        public Abilities() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Abilities} instance by deeply copying a given {@code Abilities} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Abilities(final Unit.Abilities o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Abilities' from 'null'.");
            }
            // 'Ability' collection.
            if (o.ability!= null) {
                copyAbility(o.getAbility(), this.getAbility());
            }
        }

        /**
         * Gets the value of the ability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbility().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAbility() {
            if (ability == null) {
                ability = new ArrayList<String>();
            }
            return this.ability;
        }

        /**
         * Copies all values of property {@code Ability} deeply.
         * 
         * @param source
         *     The source to copy from.
         * @param target
         *     The target to copy {@code source} to.
         * @throws NullPointerException
         *     if {@code target} is {@code null}.
         */
        @SuppressWarnings("unchecked")
        private static void copyAbility(final List<String> source, final List<String> target) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            if ((source!= null)&&(!source.isEmpty())) {
                for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                    final Object next = it.next();
                    if (next instanceof String) {
                        // CBuiltinLeafInfo: java.lang.String
                        target.add(((String) next));
                        continue;
                    }
                    // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                    throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'Ability' of class 'com.github.clentfort.dota2.dota.Unit$Abilities'."));
                }
            }
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Abilities clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Abilities clone = ((Unit.Abilities) super.clone());
                    // 'Ability' collection.
                    if (this.ability!= null) {
                        clone.ability = null;
                        copyAbility(this.getAbility(), clone.getAbility());
                    }
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="physical" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="magical" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "physical",
        "magical"
    })
    public static class Armor implements Cloneable
    {

        protected int physical;
        protected int magical;

        /**
         * Creates a new {@code Armor} instance.
         * 
         */
        public Armor() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Armor} instance by deeply copying a given {@code Armor} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Armor(final Unit.Armor o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Armor' from 'null'.");
            }
            // CBuiltinLeafInfo: java.lang.Integer
            this.physical = o.getPhysical();
            // CBuiltinLeafInfo: java.lang.Integer
            this.magical = o.getMagical();
        }

        /**
         * Ruft den Wert der physical-Eigenschaft ab.
         * 
         */
        public int getPhysical() {
            return physical;
        }

        /**
         * Legt den Wert der physical-Eigenschaft fest.
         * 
         */
        public void setPhysical(int value) {
            this.physical = value;
        }

        /**
         * Ruft den Wert der magical-Eigenschaft ab.
         * 
         */
        public int getMagical() {
            return magical;
        }

        /**
         * Legt den Wert der magical-Eigenschaft fest.
         * 
         */
        public void setMagical(int value) {
            this.magical = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Armor clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Armor clone = ((Unit.Armor) super.clone());
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.physical = this.getPhysical();
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.magical = this.getMagical();
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="damage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute ref="{http://clentfort.github.com/dota2/dota}damageType"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="projectileSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{http://clentfort.github.com/dota2/dota}attackCapabilitie"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "damage",
        "rate",
        "range",
        "projectileSpeed"
    })
    public static class Attack implements Cloneable
    {

        @XmlElement(required = true)
        protected Unit.Attack.Damage damage;
        protected double rate;
        protected int range;
        protected int projectileSpeed;
        @XmlAttribute(name = "attackCapabilitie", namespace = "http://clentfort.github.com/dota2/dota")
        protected String attackCapabilitie;

        /**
         * Creates a new {@code Attack} instance.
         * 
         */
        public Attack() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Attack} instance by deeply copying a given {@code Attack} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Attack(final Unit.Attack o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Attack' from 'null'.");
            }
            // CClassInfo: com.github.clentfort.dota2.dota.Unit$Attack$Damage
            this.damage = ((o.damage == null)?null:((o.getDamage() == null)?null:o.getDamage().clone()));
            // CBuiltinLeafInfo: java.lang.Double
            this.rate = o.getRate();
            // CBuiltinLeafInfo: java.lang.Integer
            this.range = o.getRange();
            // CBuiltinLeafInfo: java.lang.Integer
            this.projectileSpeed = o.getProjectileSpeed();
            // CBuiltinLeafInfo: java.lang.String
            this.attackCapabilitie = ((o.attackCapabilitie == null)?null:o.getAttackCapabilitie());
        }

        /**
         * Ruft den Wert der damage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Unit.Attack.Damage }
         *     
         */
        public Unit.Attack.Damage getDamage() {
            return damage;
        }

        /**
         * Legt den Wert der damage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Unit.Attack.Damage }
         *     
         */
        public void setDamage(Unit.Attack.Damage value) {
            this.damage = value;
        }

        /**
         * Ruft den Wert der rate-Eigenschaft ab.
         * 
         */
        public double getRate() {
            return rate;
        }

        /**
         * Legt den Wert der rate-Eigenschaft fest.
         * 
         */
        public void setRate(double value) {
            this.rate = value;
        }

        /**
         * Ruft den Wert der range-Eigenschaft ab.
         * 
         */
        public int getRange() {
            return range;
        }

        /**
         * Legt den Wert der range-Eigenschaft fest.
         * 
         */
        public void setRange(int value) {
            this.range = value;
        }

        /**
         * Ruft den Wert der projectileSpeed-Eigenschaft ab.
         * 
         */
        public int getProjectileSpeed() {
            return projectileSpeed;
        }

        /**
         * Legt den Wert der projectileSpeed-Eigenschaft fest.
         * 
         */
        public void setProjectileSpeed(int value) {
            this.projectileSpeed = value;
        }

        /**
         * Ruft den Wert der attackCapabilitie-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttackCapabilitie() {
            if (attackCapabilitie == null) {
                return "none";
            } else {
                return attackCapabilitie;
            }
        }

        /**
         * Legt den Wert der attackCapabilitie-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttackCapabilitie(String value) {
            this.attackCapabilitie = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Attack clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Attack clone = ((Unit.Attack) super.clone());
                    // CClassInfo: com.github.clentfort.dota2.dota.Unit$Attack$Damage
                    clone.damage = ((this.damage == null)?null:((this.getDamage() == null)?null:this.getDamage().clone()));
                    // CBuiltinLeafInfo: java.lang.Double
                    clone.rate = this.getRate();
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.range = this.getRange();
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.projectileSpeed = this.getProjectileSpeed();
                    // CBuiltinLeafInfo: java.lang.String
                    clone.attackCapabilitie = ((this.attackCapabilitie == null)?null:this.getAttackCapabilitie());
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute ref="{http://clentfort.github.com/dota2/dota}damageType"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "max",
            "min"
        })
        public static class Damage implements Cloneable
        {

            protected int max;
            protected int min;
            @XmlAttribute(name = "damageType", namespace = "http://clentfort.github.com/dota2/dota")
            protected String damageType;

            /**
             * Creates a new {@code Damage} instance.
             * 
             */
            public Damage() {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                super();
            }

            /**
             * Creates a new {@code Damage} instance by deeply copying a given {@code Damage} instance.
             * 
             * 
             * @param o
             *     The instance to copy.
             * @throws NullPointerException
             *     if {@code o} is {@code null}.
             */
            public Damage(final Unit.Attack.Damage o) {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                super();
                if (o == null) {
                    throw new NullPointerException("Cannot create a copy of 'Damage' from 'null'.");
                }
                // CBuiltinLeafInfo: java.lang.Integer
                this.max = o.getMax();
                // CBuiltinLeafInfo: java.lang.Integer
                this.min = o.getMin();
                // CBuiltinLeafInfo: java.lang.String
                this.damageType = ((o.damageType == null)?null:o.getDamageType());
            }

            /**
             * Ruft den Wert der max-Eigenschaft ab.
             * 
             */
            public int getMax() {
                return max;
            }

            /**
             * Legt den Wert der max-Eigenschaft fest.
             * 
             */
            public void setMax(int value) {
                this.max = value;
            }

            /**
             * Ruft den Wert der min-Eigenschaft ab.
             * 
             */
            public int getMin() {
                return min;
            }

            /**
             * Legt den Wert der min-Eigenschaft fest.
             * 
             */
            public void setMin(int value) {
                this.min = value;
            }

            /**
             * Ruft den Wert der damageType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDamageType() {
                if (damageType == null) {
                    return "physical";
                } else {
                    return damageType;
                }
            }

            /**
             * Legt den Wert der damageType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDamageType(String value) {
                this.damageType = value;
            }

            /**
             * Creates and returns a deep copy of this object.
             * 
             * 
             * @return
             *     A deep copy of this object.
             */
            @Override
            public Unit.Attack.Damage clone() {
                try {
                    {
                        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                        final Unit.Attack.Damage clone = ((Unit.Attack.Damage) super.clone());
                        // CBuiltinLeafInfo: java.lang.Integer
                        clone.max = this.getMax();
                        // CBuiltinLeafInfo: java.lang.Integer
                        clone.min = this.getMin();
                        // CBuiltinLeafInfo: java.lang.String
                        clone.damageType = ((this.damageType == null)?null:this.getDamageType());
                        return clone;
                    }
                } catch (CloneNotSupportedException e) {
                    // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                    throw new AssertionError(e);
                }
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="strength" type="{http://clentfort.github.com/dota2/dota}unitAttribute"/>
     *         &lt;element name="intelligence" type="{http://clentfort.github.com/dota2/dota}unitAttribute"/>
     *         &lt;element name="agility" type="{http://clentfort.github.com/dota2/dota}unitAttribute"/>
     *       &lt;/sequence>
     *       &lt;attribute name="primary" default="DOTA_ATTRIBUTE_STRENGTH">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DOTA_ATTRIBUTE_STRENGTH"/>
     *             &lt;enumeration value="DOTA_ATTRIBUTE_INTELLECT"/>
     *             &lt;enumeration value="DOTA_ATTRIBUTE_AGILITY"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "strength",
        "intelligence",
        "agility"
    })
    public static class Attributes implements Cloneable
    {

        @XmlElement(required = true)
        protected UnitAttribute strength;
        @XmlElement(required = true)
        protected UnitAttribute intelligence;
        @XmlElement(required = true)
        protected UnitAttribute agility;
        @XmlAttribute(name = "primary")
        protected String primary;

        /**
         * Creates a new {@code Attributes} instance.
         * 
         */
        public Attributes() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Attributes} instance by deeply copying a given {@code Attributes} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Attributes(final Unit.Attributes o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Attributes' from 'null'.");
            }
            // CClassInfo: com.github.clentfort.dota2.dota.UnitAttribute
            this.strength = ((o.strength == null)?null:((o.getStrength() == null)?null:o.getStrength().clone()));
            // CClassInfo: com.github.clentfort.dota2.dota.UnitAttribute
            this.intelligence = ((o.intelligence == null)?null:((o.getIntelligence() == null)?null:o.getIntelligence().clone()));
            // CClassInfo: com.github.clentfort.dota2.dota.UnitAttribute
            this.agility = ((o.agility == null)?null:((o.getAgility() == null)?null:o.getAgility().clone()));
            // CBuiltinLeafInfo: java.lang.String
            this.primary = ((o.primary == null)?null:o.getPrimary());
        }

        /**
         * Ruft den Wert der strength-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnitAttribute }
         *     
         */
        public UnitAttribute getStrength() {
            return strength;
        }

        /**
         * Legt den Wert der strength-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitAttribute }
         *     
         */
        public void setStrength(UnitAttribute value) {
            this.strength = value;
        }

        /**
         * Ruft den Wert der intelligence-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnitAttribute }
         *     
         */
        public UnitAttribute getIntelligence() {
            return intelligence;
        }

        /**
         * Legt den Wert der intelligence-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitAttribute }
         *     
         */
        public void setIntelligence(UnitAttribute value) {
            this.intelligence = value;
        }

        /**
         * Ruft den Wert der agility-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnitAttribute }
         *     
         */
        public UnitAttribute getAgility() {
            return agility;
        }

        /**
         * Legt den Wert der agility-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitAttribute }
         *     
         */
        public void setAgility(UnitAttribute value) {
            this.agility = value;
        }

        /**
         * Ruft den Wert der primary-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimary() {
            if (primary == null) {
                return "DOTA_ATTRIBUTE_STRENGTH";
            } else {
                return primary;
            }
        }

        /**
         * Legt den Wert der primary-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimary(String value) {
            this.primary = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Attributes clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Attributes clone = ((Unit.Attributes) super.clone());
                    // CClassInfo: com.github.clentfort.dota2.dota.UnitAttribute
                    clone.strength = ((this.strength == null)?null:((this.getStrength() == null)?null:this.getStrength().clone()));
                    // CClassInfo: com.github.clentfort.dota2.dota.UnitAttribute
                    clone.intelligence = ((this.intelligence == null)?null:((this.getIntelligence() == null)?null:this.getIntelligence().clone()));
                    // CClassInfo: com.github.clentfort.dota2.dota.UnitAttribute
                    clone.agility = ((this.agility == null)?null:((this.getAgility() == null)?null:this.getAgility().clone()));
                    // CBuiltinLeafInfo: java.lang.String
                    clone.primary = ((this.primary == null)?null:this.getPrimary());
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="xp" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="gold">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xp",
        "gold"
    })
    public static class Bounty implements Cloneable
    {

        protected int xp;
        @XmlElement(required = true)
        protected Unit.Bounty.Gold gold;

        /**
         * Creates a new {@code Bounty} instance.
         * 
         */
        public Bounty() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Bounty} instance by deeply copying a given {@code Bounty} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Bounty(final Unit.Bounty o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Bounty' from 'null'.");
            }
            // CBuiltinLeafInfo: java.lang.Integer
            this.xp = o.getXp();
            // CClassInfo: com.github.clentfort.dota2.dota.Unit$Bounty$Gold
            this.gold = ((o.gold == null)?null:((o.getGold() == null)?null:o.getGold().clone()));
        }

        /**
         * Ruft den Wert der xp-Eigenschaft ab.
         * 
         */
        public int getXp() {
            return xp;
        }

        /**
         * Legt den Wert der xp-Eigenschaft fest.
         * 
         */
        public void setXp(int value) {
            this.xp = value;
        }

        /**
         * Ruft den Wert der gold-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Unit.Bounty.Gold }
         *     
         */
        public Unit.Bounty.Gold getGold() {
            return gold;
        }

        /**
         * Legt den Wert der gold-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Unit.Bounty.Gold }
         *     
         */
        public void setGold(Unit.Bounty.Gold value) {
            this.gold = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Bounty clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Bounty clone = ((Unit.Bounty) super.clone());
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.xp = this.getXp();
                    // CClassInfo: com.github.clentfort.dota2.dota.Unit$Bounty$Gold
                    clone.gold = ((this.gold == null)?null:((this.getGold() == null)?null:this.getGold().clone()));
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "max",
            "min"
        })
        public static class Gold implements Cloneable
        {

            protected int max;
            protected int min;

            /**
             * Creates a new {@code Gold} instance.
             * 
             */
            public Gold() {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                super();
            }

            /**
             * Creates a new {@code Gold} instance by deeply copying a given {@code Gold} instance.
             * 
             * 
             * @param o
             *     The instance to copy.
             * @throws NullPointerException
             *     if {@code o} is {@code null}.
             */
            public Gold(final Unit.Bounty.Gold o) {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                super();
                if (o == null) {
                    throw new NullPointerException("Cannot create a copy of 'Gold' from 'null'.");
                }
                // CBuiltinLeafInfo: java.lang.Integer
                this.max = o.getMax();
                // CBuiltinLeafInfo: java.lang.Integer
                this.min = o.getMin();
            }

            /**
             * Ruft den Wert der max-Eigenschaft ab.
             * 
             */
            public int getMax() {
                return max;
            }

            /**
             * Legt den Wert der max-Eigenschaft fest.
             * 
             */
            public void setMax(int value) {
                this.max = value;
            }

            /**
             * Ruft den Wert der min-Eigenschaft ab.
             * 
             */
            public int getMin() {
                return min;
            }

            /**
             * Legt den Wert der min-Eigenschaft fest.
             * 
             */
            public void setMin(int value) {
                this.min = value;
            }

            /**
             * Creates and returns a deep copy of this object.
             * 
             * 
             * @return
             *     A deep copy of this object.
             */
            @Override
            public Unit.Bounty.Gold clone() {
                try {
                    {
                        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                        final Unit.Bounty.Gold clone = ((Unit.Bounty.Gold) super.clone());
                        // CBuiltinLeafInfo: java.lang.Integer
                        clone.max = this.getMax();
                        // CBuiltinLeafInfo: java.lang.Integer
                        clone.min = this.getMin();
                        return clone;
                    }
                } catch (CloneNotSupportedException e) {
                    // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                    throw new AssertionError(e);
                }
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="turnRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "speed",
        "turnRate"
    })
    public static class Movement implements Cloneable
    {

        protected int speed;
        protected double turnRate;

        /**
         * Creates a new {@code Movement} instance.
         * 
         */
        public Movement() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Movement} instance by deeply copying a given {@code Movement} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Movement(final Unit.Movement o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Movement' from 'null'.");
            }
            // CBuiltinLeafInfo: java.lang.Integer
            this.speed = o.getSpeed();
            // CBuiltinLeafInfo: java.lang.Double
            this.turnRate = o.getTurnRate();
        }

        /**
         * Ruft den Wert der speed-Eigenschaft ab.
         * 
         */
        public int getSpeed() {
            return speed;
        }

        /**
         * Legt den Wert der speed-Eigenschaft fest.
         * 
         */
        public void setSpeed(int value) {
            this.speed = value;
        }

        /**
         * Ruft den Wert der turnRate-Eigenschaft ab.
         * 
         */
        public double getTurnRate() {
            return turnRate;
        }

        /**
         * Legt den Wert der turnRate-Eigenschaft fest.
         * 
         */
        public void setTurnRate(double value) {
            this.turnRate = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Movement clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Movement clone = ((Unit.Movement) super.clone());
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.speed = this.getSpeed();
                    // CBuiltinLeafInfo: java.lang.Double
                    clone.turnRate = this.getTurnRate();
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="health" type="{http://clentfort.github.com/dota2/dota}unitStatus"/>
     *         &lt;element name="mana" type="{http://clentfort.github.com/dota2/dota}unitStatus"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "health",
        "mana"
    })
    public static class Stats implements Cloneable
    {

        @XmlElement(required = true)
        protected UnitStatus health;
        @XmlElement(required = true)
        protected UnitStatus mana;

        /**
         * Creates a new {@code Stats} instance.
         * 
         */
        public Stats() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Stats} instance by deeply copying a given {@code Stats} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Stats(final Unit.Stats o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Stats' from 'null'.");
            }
            // CClassInfo: com.github.clentfort.dota2.dota.UnitStatus
            this.health = ((o.health == null)?null:((o.getHealth() == null)?null:o.getHealth().clone()));
            // CClassInfo: com.github.clentfort.dota2.dota.UnitStatus
            this.mana = ((o.mana == null)?null:((o.getMana() == null)?null:o.getMana().clone()));
        }

        /**
         * Ruft den Wert der health-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnitStatus }
         *     
         */
        public UnitStatus getHealth() {
            return health;
        }

        /**
         * Legt den Wert der health-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitStatus }
         *     
         */
        public void setHealth(UnitStatus value) {
            this.health = value;
        }

        /**
         * Ruft den Wert der mana-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnitStatus }
         *     
         */
        public UnitStatus getMana() {
            return mana;
        }

        /**
         * Legt den Wert der mana-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitStatus }
         *     
         */
        public void setMana(UnitStatus value) {
            this.mana = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Stats clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Stats clone = ((Unit.Stats) super.clone());
                    // CClassInfo: com.github.clentfort.dota2.dota.UnitStatus
                    clone.health = ((this.health == null)?null:((this.getHealth() == null)?null:this.getHealth().clone()));
                    // CClassInfo: com.github.clentfort.dota2.dota.UnitStatus
                    clone.mana = ((this.mana == null)?null:((this.getMana() == null)?null:this.getMana().clone()));
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="night" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "day",
        "night"
    })
    public static class Vision implements Cloneable
    {

        protected int day;
        protected int night;

        /**
         * Creates a new {@code Vision} instance.
         * 
         */
        public Vision() {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
        }

        /**
         * Creates a new {@code Vision} instance by deeply copying a given {@code Vision} instance.
         * 
         * 
         * @param o
         *     The instance to copy.
         * @throws NullPointerException
         *     if {@code o} is {@code null}.
         */
        public Vision(final Unit.Vision o) {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            super();
            if (o == null) {
                throw new NullPointerException("Cannot create a copy of 'Vision' from 'null'.");
            }
            // CBuiltinLeafInfo: java.lang.Integer
            this.day = o.getDay();
            // CBuiltinLeafInfo: java.lang.Integer
            this.night = o.getNight();
        }

        /**
         * Ruft den Wert der day-Eigenschaft ab.
         * 
         */
        public int getDay() {
            return day;
        }

        /**
         * Legt den Wert der day-Eigenschaft fest.
         * 
         */
        public void setDay(int value) {
            this.day = value;
        }

        /**
         * Ruft den Wert der night-Eigenschaft ab.
         * 
         */
        public int getNight() {
            return night;
        }

        /**
         * Legt den Wert der night-Eigenschaft fest.
         * 
         */
        public void setNight(int value) {
            this.night = value;
        }

        /**
         * Creates and returns a deep copy of this object.
         * 
         * 
         * @return
         *     A deep copy of this object.
         */
        @Override
        public Unit.Vision clone() {
            try {
                {
                    // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                    final Unit.Vision clone = ((Unit.Vision) super.clone());
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.day = this.getDay();
                    // CBuiltinLeafInfo: java.lang.Integer
                    clone.night = this.getNight();
                    return clone;
                }
            } catch (CloneNotSupportedException e) {
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError(e);
            }
        }

    }

}
