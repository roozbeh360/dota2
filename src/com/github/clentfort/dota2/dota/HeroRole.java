//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.04 um 11:53:55 AM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für heroRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="heroRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Carry"/>
 *     &lt;enumeration value="Initiator"/>
 *     &lt;enumeration value="Ganker"/>
 *     &lt;enumeration value="Support"/>
 *     &lt;enumeration value="Pusher"/>
 *     &lt;enumeration value="Tank"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "heroRole")
@XmlEnum
public enum HeroRole {

    @XmlEnumValue("Carry")
    CARRY("Carry"),
    @XmlEnumValue("Initiator")
    INITIATOR("Initiator"),
    @XmlEnumValue("Ganker")
    GANKER("Ganker"),
    @XmlEnumValue("Support")
    SUPPORT("Support"),
    @XmlEnumValue("Pusher")
    PUSHER("Pusher"),
    @XmlEnumValue("Tank")
    TANK("Tank");
    private final String value;

    HeroRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeroRole fromValue(String v) {
        for (HeroRole c: HeroRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
