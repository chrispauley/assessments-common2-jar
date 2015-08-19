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
 * <p>Java class for NameTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="CurrentName"/>
 *     &lt;enumeration value="FormerName"/>
 *     &lt;enumeration value="BirthName"/>
 *     &lt;enumeration value="Alias"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum NameTypeCodeEnumType {

    @XmlEnumValue("CurrentName")
    CURRENT_NAME("CurrentName"),
    @XmlEnumValue("FormerName")
    FORMER_NAME("FormerName"),
    @XmlEnumValue("BirthName")
    BIRTH_NAME("BirthName"),
    @XmlEnumValue("Alias")
    ALIAS("Alias");
    private final String value;

    NameTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTypeCodeEnumType fromValue(String v) {
        for (NameTypeCodeEnumType c: NameTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
