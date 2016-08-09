
package ru.atconsulting.bigdata.services.glassfish.trouble;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TTInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TT" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="technology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="kpi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateClose" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "TTInfo", propOrder = {
    "tt"
})
public class TTInfo {

    @XmlElement(name = "TT")
    protected List<TT> tt;

    /**
     * Gets the value of the tt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TT }
     * 
     * 
     */
    public List<TT> getTT() {
        if (tt == null) {
            tt = new ArrayList<TT>();
        }
        return this.tt;
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
     *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="technology" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="kpi" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dateClose" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "number",
        "technology",
        "kpi",
        "priority",
        "status",
        "dateClose"
    })
    public static class TT {

        protected int number;
        @XmlElement(required = true)
        protected String technology;
        @XmlElement(required = true)
        protected String kpi;
        @XmlElement(required = true)
        protected String priority;
        @XmlElement(required = true)
        protected String status;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateClose;

        /**
         * Gets the value of the number property.
         * 
         */
        public int getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         */
        public void setNumber(int value) {
            this.number = value;
        }

        /**
         * Gets the value of the technology property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnology() {
            return technology;
        }

        /**
         * Sets the value of the technology property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnology(String value) {
            this.technology = value;
        }

        /**
         * Gets the value of the kpi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKpi() {
            return kpi;
        }

        /**
         * Sets the value of the kpi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKpi(String value) {
            this.kpi = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriority(String value) {
            this.priority = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the dateClose property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateClose() {
            return dateClose;
        }

        /**
         * Sets the value of the dateClose property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateClose(XMLGregorianCalendar value) {
            this.dateClose = value;
        }

    }

}
