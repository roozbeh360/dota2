//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.04 um 11:53:55 AM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für hero complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="hero">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clentfort.github.com/dota2/dota}unit">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="role" type="{http://clentfort.github.com/dota2/dota}heroRole"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hero", propOrder = {
    "id",
    "alias",
    "role"
})
public class Hero
    extends Unit
    implements Cloneable
{

    protected int id;
    @XmlElement(required = true)
    protected String alias;
    @XmlElement(required = true)
    protected HeroRole role;

    /**
     * Creates a new {@code Hero} instance.
     * 
     */
    public Hero() {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
    }

    /**
     * Creates a new {@code Hero} instance by deeply copying a given {@code Unit} instance.
     * 
     * 
     * @param o
     *     The instance to copy.
     * @throws NullPointerException
     *     if {@code o} is {@code null}.
     */
    public Hero(final Unit o) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super(o);
        if (o == null) {
            throw new NullPointerException("Cannot create a copy of 'Hero' from 'null'.");
        }
        if (o instanceof Hero) {
            // CBuiltinLeafInfo: java.lang.Integer
            this.id = ((Hero) o).getId();
            // CBuiltinLeafInfo: java.lang.String
            this.alias = ((((Hero) o).alias == null)?null:((Hero) o).getAlias());
            // CEnumLeafInfo: com.github.clentfort.dota2.dota.HeroRole
            this.role = ((((Hero) o).role == null)?null:((Hero) o).getRole());
        }
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der alias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Legt den Wert der alias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeroRole }
     *     
     */
    public HeroRole getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeroRole }
     *     
     */
    public void setRole(HeroRole value) {
        this.role = value;
    }

    /**
     * Creates and returns a deep copy of this object.
     * 
     * 
     * @return
     *     A deep copy of this object.
     */
    @Override
    public Hero clone() {
        {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            final Hero clone = ((Hero) super.clone());
            // CBuiltinLeafInfo: java.lang.Integer
            clone.id = this.getId();
            // CBuiltinLeafInfo: java.lang.String
            clone.alias = ((this.alias == null)?null:this.getAlias());
            // CEnumLeafInfo: com.github.clentfort.dota2.dota.HeroRole
            clone.role = ((this.role == null)?null:this.getRole());
            return clone;
        }
    }

}
