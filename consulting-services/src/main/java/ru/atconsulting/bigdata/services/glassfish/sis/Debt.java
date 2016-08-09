
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Debt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Debt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:gf-subscriber-info-service:xsd}Item" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="restBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="isDebt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="monthlyFeeDay" type="{urn:gf-subscriber-info-service:xsd}MonthlyFeeDay" minOccurs="0"/>
 *         &lt;element name="recommendedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debt", propOrder = {
    "dateFrom",
    "dateTo",
    "items",
    "totalAmount",
    "restBalance",
    "isDebt",
    "applyDate",
    "monthlyFeeDay",
    "recommendedAmount",
    "currencyCode"
})
public class Debt implements Serializable {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;
    protected Debt.Items items;
    protected Double totalAmount;
    protected double restBalance;
    protected boolean isDebt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applyDate;
    protected Short monthlyFeeDay;
    protected Double recommendedAmount;
    @XmlElement(required = true)
    protected String currencyCode;

    /**
     * Gets the value of the dateFrom property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the items property.
     *
     * @return
     *     possible object is
     *     {@link Debt.Items }
     *
     */
    public Debt.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     *
     * @param value
     *     allowed object is
     *     {@link Debt.Items }
     *
     */
    public void setItems(Debt.Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the restBalance property.
     * 
     */
    public double getRestBalance() {
        return restBalance;
    }

    /**
     * Sets the value of the restBalance property.
     * 
     */
    public void setRestBalance(double value) {
        this.restBalance = value;
    }

    /**
     * Gets the value of the isDebt property.
     * 
     */
    public boolean isIsDebt() {
        return isDebt;
    }

    /**
     * Sets the value of the isDebt property.
     * 
     */
    public void setIsDebt(boolean value) {
        this.isDebt = value;
    }

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
    }

    /**
     * Gets the value of the monthlyFeeDay property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMonthlyFeeDay() {
        return monthlyFeeDay;
    }

    /**
     * Sets the value of the monthlyFeeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMonthlyFeeDay(Short value) {
        this.monthlyFeeDay = value;
    }

    /**
     * Gets the value of the recommendedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecommendedAmount() {
        return recommendedAmount;
    }

    /**
     * Sets the value of the recommendedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecommendedAmount(Double value) {
        this.recommendedAmount = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:gf-subscriber-info-service:xsd}Item" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        protected List<Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item }
         * 
         * 
         */
        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }

    }

}
