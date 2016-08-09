
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for EquipmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simType" type="{urn:gf-subscriber-info-service:xsd}SimType"/>
 *         &lt;element name="isLTE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInfo", propOrder = {
    "simType",
    "isLTE"
})
public class EquipmentInfo implements Serializable {

    @XmlElement(required = true)
    protected SimType simType;
    protected boolean isLTE;

    /**
     * Gets the value of the simType property.
     * 
     * @return
     *     possible object is
     *     {@link SimType }
     *     
     */
    public SimType getSimType() {
        return simType;
    }

    /**
     * Sets the value of the simType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimType }
     *     
     */
    public void setSimType(SimType value) {
        this.simType = value;
    }

    /**
     * Gets the value of the isLTE property.
     * 
     */
    public boolean isIsLTE() {
        return isLTE;
    }

    /**
     * Sets the value of the isLTE property.
     * 
     */
    public void setIsLTE(boolean value) {
        this.isLTE = value;
    }

}
