
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfo">
 *                 &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ctn" type="{urn:gf-subscriber-info-service:xsd}ctn" />
 *       &lt;attribute name="imsi" type="{urn:gf-subscriber-info-service:xsd}imsi" />
 *       &lt;attribute name="login" type="{urn:gf-subscriber-info-service:xsd}login" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "requiredInfo"
})
public class Request {

    @XmlElement(required = true)
    protected List<RequiredInfo> requiredInfo;
    @XmlAttribute(name = "ctn")
    protected String ctn;
    @XmlAttribute(name = "imsi")
    protected String imsi;
    @XmlAttribute(name = "login")
    protected String login;

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
     * {@link Request.RequiredInfo }
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
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfo">
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
    public static class RequiredInfo {

        @XmlValue
        protected ru.atconsulting.bigdata.services.glassfish.sis.RequiredInfo value;
        @XmlAttribute(name = "ext")
        protected String ext;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ru.atconsulting.bigdata.services.glassfish.sis.RequiredInfo }
         *     
         */
        public ru.atconsulting.bigdata.services.glassfish.sis.RequiredInfo getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ru.atconsulting.bigdata.services.glassfish.sis.RequiredInfo }
         *     
         */
        public void setValue(ru.atconsulting.bigdata.services.glassfish.sis.RequiredInfo value) {
            this.value = value;
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
