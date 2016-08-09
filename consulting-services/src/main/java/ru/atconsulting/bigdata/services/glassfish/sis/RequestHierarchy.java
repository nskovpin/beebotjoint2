
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoHierarchy">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="hierarchyId" type="{urn:gf-subscriber-info-service:xsd}hierarchyId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHierarchy", propOrder = {
    "requiredInfo"
})
public class RequestHierarchy implements Serializable {

    @XmlElement(required = true)
    protected List<RequiredInfo> requiredInfo;
    @XmlAttribute(name = "hierarchyId")
    protected String hierarchyId;

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
     * {@link RequestHierarchy.RequiredInfo }
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
     * Gets the value of the hierarchyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyId() {
        return hierarchyId;
    }

    /**
     * Sets the value of the hierarchyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyId(String value) {
        this.hierarchyId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:gf-subscriber-info-service:xsd>requiredInfoHierarchy">
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
        protected RequiredInfoHierarchy value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RequiredInfoHierarchy }
         *     
         */
        public RequiredInfoHierarchy getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredInfoHierarchy }
         *     
         */
        public void setValue(RequiredInfoHierarchy value) {
            this.value = value;
        }

    }

}
