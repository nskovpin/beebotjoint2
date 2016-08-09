
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CtnListInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtnListInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctn" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>ctn">
 *                 &lt;attribute name="startServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="portStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "CtnListInfo", propOrder = {
    "ctn"
})
public class CtnListInfo implements Serializable {

    protected List<Ctn> ctn;

    /**
     * Gets the value of the ctn property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctn property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtnListInfo.Ctn }
     *
     *
     */
    public List<Ctn> getCtn() {
        if (ctn == null) {
            ctn = new ArrayList<Ctn>();
        }
        return this.ctn;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>ctn">
     *       &lt;attribute name="startServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="portStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Ctn implements Serializable{

        @XmlValue
        protected String value;
        @XmlAttribute(name = "startServiceDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startServiceDate;
        @XmlAttribute(name = "portStatus")
        protected String portStatus;
        @XmlAttribute(name = "status")
        protected String status;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the startServiceDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartServiceDate() {
            return startServiceDate;
        }

        /**
         * Sets the value of the startServiceDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartServiceDate(XMLGregorianCalendar value) {
            this.startServiceDate = value;
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

    }

}
