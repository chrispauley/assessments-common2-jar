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
 * <p>Java class for LearningObjectUseCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LearningObjectUseCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Recommended"/>
 *     &lt;enumeration value="RequiredOrEquivalent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LearningObjectUseCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum LearningObjectUseCodeEnumType {

    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Recommended")
    RECOMMENDED("Recommended"),
    @XmlEnumValue("RequiredOrEquivalent")
    REQUIRED_OR_EQUIVALENT("RequiredOrEquivalent");
    private final String value;

    LearningObjectUseCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LearningObjectUseCodeEnumType fromValue(String v) {
        for (LearningObjectUseCodeEnumType c: LearningObjectUseCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}