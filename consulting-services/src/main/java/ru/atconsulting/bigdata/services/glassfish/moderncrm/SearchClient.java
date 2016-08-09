/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="SearchClient", propOrder={"searchClientRequest", "activityInfo"})
public class SearchClient {
    @XmlElement(required=true)
    protected SearchClientRequest searchClientRequest;
    @XmlElement(required=true)
    protected ActivityInfo activityInfo;

    public SearchClientRequest getSearchClientRequest() {
        return this.searchClientRequest;
    }

    public void setSearchClientRequest(SearchClientRequest value) {
        this.searchClientRequest = value;
    }

    public ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }
}

