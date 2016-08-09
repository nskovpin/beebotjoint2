
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Events complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Events">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="ctnA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ctnB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="addInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="marketCodeA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="marketCodeB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Events", propOrder = {
    "event"
})
public class Events implements Serializable {

    @XmlElement(required = true)
    protected List<Event> event;

    /**
     * Gets the value of the event property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Events.Event }
     *
     *
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="ctnA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ctnB" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="addInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="marketCodeA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="marketCodeB" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventDate",
        "ctnA",
        "ctnB",
        "addInfo",
        "marketCodeA",
        "marketCodeB",
        "channel",
        "eventType",
        "resultCode",
        "appName",
        "eventId"
    })
    public static class Event implements Serializable{

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar eventDate;
        @XmlElement(required = true)
        protected String ctnA;
        @XmlElement(required = true)
        protected String ctnB;
        @XmlElement(required = true)
        protected String addInfo;
        @XmlElement(required = true)
        protected String marketCodeA;
        @XmlElement(required = true)
        protected String marketCodeB;
        @XmlElement(required = true)
        protected String channel;
        @XmlElement(required = true)
        protected String eventType;
        @XmlElement(required = true)
        protected String resultCode;
        @XmlElement(required = true)
        protected String appName;
        @XmlElement(required = true)
        protected String eventId;

        /**
         * Gets the value of the eventDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEventDate() {
            return eventDate;
        }

        /**
         * Sets the value of the eventDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEventDate(XMLGregorianCalendar value) {
            this.eventDate = value;
        }

        /**
         * Gets the value of the ctnA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtnA() {
            return ctnA;
        }

        /**
         * Sets the value of the ctnA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtnA(String value) {
            this.ctnA = value;
        }

        /**
         * Gets the value of the ctnB property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtnB() {
            return ctnB;
        }

        /**
         * Sets the value of the ctnB property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtnB(String value) {
            this.ctnB = value;
        }

        /**
         * Gets the value of the addInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddInfo() {
            return addInfo;
        }

        /**
         * Sets the value of the addInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddInfo(String value) {
            this.addInfo = value;
        }

        /**
         * Gets the value of the marketCodeA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarketCodeA() {
            return marketCodeA;
        }

        /**
         * Sets the value of the marketCodeA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarketCodeA(String value) {
            this.marketCodeA = value;
        }

        /**
         * Gets the value of the marketCodeB property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarketCodeB() {
            return marketCodeB;
        }

        /**
         * Sets the value of the marketCodeB property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarketCodeB(String value) {
            this.marketCodeB = value;
        }

        /**
         * Gets the value of the channel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannel(String value) {
            this.channel = value;
        }

        /**
         * Gets the value of the eventType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventType() {
            return eventType;
        }

        /**
         * Sets the value of the eventType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventType(String value) {
            this.eventType = value;
        }

        /**
         * Gets the value of the resultCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultCode() {
            return resultCode;
        }

        /**
         * Sets the value of the resultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultCode(String value) {
            this.resultCode = value;
        }

        /**
         * Gets the value of the appName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppName() {
            return appName;
        }

        /**
         * Sets the value of the appName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppName(String value) {
            this.appName = value;
        }

        /**
         * Gets the value of the eventId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventId() {
            return eventId;
        }

        /**
         * Sets the value of the eventId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventId(String value) {
            this.eventId = value;
        }

    }

}
