
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestBan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoBan">
 *                 &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ban" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBan", propOrder = {
    "requiredInfo"
})
public class RequestBan {

    @XmlElement(required = true)
    protected List<RequiredInfo> requiredInfo;
    @XmlAttribute(name = "ban")
    protected Integer ban;

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
     * {@link RequestBan.RequiredInfo }
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
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBan(Integer value) {
        this.ban = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoBan">
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
        protected RequiredInfoBan value;
        @XmlAttribute(name = "ext")
        protected String ext;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RequiredInfoBan }
         *     
         */
        public RequiredInfoBan getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredInfoBan }
         *     
         */
        public void setValue(RequiredInfoBan value) {
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
