
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FillPatternType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FillPatternType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="banPatternDetails" type="{urn:gf-subscriber-info-service:xsd}BanPatternDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactTelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDocDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDocIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FillPatternType", propOrder = {
    "banPatternDetails",
    "contactTelNo",
    "contactFaxNo",
    "birthDate",
    "custGender",
    "custDocType",
    "custDocId",
    "custDocNo",
    "custDocDate",
    "custDocIssue",
    "inn",
    "companyType",
    "companyRegNum",
    "kpp",
    "taxRegNo",
    "taxReg",
    "accountType"
})
public class FillPatternType implements Serializable {

    protected List<BanPatternDetailsType> banPatternDetails;
    protected String contactTelNo;
    protected String contactFaxNo;
    protected String birthDate;
    protected String custGender;
    protected String custDocType;
    protected String custDocId;
    protected String custDocNo;
    protected String custDocDate;
    protected String custDocIssue;
    protected String inn;
    protected String companyType;
    protected String companyRegNum;
    protected String kpp;
    protected String taxRegNo;
    protected String taxReg;
    protected String accountType;

    /**
     * Gets the value of the banPatternDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the banPatternDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBanPatternDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BanPatternDetailsType }
     * 
     * 
     */
    public List<BanPatternDetailsType> getBanPatternDetails() {
        if (banPatternDetails == null) {
            banPatternDetails = new ArrayList<BanPatternDetailsType>();
        }
        return this.banPatternDetails;
    }

    /**
     * Gets the value of the contactTelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelNo() {
        return contactTelNo;
    }

    /**
     * Sets the value of the contactTelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelNo(String value) {
        this.contactTelNo = value;
    }

    /**
     * Gets the value of the contactFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFaxNo() {
        return contactFaxNo;
    }

    /**
     * Sets the value of the contactFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFaxNo(String value) {
        this.contactFaxNo = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the custGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGender() {
        return custGender;
    }

    /**
     * Sets the value of the custGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGender(String value) {
        this.custGender = value;
    }

    /**
     * Gets the value of the custDocType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocType() {
        return custDocType;
    }

    /**
     * Sets the value of the custDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocType(String value) {
        this.custDocType = value;
    }

    /**
     * Gets the value of the custDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocId() {
        return custDocId;
    }

    /**
     * Sets the value of the custDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocId(String value) {
        this.custDocId = value;
    }

    /**
     * Gets the value of the custDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocNo() {
        return custDocNo;
    }

    /**
     * Sets the value of the custDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocNo(String value) {
        this.custDocNo = value;
    }

    /**
     * Gets the value of the custDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocDate() {
        return custDocDate;
    }

    /**
     * Sets the value of the custDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocDate(String value) {
        this.custDocDate = value;
    }

    /**
     * Gets the value of the custDocIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocIssue() {
        return custDocIssue;
    }

    /**
     * Sets the value of the custDocIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocIssue(String value) {
        this.custDocIssue = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the companyRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegNum() {
        return companyRegNum;
    }

    /**
     * Sets the value of the companyRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegNum(String value) {
        this.companyRegNum = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the taxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegNo() {
        return taxRegNo;
    }

    /**
     * Sets the value of the taxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegNo(String value) {
        this.taxRegNo = value;
    }

    /**
     * Gets the value of the taxReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxReg() {
        return taxReg;
    }

    /**
     * Sets the value of the taxReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxReg(String value) {
        this.taxReg = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

}
