//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.04 um 01:48:36 PM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clentfort.github.com/dota2/dota}ability">
 *       &lt;sequence>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initialCharges" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="combineable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permanent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stackable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recipe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="droppable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="purchasable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sellable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requiresCharges" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="killable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disassemblable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shareability" type="{http://clentfort.github.com/dota2/dota}itemShareability"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "cost",
    "initialCharges",
    "combineable",
    "permanent",
    "stackable",
    "recipe",
    "droppable",
    "purchasable",
    "sellable",
    "requiresCharges",
    "killable",
    "disassemblable",
    "shareability"
})
public class Item
    extends Ability
    implements Cloneable
{

    protected int cost;
    protected int initialCharges;
    protected boolean combineable;
    protected boolean permanent;
    protected boolean stackable;
    protected boolean recipe;
    protected boolean droppable;
    protected boolean purchasable;
    protected boolean sellable;
    protected boolean requiresCharges;
    protected boolean killable;
    protected boolean disassemblable;
    @XmlElement(required = true)
    protected String shareability;

    /**
     * Creates a new {@code Item} instance.
     * 
     */
    public Item() {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super();
    }

    /**
     * Creates a new {@code Item} instance by deeply copying a given {@code Ability} instance.
     * 
     * 
     * @param o
     *     The instance to copy.
     * @throws NullPointerException
     *     if {@code o} is {@code null}.
     */
    public Item(final Ability o) {
        // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
        super(o);
        if (o == null) {
            throw new NullPointerException("Cannot create a copy of 'Item' from 'null'.");
        }
        if (o instanceof Item) {
            // CBuiltinLeafInfo: java.lang.Integer
            this.cost = ((Item) o).getCost();
            // CBuiltinLeafInfo: java.lang.Integer
            this.initialCharges = ((Item) o).getInitialCharges();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.combineable = ((Item) o).isCombineable();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.permanent = ((Item) o).isPermanent();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.stackable = ((Item) o).isStackable();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.recipe = ((Item) o).isRecipe();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.droppable = ((Item) o).isDroppable();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.purchasable = ((Item) o).isPurchasable();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.sellable = ((Item) o).isSellable();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.requiresCharges = ((Item) o).isRequiresCharges();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.killable = ((Item) o).isKillable();
            // CBuiltinLeafInfo: java.lang.Boolean
            this.disassemblable = ((Item) o).isDisassemblable();
            // CBuiltinLeafInfo: java.lang.String
            this.shareability = ((((Item) o).shareability == null)?null:((Item) o).getShareability());
        }
    }

    /**
     * Ruft den Wert der cost-Eigenschaft ab.
     * 
     */
    public int getCost() {
        return cost;
    }

    /**
     * Legt den Wert der cost-Eigenschaft fest.
     * 
     */
    public void setCost(int value) {
        this.cost = value;
    }

    /**
     * Ruft den Wert der initialCharges-Eigenschaft ab.
     * 
     */
    public int getInitialCharges() {
        return initialCharges;
    }

    /**
     * Legt den Wert der initialCharges-Eigenschaft fest.
     * 
     */
    public void setInitialCharges(int value) {
        this.initialCharges = value;
    }

    /**
     * Ruft den Wert der combineable-Eigenschaft ab.
     * 
     */
    public boolean isCombineable() {
        return combineable;
    }

    /**
     * Legt den Wert der combineable-Eigenschaft fest.
     * 
     */
    public void setCombineable(boolean value) {
        this.combineable = value;
    }

    /**
     * Ruft den Wert der permanent-Eigenschaft ab.
     * 
     */
    public boolean isPermanent() {
        return permanent;
    }

    /**
     * Legt den Wert der permanent-Eigenschaft fest.
     * 
     */
    public void setPermanent(boolean value) {
        this.permanent = value;
    }

    /**
     * Ruft den Wert der stackable-Eigenschaft ab.
     * 
     */
    public boolean isStackable() {
        return stackable;
    }

    /**
     * Legt den Wert der stackable-Eigenschaft fest.
     * 
     */
    public void setStackable(boolean value) {
        this.stackable = value;
    }

    /**
     * Ruft den Wert der recipe-Eigenschaft ab.
     * 
     */
    public boolean isRecipe() {
        return recipe;
    }

    /**
     * Legt den Wert der recipe-Eigenschaft fest.
     * 
     */
    public void setRecipe(boolean value) {
        this.recipe = value;
    }

    /**
     * Ruft den Wert der droppable-Eigenschaft ab.
     * 
     */
    public boolean isDroppable() {
        return droppable;
    }

    /**
     * Legt den Wert der droppable-Eigenschaft fest.
     * 
     */
    public void setDroppable(boolean value) {
        this.droppable = value;
    }

    /**
     * Ruft den Wert der purchasable-Eigenschaft ab.
     * 
     */
    public boolean isPurchasable() {
        return purchasable;
    }

    /**
     * Legt den Wert der purchasable-Eigenschaft fest.
     * 
     */
    public void setPurchasable(boolean value) {
        this.purchasable = value;
    }

    /**
     * Ruft den Wert der sellable-Eigenschaft ab.
     * 
     */
    public boolean isSellable() {
        return sellable;
    }

    /**
     * Legt den Wert der sellable-Eigenschaft fest.
     * 
     */
    public void setSellable(boolean value) {
        this.sellable = value;
    }

    /**
     * Ruft den Wert der requiresCharges-Eigenschaft ab.
     * 
     */
    public boolean isRequiresCharges() {
        return requiresCharges;
    }

    /**
     * Legt den Wert der requiresCharges-Eigenschaft fest.
     * 
     */
    public void setRequiresCharges(boolean value) {
        this.requiresCharges = value;
    }

    /**
     * Ruft den Wert der killable-Eigenschaft ab.
     * 
     */
    public boolean isKillable() {
        return killable;
    }

    /**
     * Legt den Wert der killable-Eigenschaft fest.
     * 
     */
    public void setKillable(boolean value) {
        this.killable = value;
    }

    /**
     * Ruft den Wert der disassemblable-Eigenschaft ab.
     * 
     */
    public boolean isDisassemblable() {
        return disassemblable;
    }

    /**
     * Legt den Wert der disassemblable-Eigenschaft fest.
     * 
     */
    public void setDisassemblable(boolean value) {
        this.disassemblable = value;
    }

    /**
     * Ruft den Wert der shareability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareability() {
        return shareability;
    }

    /**
     * Legt den Wert der shareability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareability(String value) {
        this.shareability = value;
    }

    /**
     * Creates and returns a deep copy of this object.
     * 
     * 
     * @return
     *     A deep copy of this object.
     */
    @Override
    public Item clone() {
        {
            // CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
            final Item clone = ((Item) super.clone());
            // CBuiltinLeafInfo: java.lang.Integer
            clone.cost = this.getCost();
            // CBuiltinLeafInfo: java.lang.Integer
            clone.initialCharges = this.getInitialCharges();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.combineable = this.isCombineable();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.permanent = this.isPermanent();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.stackable = this.isStackable();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.recipe = this.isRecipe();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.droppable = this.isDroppable();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.purchasable = this.isPurchasable();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.sellable = this.isSellable();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.requiresCharges = this.isRequiresCharges();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.killable = this.isKillable();
            // CBuiltinLeafInfo: java.lang.Boolean
            clone.disassemblable = this.isDisassemblable();
            // CBuiltinLeafInfo: java.lang.String
            clone.shareability = ((this.shareability == null)?null:this.getShareability());
            return clone;
        }
    }

}
