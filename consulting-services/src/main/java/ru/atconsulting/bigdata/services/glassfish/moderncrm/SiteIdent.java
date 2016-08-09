/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="SiteIdent", propOrder={"mrkCode", "siteID", "externalId"})
public class SiteIdent {
    protected String mrkCode;
    protected String siteID;
    protected String externalId;

    public String getMrkCode() {
        return this.mrkCode;
    }

    public void setMrkCode(String value) {
        this.mrkCode = value;
    }

    public String getSiteID() {
        return this.siteID;
    }

    public void setSiteID(String value) {
        this.siteID = value;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String value) {
        this.externalId = value;
    }
}

