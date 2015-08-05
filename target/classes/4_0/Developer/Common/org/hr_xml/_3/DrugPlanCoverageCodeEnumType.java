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
 * <p>Java class for DrugPlanCoverageCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrugPlanCoverageCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="PartDSubsidyProgram"/>
 *     &lt;enumeration value="IntegratedWrappedSecondaryCoverage"/>
 *     &lt;enumeration value="NotParticipatingSubsidy"/>
 *     &lt;enumeration value="NotParticipating"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrugPlanCoverageCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum DrugPlanCoverageCodeEnumType {

    @XmlEnumValue("PartDSubsidyProgram")
    PART_D_SUBSIDY_PROGRAM("PartDSubsidyProgram"),
    @XmlEnumValue("IntegratedWrappedSecondaryCoverage")
    INTEGRATED_WRAPPED_SECONDARY_COVERAGE("IntegratedWrappedSecondaryCoverage"),
    @XmlEnumValue("NotParticipatingSubsidy")
    NOT_PARTICIPATING_SUBSIDY("NotParticipatingSubsidy"),
    @XmlEnumValue("NotParticipating")
    NOT_PARTICIPATING("NotParticipating"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DrugPlanCoverageCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrugPlanCoverageCodeEnumType fromValue(String v) {
        for (DrugPlanCoverageCodeEnumType c: DrugPlanCoverageCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}