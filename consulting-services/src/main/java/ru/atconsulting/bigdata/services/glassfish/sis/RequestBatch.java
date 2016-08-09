
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoBatch">
 *                 &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ctnList" type="{urn:gf-subscriber-info-service:xsd}CtnList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBatch", propOrder = {
    "requiredInfo",
    "ctnList"
})
public class RequestBatch {

    @XmlElement(required = true)
    protected List<RequiredInfo> requiredInfo;
    @XmlElement(required = true)
    protected CtnList ctnList;

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
     * {@link RequestBatch.RequiredInfo }
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoBatch">
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
        protected RequiredInfoBatch value;
        @XmlAttribute(name = "ext")
        protected String ext;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RequiredInfoBatch }
         *     
         */
        public RequiredInfoBatch getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredInfoBatch }
         *     
         */
        public void setValue(RequiredInfoBatch value) {
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
