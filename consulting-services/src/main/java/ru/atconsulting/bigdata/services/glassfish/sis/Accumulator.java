
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigInteger;


/**
 * <p>Java class for accumulator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accumulator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accumulatorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="accumulatorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accumulatorNextReset" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accumulatorZeroDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accumulator", propOrder = {
    "accumulatorName",
    "accumulatorAmount",
    "accumulatorType",
    "accumulatorNextReset",
    "accumulatorZeroDay"
})
public class Accumulator implements Serializable {

    @XmlElement(required = true)
    protected String accumulatorName;
    protected double accumulatorAmount;
    @XmlElement(required = true)
    protected String accumulatorType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accumulatorNextReset;
    protected BigInteger accumulatorZeroDay;

    /**
     * Gets the value of the accumulatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatorName() {
        return accumulatorName;
    }

    /**
     * Sets the value of the accumulatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatorName(String value) {
        this.accumulatorName = value;
    }

    /**
     * Gets the value of the accumulatorAmount property.
     * 
     */
    public double getAccumulatorAmount() {
        return accumulatorAmount;
    }

    /**
     * Sets the value of the accumulatorAmount property.
     * 
     */
    public void setAccumulatorAmount(double value) {
        this.accumulatorAmount = value;
    }

    /**
     * Gets the value of the accumulatorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatorType() {
        return accumulatorType;
    }

    /**
     * Sets the value of the accumulatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatorType(String value) {
        this.accumulatorType = value;
    }

    /**
     * Gets the value of the accumulatorNextReset property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccumulatorNextReset() {
        return accumulatorNextReset;
    }

    /**
     * Sets the value of the accumulatorNextReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccumulatorNextReset(XMLGregorianCalendar value) {
        this.accumulatorNextReset = value;
    }

    /**
     * Gets the value of the accumulatorZeroDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccumulatorZeroDay() {
        return accumulatorZeroDay;
    }

    /**
     * Sets the value of the accumulatorZeroDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccumulatorZeroDay(BigInteger value) {
        this.accumulatorZeroDay = value;
    }

}
