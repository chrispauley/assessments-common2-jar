//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:07:29 PM EST 
//


package org.openapplications.oagis._9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.hr_xml._3.AssessmentDeliveryCodeType;
import org.hr_xml._3.DeploymentActionCodeType;
import org.hr_xml._3.EmployeeGroupCodeType;
import org.hr_xml._3.LicenseEndorsementCodeType;
import org.hr_xml._3.LicenseQualificationCodeType;
import org.hr_xml._3.LicenseRestrictionCodeType;
import org.hr_xml._3.PayGroupCodeType;
import org.hr_xml._3.StatusCodeType;


/**
 * <p>Java class for CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/9/unqualifieddatatypes/1.1>CodeType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType")
@XmlSeeAlso({
    StatusCodeType.class,
    LicenseRestrictionCodeType.class,
    AssessmentDeliveryCodeType.class,
    PayGroupCodeType.class,
    LicenseQualificationCodeType.class,
    DeploymentActionCodeType.class,
    LicenseEndorsementCodeType.class,
    EmployeeGroupCodeType.class,
    HarmonizedTariffScheduleCodeType.class,
    SequencedCodeType.class
})
public class CodeType
    extends org.openapplications.oagis._9.unqualifieddatatypes._1.CodeType
{


}
