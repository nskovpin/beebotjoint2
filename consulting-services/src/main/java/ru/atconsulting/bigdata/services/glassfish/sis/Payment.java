
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rechargeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechargeComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechargeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="faceValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currencyConvRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subscriberCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balances" type="{urn:gf-subscriber-info-service:xsd}HistoryBalances" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "rechargeId",
    "rechargeComment",
    "rechargeDateTime",
    "faceValue",
    "currencyConvRate",
    "subscriberCurrency",
    "balances"
})
public class Payment {

    @XmlElement(required = true)
    protected String rechargeId;
    @XmlElement(required = true)
    protected String rechargeComment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rechargeDateTime;
    protected double faceValue;
    protected double currencyConvRate;
    @XmlElement(required = true)
    protected String subscriberCurrency;
    protected HistoryBalances balances;

    /**
     * Gets the value of the rechargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeId() {
        return rechargeId;
    }

    /**
     * Sets the value of the rechargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeId(String value) {
        this.rechargeId = value;
    }

    /**
     * Gets the value of the rechargeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeComment() {
        return rechargeComment;
    }

    /**
     * Sets the value of the rechargeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeComment(String value) {
        this.rechargeComment = value;
    }

    /**
     * Gets the value of the rechargeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRechargeDateTime() {
        return rechargeDateTime;
    }

    /**
     * Sets the value of the rechargeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRechargeDateTime(XMLGregorianCalendar value) {
        this.rechargeDateTime = value;
    }

    /**
     * Gets the value of the faceValue property.
     * 
     */
    public double getFaceValue() {
        return faceValue;
    }

    /**
     * Sets the value of the faceValue property.
     * 
     */
    public void setFaceValue(double value) {
        this.faceValue = value;
    }

    /**
     * Gets the value of the currencyConvRate property.
     * 
     */
    public double getCurrencyConvRate() {
        return currencyConvRate;
    }

    /**
     * Sets the value of the currencyConvRate property.
     * 
     */
    public void setCurrencyConvRate(double value) {
        this.currencyConvRate = value;
    }

    /**
     * Gets the value of the subscriberCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberCurrency() {
        return subscriberCurrency;
    }

    /**
     * Sets the value of the subscriberCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberCurrency(String value) {
        this.subscriberCurrency = value;
    }

    /**
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryBalances }
     *     
     */
    public HistoryBalances getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryBalances }
     *     
     */
    public void setBalances(HistoryBalances value) {
        this.balances = value;
    }

}
