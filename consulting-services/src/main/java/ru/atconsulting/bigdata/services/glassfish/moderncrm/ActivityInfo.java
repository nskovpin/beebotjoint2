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
@XmlType(name="ActivityInfo", propOrder={"userName", "sourceApplication", "sourceChannel", "activityReason", "requestTime", "note"})
public class ActivityInfo {
    protected String userName;
    protected String sourceApplication;
    protected String sourceChannel;
    protected String activityReason;
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar requestTime;
    protected String note;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String value) {
        this.userName = value;
    }

    public String getSourceApplication() {
        return this.sourceApplication;
    }

    public void setSourceApplication(String value) {
        this.sourceApplication = value;
    }

    public String getSourceChannel() {
        return this.sourceChannel;
    }

    public void setSourceChannel(String value) {
        this.sourceChannel = value;
    }

    public String getActivityReason() {
        return this.activityReason;
    }

    public void setActivityReason(String value) {
        this.activityReason = value;
    }

    public XMLGregorianCalendar getRequestTime() {
        return this.requestTime;
    }

    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String value) {
        this.note = value;
    }
}

