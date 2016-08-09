/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="GetLastInteractionsRequest", propOrder={"serviceID", "count", "dateFrom", "dateTo"})
public class GetLastInteractionsRequest {
    @XmlElement(required=true)
    protected String serviceID;
    @XmlElement(required=true)
    @XmlSchemaType(name="positiveInteger")
    protected BigInteger count;
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar dateFrom;
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar dateTo;

    public String getServiceID() {
        return this.serviceID;
    }

    public void setServiceID(String value) {
        this.serviceID = value;
    }

    public BigInteger getCount() {
        return this.count;
    }

    public void setCount(BigInteger value) {
        this.count = value;
    }

    public XMLGregorianCalendar getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    public XMLGregorianCalendar getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }
}

