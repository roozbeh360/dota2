//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.30 at 10:05:02 PM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unitStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regeneration" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
public class UnitStatus {

    protected int base;
    protected float regeneration;

    /**
     * Gets the value of the base property.
     * 
     */
    public int getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     */
    public void setBase(int value) {
        this.base = value;
    }

    /**
     * Gets the value of the regeneration property.
     * 
     */
    public float getRegeneration() {
        return regeneration;
    }

    /**
     * Sets the value of the regeneration property.
     * 
     */
    public void setRegeneration(float value) {
        this.regeneration = value;
    }

}