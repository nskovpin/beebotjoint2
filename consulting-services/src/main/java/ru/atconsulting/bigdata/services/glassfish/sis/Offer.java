
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigInteger;


/**
 * <p>Java class for Offer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="offerState" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="offerType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="offerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offer", propOrder = {
    "activeDt",
    "offerState",
    "offerType",
    "offerId",
    "offerName"
})
public class Offer implements Serializable {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeDt;
    @XmlElement(required = true)
    protected BigInteger offerState;
    @XmlElement(required = true)
    protected BigInteger offerType;
    protected BigInteger offerId;
    protected String offerName;

    /**
     * Gets the value of the activeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDt() {
        return activeDt;
    }

    /**
     * Sets the value of the activeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDt(XMLGregorianCalendar value) {
        this.activeDt = value;
    }

    /**
     * Gets the value of the offerState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferState() {
        return offerState;
    }

    /**
     * Sets the value of the offerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferState(BigInteger value) {
        this.offerState = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferType(BigInteger value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferId(BigInteger value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the offerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Sets the value of the offerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferName(String value) {
        this.offerName = value;
    }

}
