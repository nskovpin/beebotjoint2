/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="NotificationInfo", propOrder={"notificationIndicator", "notificationEmail", "notificationPhone"})
public class NotificationInfo {
    protected boolean notificationIndicator;
    protected String notificationEmail;
    protected String notificationPhone;

    public boolean isNotificationIndicator() {
        return this.notificationIndicator;
    }

    public void setNotificationIndicator(boolean value) {
        this.notificationIndicator = value;
    }

    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    public String getNotificationPhone() {
        return this.notificationPhone;
    }

    public void setNotificationPhone(String value) {
        this.notificationPhone = value;
    }
}

