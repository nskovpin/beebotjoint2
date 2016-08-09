
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payments" type="{urn:gf-subscriber-info-service:xsd}Payments" minOccurs="0"/>
 *         &lt;element name="interacts" type="{urn:gf-subscriber-info-service:xsd}Interacts" minOccurs="0"/>
 *         &lt;element name="events" type="{urn:gf-subscriber-info-service:xsd}Events" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHistory", propOrder = {
    "payments",
    "interacts",
    "events"
})
public class ResponseHistory {

    protected Payments payments;
    protected Interacts interacts;
    protected Events events;

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link Payments }
     *     
     */
    public Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payments }
     *     
     */
    public void setPayments(Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the interacts property.
     * 
     * @return
     *     possible object is
     *     {@link Interacts }
     *     
     */
    public Interacts getInteracts() {
        return interacts;
    }

    /**
     * Sets the value of the interacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interacts }
     *     
     */
    public void setInteracts(Interacts value) {
        this.interacts = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link Events }
     *     
     */
    public Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link Events }
     *     
     */
    public void setEvents(Events value) {
        this.events = value;
    }

}
