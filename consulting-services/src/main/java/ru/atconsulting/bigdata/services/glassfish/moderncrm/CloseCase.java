/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ActivityInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CloseCaseRequest;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CloseCase", propOrder={"closeCaseRequest", "activityInfo"})
public class CloseCase {
    @XmlElement(required=true)
    protected CloseCaseRequest closeCaseRequest;
    @XmlElement(required=true)
    protected ActivityInfo activityInfo;

    public CloseCaseRequest getCloseCaseRequest() {
        return this.closeCaseRequest;
    }

    public void setCloseCaseRequest(CloseCaseRequest value) {
        this.closeCaseRequest = value;
    }

    public ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }
}

