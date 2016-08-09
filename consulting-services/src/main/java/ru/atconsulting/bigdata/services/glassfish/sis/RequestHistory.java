
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoHistory">
 *                 &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="maxCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ctn" type="{urn:gf-subscriber-info-service:xsd}ctn" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHistory", propOrder = {
    "requiredInfo"
})
public class RequestHistory implements Serializable {

    @XmlElement(required = true)
    protected List<RequiredInfo> requiredInfo;
    @XmlAttribute(name = "ctn")
    protected String ctn;

    /**
     * Gets the value of the requiredInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestHistory.RequiredInfo }
     *
     *
     */
    public List<RequiredInfo> getRequiredInfo() {
        if (requiredInfo == null) {
            requiredInfo = new ArrayList<RequiredInfo>();
        }
        return this.requiredInfo;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoHistory">
     *       &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="maxCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RequiredInfo implements Serializable{

        @XmlValue
        protected RequiredInfoHistory value;
        @XmlAttribute(name = "fromDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fromDate;
        @XmlAttribute(name = "toDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar toDate;
        @XmlAttribute(name = "maxCount")
        protected BigInteger maxCount;
        @XmlAttribute(name = "ext")
        protected String ext;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RequiredInfoHistory }
         *     
         */
        public RequiredInfoHistory getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredInfoHistory }
         *     
         */
        public void setValue(RequiredInfoHistory value) {
            this.value = value;
        }

        /**
         * Gets the value of the fromDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDate() {
            return fromDate;
        }

        /**
         * Sets the value of the fromDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDate(XMLGregorianCalendar value) {
            this.fromDate = value;
        }

        /**
         * Gets the value of the toDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDate() {
            return toDate;
        }

        /**
         * Sets the value of the toDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDate(XMLGregorianCalendar value) {
            this.toDate = value;
        }

        /**
         * Gets the value of the maxCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxCount() {
            return maxCount;
        }

        /**
         * Sets the value of the maxCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxCount(BigInteger value) {
            this.maxCount = value;
        }

        /**
         * Gets the value of the ext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExt() {
            return ext;
        }

        /**
         * Sets the value of the ext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExt(String value) {
            this.ext = value;
        }

    }

}
