
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for SessionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneIdList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionParams", propOrder = {
    "zoneId",
    "zoneIdList"
})
public class SessionParams implements Serializable {

    protected String zoneId;
    protected String zoneIdList;

    /**
     * Gets the value of the zoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Sets the value of the zoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneId(String value) {
        this.zoneId = value;
    }

    /**
     * Gets the value of the zoneIdList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneIdList() {
        return zoneIdList;
    }

    /**
     * Sets the value of the zoneIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneIdList(String value) {
        this.zoneIdList = value;
    }

}
