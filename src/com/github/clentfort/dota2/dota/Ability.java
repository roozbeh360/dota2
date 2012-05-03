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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ability complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://clentfort.github.com/dota2/dota}abilityType"/>
 *         &lt;element name="behavior" type="{http://clentfort.github.com/dota2/dota}abilityBehavior"/>
 *         &lt;element name="castRange" type="{http://clentfort.github.com/dota2/dota}abilityLevelBasedType" maxOccurs="4"/>
 *         &lt;element name="channelTime" type="{http://clentfort.github.com/dota2/dota}abilityLevelBasedType" maxOccurs="4"/>
 *         &lt;element name="cooldown" type="{http://clentfort.github.com/dota2/dota}abilityLevelBasedType" maxOccurs="4"/>
 *         &lt;element name="duration" type="{http://clentfort.github.com/dota2/dota}abilityLevelBasedType" maxOccurs="4"/>
 *         &lt;element name="damage" type="{http://clentfort.github.com/dota2/dota}abilityLevelBasedType" maxOccurs="4"/>
 *         &lt;element name="manacost" type="{http://clentfort.github.com/dota2/dota}abilityLevelBasedType" maxOccurs="4"/>
 *         &lt;element name="special" type="{http://clentfort.github.com/dota2/dota}abilitySpecial" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ability", propOrder = {
    "name",
    "type",
    "behavior",
    "castRange",
    "channelTime",
    "cooldown",
    "duration",
    "damage",
    "manacost",
    "special"
})
@XmlSeeAlso({
    Item.class
})
public class Ability implements Cloneable
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String behavior;
    @XmlElement(required = true)
    protected List<AbilityLevelBasedType> castRange;
    @XmlElement(required = true)
    protected List<AbilityLevelBasedType> channelTime;
    @XmlElement(required = true)
    protected List<AbilityLevelBasedType> cooldown;
    @XmlElement(required = true)
    protected List<AbilityLevelBasedType> duration;
    @XmlElement(required = true)
    protected List<AbilityLevelBasedType> damage;
    @XmlElement(required = true)
    protected List<AbilityLevelBasedType> manacost;
    @XmlElement(required = true)
    protected List<AbilitySpecial> special;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Creates a new {@code Ability} instance.
     * 
     */
    public Ability() {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
    }

    /**
     * Creates a new {@code Ability} instance by deeply copying a given {@code Ability} instance.
     * 
     * 
     * @param o
     *     The instance to copy.
     * @throws NullPointerException
     *     if {@code o} is {@code null}.
     */
    public Ability(final Ability o) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
        if (o == null) {
            throw new NullPointerException("Cannot create a copy of 'Ability' from 'null'.");
        }
        // CBuiltinLeafInfo: java.lang.String
        this.name = ((o.name == null)?null:o.getName());
        // CBuiltinLeafInfo: java.lang.String
        this.type = ((o.type == null)?null:o.getType());
        // CBuiltinLeafInfo: java.lang.String
        this.behavior = ((o.behavior == null)?null:o.getBehavior());
        // 'CastRange' collection.
        if (o.castRange!= null) {
            copyCastRange(o.getCastRange(), this.getCastRange());
        }
        // 'ChannelTime' collection.
        if (o.channelTime!= null) {
            copyChannelTime(o.getChannelTime(), this.getChannelTime());
        }
        // 'Cooldown' collection.
        if (o.cooldown!= null) {
            copyCooldown(o.getCooldown(), this.getCooldown());
        }
        // 'Duration' collection.
        if (o.duration!= null) {
            copyDuration(o.getDuration(), this.getDuration());
        }
        // 'Damage' collection.
        if (o.damage!= null) {
            copyDamage(o.getDamage(), this.getDamage());
        }
        // 'Manacost' collection.
        if (o.manacost!= null) {
            copyManacost(o.getManacost(), this.getManacost());
        }
        // 'Special' collection.
        if (o.special!= null) {
            copySpecial(o.getSpecial(), this.getSpecial());
        }
        // CBuiltinLeafInfo: java.lang.String
        this.id = ((o.id == null)?null:o.getId());
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der behavior-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehavior() {
        return behavior;
    }

    /**
     * Legt den Wert der behavior-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehavior(String value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the castRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the castRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCastRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityLevelBasedType }
     * 
     * 
     */
    public List<AbilityLevelBasedType> getCastRange() {
        if (castRange == null) {
            castRange = new ArrayList<AbilityLevelBasedType>();
        }
        return this.castRange;
    }

    /**
     * Gets the value of the channelTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityLevelBasedType }
     * 
     * 
     */
    public List<AbilityLevelBasedType> getChannelTime() {
        if (channelTime == null) {
            channelTime = new ArrayList<AbilityLevelBasedType>();
        }
        return this.channelTime;
    }

    /**
     * Gets the value of the cooldown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cooldown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCooldown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityLevelBasedType }
     * 
     * 
     */
    public List<AbilityLevelBasedType> getCooldown() {
        if (cooldown == null) {
            cooldown = new ArrayList<AbilityLevelBasedType>();
        }
        return this.cooldown;
    }

    /**
     * Gets the value of the duration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityLevelBasedType }
     * 
     * 
     */
    public List<AbilityLevelBasedType> getDuration() {
        if (duration == null) {
            duration = new ArrayList<AbilityLevelBasedType>();
        }
        return this.duration;
    }

    /**
     * Gets the value of the damage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityLevelBasedType }
     * 
     * 
     */
    public List<AbilityLevelBasedType> getDamage() {
        if (damage == null) {
            damage = new ArrayList<AbilityLevelBasedType>();
        }
        return this.damage;
    }

    /**
     * Gets the value of the manacost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manacost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManacost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityLevelBasedType }
     * 
     * 
     */
    public List<AbilityLevelBasedType> getManacost() {
        if (manacost == null) {
            manacost = new ArrayList<AbilityLevelBasedType>();
        }
        return this.manacost;
    }

    /**
     * Gets the value of the special property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the special property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilitySpecial }
     * 
     * 
     */
    public List<AbilitySpecial> getSpecial() {
        if (special == null) {
            special = new ArrayList<AbilitySpecial>();
        }
        return this.special;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Copies all values of property {@code CastRange} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copyCastRange(final List<AbilityLevelBasedType> source, final List<AbilityLevelBasedType> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilityLevelBasedType) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilityLevelBasedType
                    target.add(((AbilityLevelBasedType) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'CastRange' of class 'com.github.clentfort.dota2.dota.Ability'."));
            }
        }
    }

    /**
     * Copies all values of property {@code ChannelTime} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copyChannelTime(final List<AbilityLevelBasedType> source, final List<AbilityLevelBasedType> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilityLevelBasedType) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilityLevelBasedType
                    target.add(((AbilityLevelBasedType) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'ChannelTime' of class 'com.github.clentfort.dota2.dota.Ability'."));
            }
        }
    }

    /**
     * Copies all values of property {@code Cooldown} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copyCooldown(final List<AbilityLevelBasedType> source, final List<AbilityLevelBasedType> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilityLevelBasedType) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilityLevelBasedType
                    target.add(((AbilityLevelBasedType) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'Cooldown' of class 'com.github.clentfort.dota2.dota.Ability'."));
            }
        }
    }

    /**
     * Copies all values of property {@code Duration} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copyDuration(final List<AbilityLevelBasedType> source, final List<AbilityLevelBasedType> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilityLevelBasedType) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilityLevelBasedType
                    target.add(((AbilityLevelBasedType) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'Duration' of class 'com.github.clentfort.dota2.dota.Ability'."));
            }
        }
    }

    /**
     * Copies all values of property {@code Damage} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copyDamage(final List<AbilityLevelBasedType> source, final List<AbilityLevelBasedType> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilityLevelBasedType) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilityLevelBasedType
                    target.add(((AbilityLevelBasedType) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'Damage' of class 'com.github.clentfort.dota2.dota.Ability'."));
            }
        }
    }

    /**
     * Copies all values of property {@code Manacost} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copyManacost(final List<AbilityLevelBasedType> source, final List<AbilityLevelBasedType> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilityLevelBasedType) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilityLevelBasedType
                    target.add(((AbilityLevelBasedType) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'Manacost' of class 'com.github.clentfort.dota2.dota.Ability'."));
            }
        }
    }

    /**
     * Copies all values of property {@code Special} deeply.
     * 
     * @param source
     *     The source to copy from.
     * @param target
     *     The target to copy {@code source} to.
     * @throws NullPointerException
     *     if {@code target} is {@code null}.
     */
    @SuppressWarnings("unchecked")
    private static void copySpecial(final List<AbilitySpecial> source, final List<AbilitySpecial> target) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        if ((source!= null)&&(!source.isEmpty())) {
            for (final Iterator<?> it = source.iterator(); it.hasNext(); ) {
                final Object next = it.next();
                if (next instanceof AbilitySpecial) {
                    // CClassInfo: com.github.clentfort.dota2.dota.AbilitySpecial
                    target.add(((AbilitySpecial) next).clone());
                    continue;
                }
                // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
                throw new AssertionError((("Unexpected instance '"+ next)+"' for property 'Special' of class 'com.github.clentfort.dota2.dota.Ability'."));
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
    public Ability clone() {
        try {
            {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                final Ability clone = ((Ability) super.clone());
                // CBuiltinLeafInfo: java.lang.String
                clone.name = ((this.name == null)?null:this.getName());
                // CBuiltinLeafInfo: java.lang.String
                clone.type = ((this.type == null)?null:this.getType());
                // CBuiltinLeafInfo: java.lang.String
                clone.behavior = ((this.behavior == null)?null:this.getBehavior());
                // 'CastRange' collection.
                if (this.castRange!= null) {
                    clone.castRange = null;
                    copyCastRange(this.getCastRange(), clone.getCastRange());
                }
                // 'ChannelTime' collection.
                if (this.channelTime!= null) {
                    clone.channelTime = null;
                    copyChannelTime(this.getChannelTime(), clone.getChannelTime());
                }
                // 'Cooldown' collection.
                if (this.cooldown!= null) {
                    clone.cooldown = null;
                    copyCooldown(this.getCooldown(), clone.getCooldown());
                }
                // 'Duration' collection.
                if (this.duration!= null) {
                    clone.duration = null;
                    copyDuration(this.getDuration(), clone.getDuration());
                }
                // 'Damage' collection.
                if (this.damage!= null) {
                    clone.damage = null;
                    copyDamage(this.getDamage(), clone.getDamage());
                }
                // 'Manacost' collection.
                if (this.manacost!= null) {
                    clone.manacost = null;
                    copyManacost(this.getManacost(), clone.getManacost());
                }
                // 'Special' collection.
                if (this.special!= null) {
                    clone.special = null;
                    copySpecial(this.getSpecial(), clone.getSpecial());
                }
                // CBuiltinLeafInfo: java.lang.String
                clone.id = ((this.id == null)?null:this.getId());
                return clone;
            }
        } catch (CloneNotSupportedException e) {
            // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
            throw new AssertionError(e);
        }
    }

}
