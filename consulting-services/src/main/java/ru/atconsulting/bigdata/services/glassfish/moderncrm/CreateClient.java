/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ActivityInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateClientRequest;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateClient", propOrder={"createClientRequest", "activityInfo"})
public class CreateClient {
    @XmlElement(required=true)
    protected CreateClientRequest createClientRequest;
    @XmlElement(required=true)
    protected ActivityInfo activityInfo;

    public CreateClientRequest getCreateClientRequest() {
        return this.createClientRequest;
    }

    public void setCreateClientRequest(CreateClientRequest value) {
        this.createClientRequest = value;
    }

    public ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }
}

