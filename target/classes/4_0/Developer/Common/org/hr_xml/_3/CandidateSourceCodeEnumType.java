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
 * <p>Java class for CandidateSourceCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CandidateSourceCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="JobBoard"/>
 *     &lt;enumeration value="StaffingAgency"/>
 *     &lt;enumeration value="Intermediary"/>
 *     &lt;enumeration value="Referrer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CandidateSourceCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum CandidateSourceCodeEnumType {

    @XmlEnumValue("JobBoard")
    JOB_BOARD("JobBoard"),
    @XmlEnumValue("StaffingAgency")
    STAFFING_AGENCY("StaffingAgency"),
    @XmlEnumValue("Intermediary")
    INTERMEDIARY("Intermediary"),
    @XmlEnumValue("Referrer")
    REFERRER("Referrer");
    private final String value;

    CandidateSourceCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateSourceCodeEnumType fromValue(String v) {
        for (CandidateSourceCodeEnumType c: CandidateSourceCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}