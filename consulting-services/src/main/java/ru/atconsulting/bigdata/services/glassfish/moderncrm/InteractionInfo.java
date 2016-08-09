/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="InteractionInfo", propOrder={"serviceID", "callPhoneNumber", "endDate", "reasonCode1", "reasonCode2", "result", "type", "office", "officeID"})
public class InteractionInfo {
    protected String serviceID;
    protected String callPhoneNumber;
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar endDate;
    protected String reasonCode1;
    protected String reasonCode2;
    protected String result;
    protected String type;
    protected String office;
    protected String officeID;

    public String getServiceID() {
        return this.serviceID;
    }

    public void setServiceID(String value) {
        this.serviceID = value;
    }

    public String getCallPhoneNumber() {
        return this.callPhoneNumber;
    }

    public void setCallPhoneNumber(String value) {
        this.callPhoneNumber = value;
    }

    public XMLGregorianCalendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    public String getReasonCode1() {
        return this.reasonCode1;
    }

    public void setReasonCode1(String value) {
        this.reasonCode1 = value;
    }

    public String getReasonCode2() {
        return this.reasonCode2;
    }

    public void setReasonCode2(String value) {
        this.reasonCode2 = value;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String value) {
        this.result = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String value) {
        this.office = value;
    }

    public String getOfficeID() {
        return this.officeID;
    }

    public void setOfficeID(String value) {
        this.officeID = value;
    }
}

