
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for ResponseBan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerInfo" type="{urn:gf-subscriber-info-service:xsd}CustomerInfo" minOccurs="0"/>
 *         &lt;element name="ctnList" type="{urn:gf-subscriber-info-service:xsd}CtnList" minOccurs="0"/>
 *         &lt;element name="ctnListInfo" type="{urn:gf-subscriber-info-service:xsd}CtnListInfo" minOccurs="0"/>
 *         &lt;element name="ctnListCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerProperties" type="{urn:gf-subscriber-info-service:xsd}CustomerProperties" minOccurs="0"/>
 *         &lt;element name="subscription" type="{urn:gf-subscriber-info-service:xsd}subscription" minOccurs="0"/>
 *         &lt;element name="fillPattern" type="{urn:gf-subscriber-info-service:xsd}FillPatternType" minOccurs="0"/>
 *         &lt;element name="banHierarchy" type="{urn:gf-subscriber-info-service:xsd}BanHierarchy" minOccurs="0"/>
 *         &lt;element name="ctnImsiByBan" type="{urn:gf-subscriber-info-service:xsd}CtnImsiBy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBan", propOrder = {
    "type",
    "customerInfo",
    "ctnList",
    "ctnListInfo",
    "ctnListCount",
    "customerProperties",
    "subscription",
    "fillPattern",
    "banHierarchy",
    "ctnImsiByBan"
})
public class ResponseBan implements Serializable {

    protected String type;
    protected CustomerInfo customerInfo;
    protected CtnList ctnList;
    protected CtnListInfo ctnListInfo;
    protected String ctnListCount;
    protected CustomerProperties customerProperties;
    protected Subscription subscription;
    protected FillPatternType fillPattern;
    protected BanHierarchy banHierarchy;
    protected CtnImsiBy ctnImsiByBan;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setCustomerInfo(CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the ctnList property.
     * 
     * @return
     *     possible object is
     *     {@link CtnList }
     *     
     */
    public CtnList getCtnList() {
        return ctnList;
    }

    /**
     * Sets the value of the ctnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtnList }
     *     
     */
    public void setCtnList(CtnList value) {
        this.ctnList = value;
    }

    /**
     * Gets the value of the ctnListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CtnListInfo }
     *     
     */
    public CtnListInfo getCtnListInfo() {
        return ctnListInfo;
    }

    /**
     * Sets the value of the ctnListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtnListInfo }
     *     
     */
    public void setCtnListInfo(CtnListInfo value) {
        this.ctnListInfo = value;
    }

    /**
     * Gets the value of the ctnListCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtnListCount() {
        return ctnListCount;
    }

    /**
     * Sets the value of the ctnListCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtnListCount(String value) {
        this.ctnListCount = value;
    }

    /**
     * Gets the value of the customerProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProperties }
     *     
     */
    public CustomerProperties getCustomerProperties() {
        return customerProperties;
    }

    /**
     * Sets the value of the customerProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProperties }
     *     
     */
    public void setCustomerProperties(CustomerProperties value) {
        this.customerProperties = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the fillPattern property.
     * 
     * @return
     *     possible object is
     *     {@link FillPatternType }
     *     
     */
    public FillPatternType getFillPattern() {
        return fillPattern;
    }

    /**
     * Sets the value of the fillPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillPatternType }
     *     
     */
    public void setFillPattern(FillPatternType value) {
        this.fillPattern = value;
    }

    /**
     * Gets the value of the banHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BanHierarchy }
     *     
     */
    public BanHierarchy getBanHierarchy() {
        return banHierarchy;
    }

    /**
     * Sets the value of the banHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BanHierarchy }
     *     
     */
    public void setBanHierarchy(BanHierarchy value) {
        this.banHierarchy = value;
    }

    /**
     * Gets the value of the ctnImsiByBan property.
     * 
     * @return
     *     possible object is
     *     {@link CtnImsiBy }
     *     
     */
    public CtnImsiBy getCtnImsiByBan() {
        return ctnImsiByBan;
    }

    /**
     * Sets the value of the ctnImsiByBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtnImsiBy }
     *     
     */
    public void setCtnImsiByBan(CtnImsiBy value) {
        this.ctnImsiByBan = value;
    }

}
