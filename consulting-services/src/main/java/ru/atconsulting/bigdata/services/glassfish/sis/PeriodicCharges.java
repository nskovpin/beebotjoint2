
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PeriodicCharges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="periodicChargeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="applyDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="periodFrequency" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                   &lt;element name="nextApplyDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicCharges", propOrder = {
    "periodicCharge"
})
public class PeriodicCharges implements Serializable {

    protected List<PeriodicCharge> periodicCharge;

    /**
     * Gets the value of the periodicCharge property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodicCharge property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodicCharge().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodicCharges.PeriodicCharge }
     *
     *
     */
    public List<PeriodicCharge> getPeriodicCharge() {
        if (periodicCharge == null) {
            periodicCharge = new ArrayList<PeriodicCharge>();
        }
        return this.periodicCharge;
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
     *         &lt;element name="periodicChargeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="applyDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="periodFrequency" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *         &lt;element name="nextApplyDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "periodicChargeID",
        "startDate",
        "endDate",
        "applyDay",
        "periodFrequency",
        "nextApplyDt"
    })
    public static class PeriodicCharge {

        @XmlElement(required = true)
        protected String periodicChargeID;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endDate;
        protected BigInteger applyDay;
        protected Short periodFrequency;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar nextApplyDt;

        /**
         * Gets the value of the periodicChargeID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodicChargeID() {
            return periodicChargeID;
        }

        /**
         * Sets the value of the periodicChargeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodicChargeID(String value) {
            this.periodicChargeID = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the applyDay property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getApplyDay() {
            return applyDay;
        }

        /**
         * Sets the value of the applyDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setApplyDay(BigInteger value) {
            this.applyDay = value;
        }

        /**
         * Gets the value of the periodFrequency property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getPeriodFrequency() {
            return periodFrequency;
        }

        /**
         * Sets the value of the periodFrequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setPeriodFrequency(Short value) {
            this.periodFrequency = value;
        }

        /**
         * Gets the value of the nextApplyDt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNextApplyDt() {
            return nextApplyDt;
        }

        /**
         * Sets the value of the nextApplyDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNextApplyDt(XMLGregorianCalendar value) {
            this.nextApplyDt = value;
        }

    }

}
