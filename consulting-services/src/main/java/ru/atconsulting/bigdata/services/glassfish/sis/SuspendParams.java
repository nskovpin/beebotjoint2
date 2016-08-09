
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspendParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuspendParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suspendVSR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suspendINTL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suspendALL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="whiteZonesList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuspendParams", propOrder = {
    "suspendVSR",
    "suspendINTL",
    "suspendALL",
    "whiteZonesList"
})
public class SuspendParams {

    protected int suspendVSR;
    protected int suspendINTL;
    protected int suspendALL;
    protected String whiteZonesList;

    /**
     * Gets the value of the suspendVSR property.
     * 
     */
    public int getSuspendVSR() {
        return suspendVSR;
    }

    /**
     * Sets the value of the suspendVSR property.
     * 
     */
    public void setSuspendVSR(int value) {
        this.suspendVSR = value;
    }

    /**
     * Gets the value of the suspendINTL property.
     * 
     */
    public int getSuspendINTL() {
        return suspendINTL;
    }

    /**
     * Sets the value of the suspendINTL property.
     * 
     */
    public void setSuspendINTL(int value) {
        this.suspendINTL = value;
    }

    /**
     * Gets the value of the suspendALL property.
     * 
     */
    public int getSuspendALL() {
        return suspendALL;
    }

    /**
     * Sets the value of the suspendALL property.
     * 
     */
    public void setSuspendALL(int value) {
        this.suspendALL = value;
    }

    /**
     * Gets the value of the whiteZonesList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteZonesList() {
        return whiteZonesList;
    }

    /**
     * Sets the value of the whiteZonesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteZonesList(String value) {
        this.whiteZonesList = value;
    }

}
