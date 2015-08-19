//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.19 at 01:19:30 PM EDT 
//


package org.hros.assessments.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="CustomerParty" type="{}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="SupplierParty" type="{}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="RequesterParty" type="{}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="InvitationByPartyCode" type="{}InvitationByPartyCodeEnumType" minOccurs="0"/&gt;
 *         &lt;element name="PackageID" type="{}IdentifierType"/&gt;
 *         &lt;element name="ComparisonGroupID" type="{}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentRequesterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentSubject" type="{}AssessmentSubjectType" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentLanguageCode" type="{}LanguageCodeEnumType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentResultLanguageCode" type="{}LanguageCodeEnumType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RedirectURL" type="{}URIType" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" type="{}UserAreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="majorVersionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="minorVersionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentOrderType", propOrder = {
    "documentID",
    "documentSequence",
    "customerParty",
    "supplierParty",
    "requesterParty",
    "invitationByPartyCode",
    "packageID",
    "comparisonGroupID",
    "assessmentRequesterName",
    "assessmentSubject",
    "assessmentLanguageCode",
    "assessmentResultLanguageCode",
    "redirectURL",
    "userArea"
})
public class AssessmentOrderType {

    protected String documentID;
    @XmlElement(name = "DocumentSequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger documentSequence;
    @XmlElement(name = "CustomerParty")
    protected PartyType customerParty;
    @XmlElement(name = "SupplierParty")
    protected PartyType supplierParty;
    @XmlElement(name = "RequesterParty")
    protected PartyType requesterParty;
    @XmlElement(name = "InvitationByPartyCode")
    @XmlSchemaType(name = "normalizedString")
    protected InvitationByPartyCodeEnumType invitationByPartyCode;
    @XmlElement(name = "PackageID", required = true)
    protected IdentifierType packageID;
    @XmlElement(name = "ComparisonGroupID")
    protected List<IdentifierType> comparisonGroupID;
    @XmlElement(name = "AssessmentRequesterName")
    protected String assessmentRequesterName;
    @XmlElement(name = "AssessmentSubject")
    protected AssessmentSubjectType assessmentSubject;
    @XmlElement(name = "AssessmentLanguageCode")
    @XmlSchemaType(name = "normalizedString")
    protected List<LanguageCodeEnumType> assessmentLanguageCode;
    @XmlElement(name = "AssessmentResultLanguageCode")
    @XmlSchemaType(name = "normalizedString")
    protected List<LanguageCodeEnumType> assessmentResultLanguageCode;
    @XmlElement(name = "RedirectURL")
    @XmlSchemaType(name = "anyURI")
    protected String redirectURL;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "majorVersionID")
    protected String majorVersionID;
    @XmlAttribute(name = "minorVersionID")
    protected String minorVersionID;

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the documentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentSequence() {
        return documentSequence;
    }

    /**
     * Sets the value of the documentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentSequence(BigInteger value) {
        this.documentSequence = value;
    }

    /**
     * Gets the value of the customerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCustomerParty() {
        return customerParty;
    }

    /**
     * Sets the value of the customerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCustomerParty(PartyType value) {
        this.customerParty = value;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Sets the value of the supplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSupplierParty(PartyType value) {
        this.supplierParty = value;
    }

    /**
     * Gets the value of the requesterParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getRequesterParty() {
        return requesterParty;
    }

    /**
     * Sets the value of the requesterParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setRequesterParty(PartyType value) {
        this.requesterParty = value;
    }

    /**
     * Gets the value of the invitationByPartyCode property.
     * 
     * @return
     *     possible object is
     *     {@link InvitationByPartyCodeEnumType }
     *     
     */
    public InvitationByPartyCodeEnumType getInvitationByPartyCode() {
        return invitationByPartyCode;
    }

    /**
     * Sets the value of the invitationByPartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvitationByPartyCodeEnumType }
     *     
     */
    public void setInvitationByPartyCode(InvitationByPartyCodeEnumType value) {
        this.invitationByPartyCode = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPackageID(IdentifierType value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the comparisonGroupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonGroupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getComparisonGroupID() {
        if (comparisonGroupID == null) {
            comparisonGroupID = new ArrayList<IdentifierType>();
        }
        return this.comparisonGroupID;
    }

    /**
     * Gets the value of the assessmentRequesterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRequesterName() {
        return assessmentRequesterName;
    }

    /**
     * Sets the value of the assessmentRequesterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRequesterName(String value) {
        this.assessmentRequesterName = value;
    }

    /**
     * Gets the value of the assessmentSubject property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubjectType }
     *     
     */
    public AssessmentSubjectType getAssessmentSubject() {
        return assessmentSubject;
    }

    /**
     * Sets the value of the assessmentSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubjectType }
     *     
     */
    public void setAssessmentSubject(AssessmentSubjectType value) {
        this.assessmentSubject = value;
    }

    /**
     * Gets the value of the assessmentLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeEnumType }
     * 
     * 
     */
    public List<LanguageCodeEnumType> getAssessmentLanguageCode() {
        if (assessmentLanguageCode == null) {
            assessmentLanguageCode = new ArrayList<LanguageCodeEnumType>();
        }
        return this.assessmentLanguageCode;
    }

    /**
     * Gets the value of the assessmentResultLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentResultLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentResultLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeEnumType }
     * 
     * 
     */
    public List<LanguageCodeEnumType> getAssessmentResultLanguageCode() {
        if (assessmentResultLanguageCode == null) {
            assessmentResultLanguageCode = new ArrayList<LanguageCodeEnumType>();
        }
        return this.assessmentResultLanguageCode;
    }

    /**
     * Gets the value of the redirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectURL() {
        return redirectURL;
    }

    /**
     * Sets the value of the redirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectURL(String value) {
        this.redirectURL = value;
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

    /**
     * Gets the value of the majorVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorVersionID() {
        return majorVersionID;
    }

    /**
     * Sets the value of the majorVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorVersionID(String value) {
        this.majorVersionID = value;
    }

    /**
     * Gets the value of the minorVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorVersionID() {
        return minorVersionID;
    }

    /**
     * Sets the value of the minorVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorVersionID(String value) {
        this.minorVersionID = value;
    }

}
