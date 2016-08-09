
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for SubscriberNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeDifference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hlr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBeelineSubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isBeelinePool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platformId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberNumber", propOrder = {
    "marketCode",
    "timeDifference",
    "hlr",
    "isBeelineSubscriber",
    "isBeelinePool",
    "phoneNumber",
    "rn",
    "regionId",
    "platformId"
})
public class SubscriberNumber implements Serializable {

    protected String marketCode;
    protected String timeDifference;
    protected String hlr;
    protected Boolean isBeelineSubscriber;
    protected Boolean isBeelinePool;
    protected String phoneNumber;
    protected String rn;
    protected String regionId;
    protected String platformId;

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the timeDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDifference() {
        return timeDifference;
    }

    /**
     * Sets the value of the timeDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDifference(String value) {
        this.timeDifference = value;
    }

    /**
     * Gets the value of the hlr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHlr() {
        return hlr;
    }

    /**
     * Sets the value of the hlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHlr(String value) {
        this.hlr = value;
    }

    /**
     * Gets the value of the isBeelineSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBeelineSubscriber() {
        return isBeelineSubscriber;
    }

    /**
     * Sets the value of the isBeelineSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBeelineSubscriber(Boolean value) {
        this.isBeelineSubscriber = value;
    }

    /**
     * Gets the value of the isBeelinePool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBeelinePool() {
        return isBeelinePool;
    }

    /**
     * Sets the value of the isBeelinePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBeelinePool(Boolean value) {
        this.isBeelinePool = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the rn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRn() {
        return rn;
    }

    /**
     * Sets the value of the rn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRn(String value) {
        this.rn = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionId(String value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the platformId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * Sets the value of the platformId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformId(String value) {
        this.platformId = value;
    }

}
