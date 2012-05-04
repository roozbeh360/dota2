//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.04 um 11:53:55 AM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für abilityLevelBasedType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="abilityLevelBasedType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abilityLevelBasedType", propOrder = {
    "value"
})
public class AbilityLevelBasedType implements Cloneable
{

    @XmlValue
    protected double value;
    @XmlAttribute(name = "level", required = true)
    protected int level;

    /**
     * Creates a new {@code AbilityLevelBasedType} instance.
     * 
     */
    public AbilityLevelBasedType() {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
    }

    /**
     * Creates a new {@code AbilityLevelBasedType} instance by deeply copying a given {@code AbilityLevelBasedType} instance.
     * 
     * 
     * @param o
     *     The instance to copy.
     * @throws NullPointerException
     *     if {@code o} is {@code null}.
     */
    public AbilityLevelBasedType(final AbilityLevelBasedType o) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
        if (o == null) {
            throw new NullPointerException("Cannot create a copy of 'AbilityLevelBasedType' from 'null'.");
        }
        // CBuiltinLeafInfo: java.lang.Double
        this.value = o.getValue();
        // CBuiltinLeafInfo: java.lang.Integer
        this.level = o.getLevel();
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     */
    public void setValue(double value) {
        this.value = value;
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
     * Creates and returns a deep copy of this object.
     * 
     * 
     * @return
     *     A deep copy of this object.
     */
    @Override
    public AbilityLevelBasedType clone() {
        try {
            {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                final AbilityLevelBasedType clone = ((AbilityLevelBasedType) super.clone());
                // CBuiltinLeafInfo: java.lang.Double
                clone.value = this.getValue();
                // CBuiltinLeafInfo: java.lang.Integer
                clone.level = this.getLevel();
                return clone;
            }
        } catch (CloneNotSupportedException e) {
            // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
            throw new AssertionError(e);
        }
    }

}
