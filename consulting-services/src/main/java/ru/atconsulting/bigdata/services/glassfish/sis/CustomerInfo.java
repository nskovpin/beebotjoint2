
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for CustomerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="clientRepAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientRepName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docIdNumberNormalized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBanInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastBusinnessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueDebts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ben" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctnNgp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctnNgpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simCardNgp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simCardNgpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logicalSwith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfo", propOrder = {
    "ban",
    "accountType",
    "activDate",
    "clientRepAddress",
    "clientRepName",
    "birthDate",
    "docID",
    "docNumber",
    "docIdNumberNormalized",
    "docDate",
    "docIssue",
    "docType",
    "email",
    "inn",
    "marketCode",
    "phoneHome",
    "phoneWork",
    "arBalance",
    "limit",
    "vip",
    "payerBan",
    "payerBanInd",
    "nameTitle",
    "firstName",
    "lastBusinnessName",
    "additionalTitle",
    "overdueDebts",
    "ben",
    "ctn",
    "subStatus",
    "subStatusType",
    "serialNo",
    "ctnNgp",
    "ctnNgpType",
    "simCardNgp",
    "simCardNgpType",
    "pricePlan",
    "currencyCode",
    "logicalSwith",
    "portStatus"
})
public class CustomerInfo implements Serializable {

    @XmlElement(required = true)
    protected String ban;
    @XmlElement(required = true)
    protected String accountType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activDate;
    @XmlElement(required = true)
    protected String clientRepAddress;
    @XmlElement(required = true)
    protected String clientRepName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String docID;
    protected String docNumber;
    protected String docIdNumberNormalized;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    protected String docIssue;
    protected String docType;
    protected String email;
    protected String inn;
    protected String marketCode;
    protected String phoneHome;
    protected String phoneWork;
    protected String arBalance;
    protected String limit;
    protected String vip;
    protected String payerBan;
    protected String payerBanInd;
    protected String nameTitle;
    protected String firstName;
    protected String lastBusinnessName;
    protected String additionalTitle;
    protected String overdueDebts;
    protected String ben;
    protected String ctn;
    protected String subStatus;
    protected String subStatusType;
    protected String serialNo;
    protected String ctnNgp;
    protected String ctnNgpType;
    protected String simCardNgp;
    protected String simCardNgpType;
    protected String pricePlan;
    protected String currencyCode;
    protected String logicalSwith;
    protected String portStatus;

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBan(String value) {
        this.ban = value;
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

    /**
     * Gets the value of the activDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivDate() {
        return activDate;
    }

    /**
     * Sets the value of the activDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivDate(XMLGregorianCalendar value) {
        this.activDate = value;
    }

    /**
     * Gets the value of the clientRepAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRepAddress() {
        return clientRepAddress;
    }

    /**
     * Sets the value of the clientRepAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRepAddress(String value) {
        this.clientRepAddress = value;
    }

    /**
     * Gets the value of the clientRepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRepName() {
        return clientRepName;
    }

    /**
     * Sets the value of the clientRepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRepName(String value) {
        this.clientRepName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the docID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Sets the value of the docID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docIdNumberNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdNumberNormalized() {
        return docIdNumberNormalized;
    }

    /**
     * Sets the value of the docIdNumberNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdNumberNormalized(String value) {
        this.docIdNumberNormalized = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssue() {
        return docIssue;
    }

    /**
     * Sets the value of the docIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssue(String value) {
        this.docIssue = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the phoneHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHome() {
        return phoneHome;
    }

    /**
     * Sets the value of the phoneHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHome(String value) {
        this.phoneHome = value;
    }

    /**
     * Gets the value of the phoneWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneWork() {
        return phoneWork;
    }

    /**
     * Sets the value of the phoneWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneWork(String value) {
        this.phoneWork = value;
    }

    /**
     * Gets the value of the arBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArBalance() {
        return arBalance;
    }

    /**
     * Sets the value of the arBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArBalance(String value) {
        this.arBalance = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVip(String value) {
        this.vip = value;
    }

    /**
     * Gets the value of the payerBan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBan() {
        return payerBan;
    }

    /**
     * Sets the value of the payerBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBan(String value) {
        this.payerBan = value;
    }

    /**
     * Gets the value of the payerBanInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBanInd() {
        return payerBanInd;
    }

    /**
     * Sets the value of the payerBanInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBanInd(String value) {
        this.payerBanInd = value;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastBusinnessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBusinnessName() {
        return lastBusinnessName;
    }

    /**
     * Sets the value of the lastBusinnessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBusinnessName(String value) {
        this.lastBusinnessName = value;
    }

    /**
     * Gets the value of the additionalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTitle() {
        return additionalTitle;
    }

    /**
     * Sets the value of the additionalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTitle(String value) {
        this.additionalTitle = value;
    }

    /**
     * Gets the value of the overdueDebts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueDebts() {
        return overdueDebts;
    }

    /**
     * Sets the value of the overdueDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueDebts(String value) {
        this.overdueDebts = value;
    }

    /**
     * Gets the value of the ben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBen() {
        return ben;
    }

    /**
     * Sets the value of the ben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBen(String value) {
        this.ben = value;
    }

    /**
     * Gets the value of the ctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtn() {
        return ctn;
    }

    /**
     * Sets the value of the ctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtn(String value) {
        this.ctn = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the subStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatusType() {
        return subStatusType;
    }

    /**
     * Sets the value of the subStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatusType(String value) {
        this.subStatusType = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the ctnNgp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtnNgp() {
        return ctnNgp;
    }

    /**
     * Sets the value of the ctnNgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtnNgp(String value) {
        this.ctnNgp = value;
    }

    /**
     * Gets the value of the ctnNgpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtnNgpType() {
        return ctnNgpType;
    }

    /**
     * Sets the value of the ctnNgpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtnNgpType(String value) {
        this.ctnNgpType = value;
    }

    /**
     * Gets the value of the simCardNgp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimCardNgp() {
        return simCardNgp;
    }

    /**
     * Sets the value of the simCardNgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimCardNgp(String value) {
        this.simCardNgp = value;
    }

    /**
     * Gets the value of the simCardNgpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimCardNgpType() {
        return simCardNgpType;
    }

    /**
     * Sets the value of the simCardNgpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimCardNgpType(String value) {
        this.simCardNgpType = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlan(String value) {
        this.pricePlan = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the logicalSwith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalSwith() {
        return logicalSwith;
    }

    /**
     * Sets the value of the logicalSwith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalSwith(String value) {
        this.logicalSwith = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortStatus(String value) {
        this.portStatus = value;
    }

}
