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
 * <p>Java class for InsuranceTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="Dental"/>
 *     &lt;enumeration value="Vision"/>
 *     &lt;enumeration value="Life"/>
 *     &lt;enumeration value="ShortTermDisability"/>
 *     &lt;enumeration value="LongTermDisability"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsuranceTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum InsuranceTypeCodeEnumType {

    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Dental")
    DENTAL("Dental"),
    @XmlEnumValue("Vision")
    VISION("Vision"),
    @XmlEnumValue("Life")
    LIFE("Life"),
    @XmlEnumValue("ShortTermDisability")
    SHORT_TERM_DISABILITY("ShortTermDisability"),
    @XmlEnumValue("LongTermDisability")
    LONG_TERM_DISABILITY("LongTermDisability");
    private final String value;

    InsuranceTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceTypeCodeEnumType fromValue(String v) {
        for (InsuranceTypeCodeEnumType c: InsuranceTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}