//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:08:51 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicationCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicationCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Article"/>
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicationCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum PublicationCodeEnumType {

    @XmlEnumValue("Article")
    ARTICLE("Article"),
    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PublicationCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicationCodeEnumType fromValue(String v) {
        for (PublicationCodeEnumType c: PublicationCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}