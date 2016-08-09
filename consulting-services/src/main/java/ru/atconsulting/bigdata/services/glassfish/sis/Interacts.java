
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Interacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interact" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="objids" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="officeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Interacts", propOrder = {
    "interact"
})
public class Interacts implements Serializable {

    @XmlElement(required = true)
    protected List<Interact> interact;

    /**
     * Gets the value of the interact property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interact property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteract().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interacts.Interact }
     *
     *
     */
    public List<Interact> getInteract() {
        if (interact == null) {
            interact = new ArrayList<Interact>();
        }
        return this.interact;
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
     *         &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="objids" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="officeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "ctn",
        "phone",
        "endDate",
        "objids",
        "type",
        "office",
        "officeId"
    })
    public static class Interact implements Serializable{

        @XmlElement(required = true)
        protected String ctn;
        @XmlElement(required = true)
        protected String phone;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endDate;
        @XmlElement(required = true)
        protected String objids;
        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String office;
        @XmlElement(required = true)
        protected String officeId;

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
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
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
         * Gets the value of the objids property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjids() {
            return objids;
        }

        /**
         * Sets the value of the objids property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjids(String value) {
            this.objids = value;
        }

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
         * Gets the value of the office property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffice() {
            return office;
        }

        /**
         * Sets the value of the office property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffice(String value) {
            this.office = value;
        }

        /**
         * Gets the value of the officeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfficeId() {
            return officeId;
        }

        /**
         * Sets the value of the officeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfficeId(String value) {
            this.officeId = value;
        }

    }

}
