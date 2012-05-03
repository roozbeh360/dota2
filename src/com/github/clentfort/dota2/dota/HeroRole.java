//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.05.03 um 10:14:43 PM CEST 
//


package com.github.clentfort.dota2.dota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r heroRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="heroRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carry"/>
 *     &lt;enumeration value="initiator"/>
 *     &lt;enumeration value="ganker"/>
 *     &lt;enumeration value="support"/>
 *     &lt;enumeration value="pusher"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "heroRole")
@XmlEnum
public enum HeroRole {

    @XmlEnumValue("carry")
    CARRY("carry"),
    @XmlEnumValue("initiator")
    INITIATOR("initiator"),
    @XmlEnumValue("ganker")
    GANKER("ganker"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("pusher")
    PUSHER("pusher");
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
