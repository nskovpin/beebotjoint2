
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for balance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="balance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balanceExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balance", propOrder = {
    "balanceName",
    "balanceID",
    "balanceAmount",
    "balanceExpirationDate"
})
public class Balance implements Serializable {

    @XmlElement(required = true)
    protected String balanceName;
    @XmlElement(required = true)
    protected String balanceID;
    @XmlElement(required = true)
    protected String balanceAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar balanceExpirationDate;

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
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceAmount(String value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the balanceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBalanceExpirationDate() {
        return balanceExpirationDate;
    }

    /**
     * Sets the value of the balanceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBalanceExpirationDate(XMLGregorianCalendar value) {
        this.balanceExpirationDate = value;
    }

}
