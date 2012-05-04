//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.04 um 11:53:55 AM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für unitStatus complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="unitStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regeneration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitStatus", propOrder = {
    "base",
    "regeneration"
})
public class UnitStatus implements Cloneable
{

    protected int base;
    protected double regeneration;

    /**
     * Creates a new {@code UnitStatus} instance.
     * 
     */
    public UnitStatus() {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
    }

    /**
     * Creates a new {@code UnitStatus} instance by deeply copying a given {@code UnitStatus} instance.
     * 
     * 
     * @param o
     *     The instance to copy.
     * @throws NullPointerException
     *     if {@code o} is {@code null}.
     */
    public UnitStatus(final UnitStatus o) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
        if (o == null) {
            throw new NullPointerException("Cannot create a copy of 'UnitStatus' from 'null'.");
        }
        // CBuiltinLeafInfo: java.lang.Integer
        this.base = o.getBase();
        // CBuiltinLeafInfo: java.lang.Double
        this.regeneration = o.getRegeneration();
    }

    /**
     * Ruft den Wert der base-Eigenschaft ab.
     * 
     */
    public int getBase() {
        return base;
    }

    /**
     * Legt den Wert der base-Eigenschaft fest.
     * 
     */
    public void setBase(int value) {
        this.base = value;
    }

    /**
     * Ruft den Wert der regeneration-Eigenschaft ab.
     * 
     */
    public double getRegeneration() {
        return regeneration;
    }

    /**
     * Legt den Wert der regeneration-Eigenschaft fest.
     * 
     */
    public void setRegeneration(double value) {
        this.regeneration = value;
    }

    /**
     * Creates and returns a deep copy of this object.
     * 
     * 
     * @return
     *     A deep copy of this object.
     */
    @Override
    public UnitStatus clone() {
        try {
            {
                // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
                final UnitStatus clone = ((UnitStatus) super.clone());
                // CBuiltinLeafInfo: java.lang.Integer
                clone.base = this.getBase();
                // CBuiltinLeafInfo: java.lang.Double
                clone.regeneration = this.getRegeneration();
                return clone;
            }
        } catch (CloneNotSupportedException e) {
            // Please report this at https://apps.sourceforge.net/mantisbt/ccxjc/
            throw new AssertionError(e);
        }
    }

}
