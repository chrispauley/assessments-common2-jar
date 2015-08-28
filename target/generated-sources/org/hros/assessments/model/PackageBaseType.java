//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 09:26:56 AM EDT 
//


package org.hros.assessments.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The term "Package" is used in the contexts of
 * 				Screening and Assessment (and possibly other HR service areas) to
 * 				describe a set of component services that are marketed and can be
 * 				ordered as a unit. Such orders generally are accomplished by
 * 				referencing the associated "Package ID". In some cases, individual
 * 				component services also may be ordered using a so-called "a la
 * 				carte" approach. This base type is extended appropriately so it can
 * 				be used both in the context of Assessment and Screening catalogs.
 * 				The catalogs may reflect an assessment or screening provider's
 * 				general offerings to the business community or the catalogs may
 * 				contain a subset of offerings that have been designed or specified
 * 				for a particular customer.
 * 			
 * 
 * <p>Java class for PackageBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentGroupID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartyReportingIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAvailabilityCode" type="{}ServiceAvailabilityCodeEnumType" minOccurs="0"/&gt;
 *         &lt;element name="PackageCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageBaseType", propOrder = {
    "id",
    "name",
    "description",
    "parentGroupID",
    "packageTypeCode",
    "partyReportingIDs",
    "serviceAvailabilityCode",
    "packageCost"
})
@XmlSeeAlso({
    AssessmentPackageType.class
})
public class PackageBaseType {

    @XmlElement(name = "ID")
    protected List<String> id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "ParentGroupID")
    protected List<String> parentGroupID;
    @XmlElement(name = "PackageTypeCode")
    protected List<String> packageTypeCode;
    @XmlElement(name = "PartyReportingIDs")
    protected List<String> partyReportingIDs;
    @XmlElement(name = "ServiceAvailabilityCode")
    @XmlSchemaType(name = "normalizedString")
    protected ServiceAvailabilityCodeEnumType serviceAvailabilityCode;
    @XmlElement(name = "PackageCost")
    protected String packageCost;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getID() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the parentGroupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentGroupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParentGroupID() {
        if (parentGroupID == null) {
            parentGroupID = new ArrayList<String>();
        }
        return this.parentGroupID;
    }

    /**
     * Gets the value of the packageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageTypeCode() {
        if (packageTypeCode == null) {
            packageTypeCode = new ArrayList<String>();
        }
        return this.packageTypeCode;
    }

    /**
     * Gets the value of the partyReportingIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyReportingIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyReportingIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyReportingIDs() {
        if (partyReportingIDs == null) {
            partyReportingIDs = new ArrayList<String>();
        }
        return this.partyReportingIDs;
    }

    /**
     * Gets the value of the serviceAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAvailabilityCodeEnumType }
     *     
     */
    public ServiceAvailabilityCodeEnumType getServiceAvailabilityCode() {
        return serviceAvailabilityCode;
    }

    /**
     * Sets the value of the serviceAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAvailabilityCodeEnumType }
     *     
     */
    public void setServiceAvailabilityCode(ServiceAvailabilityCodeEnumType value) {
        this.serviceAvailabilityCode = value;
    }

    /**
     * Gets the value of the packageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCost() {
        return packageCost;
    }

    /**
     * Sets the value of the packageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCost(String value) {
        this.packageCost = value;
    }

}
