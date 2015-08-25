//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.19 at 03:28:35 PM EDT 
//


package org.hros.assessments.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PackageBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssessmentApplicability" type="{}AssessmentApplicabilityType" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentAdministration" type="{}AssessmentAdministrationType" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentFulfillment" type="{}AssessmentFulfillmentType" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" type="{}UserAreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentPackageType", propOrder = {
    "assessmentApplicability",
    "assessmentAdministration",
    "assessmentFulfillment",
    "userArea"
})
public class AssessmentPackageType
    extends PackageBaseType
{

    @XmlElement(name = "AssessmentApplicability")
    protected AssessmentApplicabilityType assessmentApplicability;
    @XmlElement(name = "AssessmentAdministration")
    protected AssessmentAdministrationType assessmentAdministration;
    @XmlElement(name = "AssessmentFulfillment")
    protected AssessmentFulfillmentType assessmentFulfillment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the assessmentApplicability property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentApplicabilityType }
     *     
     */
    public AssessmentApplicabilityType getAssessmentApplicability() {
        return assessmentApplicability;
    }

    /**
     * Sets the value of the assessmentApplicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentApplicabilityType }
     *     
     */
    public void setAssessmentApplicability(AssessmentApplicabilityType value) {
        this.assessmentApplicability = value;
    }

    /**
     * Gets the value of the assessmentAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAdministrationType }
     *     
     */
    public AssessmentAdministrationType getAssessmentAdministration() {
        return assessmentAdministration;
    }

    /**
     * Sets the value of the assessmentAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAdministrationType }
     *     
     */
    public void setAssessmentAdministration(AssessmentAdministrationType value) {
        this.assessmentAdministration = value;
    }

    /**
     * Gets the value of the assessmentFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFulfillmentType }
     *     
     */
    public AssessmentFulfillmentType getAssessmentFulfillment() {
        return assessmentFulfillment;
    }

    /**
     * Sets the value of the assessmentFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFulfillmentType }
     *     
     */
    public void setAssessmentFulfillment(AssessmentFulfillmentType value) {
        this.assessmentFulfillment = value;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}
