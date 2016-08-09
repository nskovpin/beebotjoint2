
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestFTTB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestFTTB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" type="{urn:gf-subscriber-info-service:xsd}requiredInfoFTTB" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestFTTB", propOrder = {
    "requiredInfo"
})
public class RequestFTTB {

    @XmlElement(required = true)
    protected List<RequiredInfoFTTB> requiredInfo;
    @XmlAttribute(name = "subscriberId")
    protected String subscriberId;

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
     * {@link RequiredInfoFTTB }
     * 
     * 
     */
    public List<RequiredInfoFTTB> getRequiredInfo() {
        if (requiredInfo == null) {
            requiredInfo = new ArrayList<RequiredInfoFTTB>();
        }
        return this.requiredInfo;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

}
