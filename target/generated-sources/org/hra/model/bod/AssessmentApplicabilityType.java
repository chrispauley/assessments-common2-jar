//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 11:25:30 AM EDT 
//


package org.hra.model.bod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentApplicabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentApplicabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssessedCompetency" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JobCategoryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CareerLevelCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableRegion" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AvailableLanguageCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentApplicabilityType", propOrder = {
    "description",
    "assessmentTypeCode",
    "assessedCompetency",
    "jobCategoryCode",
    "careerLevelCode",
    "applicableRegion",
    "availableLanguageCode"
})
public class AssessmentApplicabilityType {

    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "AssessmentTypeCode")
    protected List<Object> assessmentTypeCode;
    @XmlElement(name = "AssessedCompetency")
    protected List<Object> assessedCompetency;
    @XmlElement(name = "JobCategoryCode")
    protected List<Object> jobCategoryCode;
    @XmlElement(name = "CareerLevelCode")
    protected Object careerLevelCode;
    @XmlElement(name = "ApplicableRegion")
    protected List<Object> applicableRegion;
    @XmlElement(name = "AvailableLanguageCode")
    protected List<Object> availableLanguageCode;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the assessmentTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAssessmentTypeCode() {
        if (assessmentTypeCode == null) {
            assessmentTypeCode = new ArrayList<Object>();
        }
        return this.assessmentTypeCode;
    }

    /**
     * Gets the value of the assessedCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessedCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessedCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAssessedCompetency() {
        if (assessedCompetency == null) {
            assessedCompetency = new ArrayList<Object>();
        }
        return this.assessedCompetency;
    }

    /**
     * Gets the value of the jobCategoryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCategoryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCategoryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getJobCategoryCode() {
        if (jobCategoryCode == null) {
            jobCategoryCode = new ArrayList<Object>();
        }
        return this.jobCategoryCode;
    }

    /**
     * Gets the value of the careerLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCareerLevelCode() {
        return careerLevelCode;
    }

    /**
     * Sets the value of the careerLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCareerLevelCode(Object value) {
        this.careerLevelCode = value;
    }

    /**
     * Gets the value of the applicableRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getApplicableRegion() {
        if (applicableRegion == null) {
            applicableRegion = new ArrayList<Object>();
        }
        return this.applicableRegion;
    }

    /**
     * Gets the value of the availableLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAvailableLanguageCode() {
        if (availableLanguageCode == null) {
            availableLanguageCode = new ArrayList<Object>();
        }
        return this.availableLanguageCode;
    }

}
