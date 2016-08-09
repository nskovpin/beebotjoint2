
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * <p>Java class for Packet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Packet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="frequencySubscriptionFee" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="frequencyResetAccumulator" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="rest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dateResetPacket" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateSubscriptionFee" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSpeedDown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSpeedUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="accName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Packet", propOrder = {
    "name",
    "unit",
    "size",
    "frequencySubscriptionFee",
    "frequencyResetAccumulator",
    "rest",
    "dateResetPacket",
    "dateSubscriptionFee",
    "state",
    "isSpeedDown",
    "isSpeedUp",
    "priority",
    "accName",
    "soc"
})
public class Packet implements Serializable {

    @XmlElement(required = true)
    protected String name;
    protected String unit;
    protected BigDecimal size;
    @XmlSchemaType(name = "unsignedByte")
    protected Short frequencySubscriptionFee;
    @XmlSchemaType(name = "unsignedByte")
    protected Short frequencyResetAccumulator;
    protected BigDecimal rest;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateResetPacket;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSubscriptionFee;
    protected String state;
    protected Boolean isSpeedDown;
    protected Boolean isSpeedUp;
    @XmlSchemaType(name = "unsignedByte")
    protected Short priority;
    protected String accName;
    protected String soc;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSize(BigDecimal value) {
        this.size = value;
    }

    /**
     * Gets the value of the frequencySubscriptionFee property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFrequencySubscriptionFee() {
        return frequencySubscriptionFee;
    }

    /**
     * Sets the value of the frequencySubscriptionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFrequencySubscriptionFee(Short value) {
        this.frequencySubscriptionFee = value;
    }

    /**
     * Gets the value of the frequencyResetAccumulator property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFrequencyResetAccumulator() {
        return frequencyResetAccumulator;
    }

    /**
     * Sets the value of the frequencyResetAccumulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFrequencyResetAccumulator(Short value) {
        this.frequencyResetAccumulator = value;
    }

    /**
     * Gets the value of the rest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRest() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRest(BigDecimal value) {
        this.rest = value;
    }

    /**
     * Gets the value of the dateResetPacket property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateResetPacket() {
        return dateResetPacket;
    }

    /**
     * Sets the value of the dateResetPacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateResetPacket(XMLGregorianCalendar value) {
        this.dateResetPacket = value;
    }

    /**
     * Gets the value of the dateSubscriptionFee property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSubscriptionFee() {
        return dateSubscriptionFee;
    }

    /**
     * Sets the value of the dateSubscriptionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSubscriptionFee(XMLGregorianCalendar value) {
        this.dateSubscriptionFee = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the isSpeedDown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpeedDown() {
        return isSpeedDown;
    }

    /**
     * Sets the value of the isSpeedDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpeedDown(Boolean value) {
        this.isSpeedDown = value;
    }

    /**
     * Gets the value of the isSpeedUp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpeedUp() {
        return isSpeedUp;
    }

    /**
     * Sets the value of the isSpeedUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpeedUp(Boolean value) {
        this.isSpeedUp = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * Gets the value of the accName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccName() {
        return accName;
    }

    /**
     * Sets the value of the accName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccName(String value) {
        this.accName = value;
    }

    /**
     * Gets the value of the soc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoc() {
        return soc;
    }

    /**
     * Sets the value of the soc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoc(String value) {
        this.soc = value;
    }

}
