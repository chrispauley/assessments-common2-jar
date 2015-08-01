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
 * <p>Java class for CreditAccountOwnershipCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditAccountOwnershipCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="AuthorizedUser"/>
 *     &lt;enumeration value="Comaker"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="JointContractualLiability"/>
 *     &lt;enumeration value="JointParticipating"/>
 *     &lt;enumeration value="Maker"/>
 *     &lt;enumeration value="OnBehalfOf"/>
 *     &lt;enumeration value="Terminated"/>
 *     &lt;enumeration value="NotSpecificied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditAccountOwnershipCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum CreditAccountOwnershipCodeEnumType {

    @XmlEnumValue("AuthorizedUser")
    AUTHORIZED_USER("AuthorizedUser"),
    @XmlEnumValue("Comaker")
    COMAKER("Comaker"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("JointContractualLiability")
    JOINT_CONTRACTUAL_LIABILITY("JointContractualLiability"),
    @XmlEnumValue("JointParticipating")
    JOINT_PARTICIPATING("JointParticipating"),
    @XmlEnumValue("Maker")
    MAKER("Maker"),
    @XmlEnumValue("OnBehalfOf")
    ON_BEHALF_OF("OnBehalfOf"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated"),
    @XmlEnumValue("NotSpecificied")
    NOT_SPECIFICIED("NotSpecificied");
    private final String value;

    CreditAccountOwnershipCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditAccountOwnershipCodeEnumType fromValue(String v) {
        for (CreditAccountOwnershipCodeEnumType c: CreditAccountOwnershipCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}