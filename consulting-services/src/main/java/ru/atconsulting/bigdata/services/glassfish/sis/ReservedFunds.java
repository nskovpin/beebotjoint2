
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for ReservedFunds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservedFunds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reserveAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reserveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservedFunds", propOrder = {
    "balanceName",
    "balanceID",
    "reserveAmount",
    "reserveDate"
})
public class ReservedFunds implements Serializable {

    @XmlElement(required = true)
    protected String balanceName;
    @XmlElement(required = true)
    protected String balanceID;
    protected double reserveAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reserveDate;

    /**
     * Gets the value of the balanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceName() {
        return balanceName;
    }

    /**
     * Sets the value of the balanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceName(String value) {
        this.balanceName = value;
    }

    /**
     * Gets the value of the balanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceID() {
        return balanceID;
    }

    /**
     * Sets the value of the balanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceID(String value) {
        this.balanceID = value;
    }

    /**
     * Gets the value of the reserveAmount property.
     * 
     */
    public double getReserveAmount() {
        return reserveAmount;
    }

    /**
     * Sets the value of the reserveAmount property.
     * 
     */
    public void setReserveAmount(double value) {
        this.reserveAmount = value;
    }

    /**
     * Gets the value of the reserveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReserveDate() {
        return reserveDate;
    }

    /**
     * Sets the value of the reserveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReserveDate(XMLGregorianCalendar value) {
        this.reserveDate = value;
    }

}
