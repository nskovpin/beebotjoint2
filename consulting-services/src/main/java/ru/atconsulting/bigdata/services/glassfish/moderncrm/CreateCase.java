/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ActivityInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.AddAttachmentRequestContext;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateCaseRequest;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateCase", propOrder={"createCaseRequest", "attachmentRequest", "activityInfo"})
public class CreateCase {
    @XmlElement(required=true)
    protected CreateCaseRequest createCaseRequest;
    protected AddAttachmentRequestContext attachmentRequest;
    @XmlElement(required=true)
    protected ActivityInfo activityInfo;

    public CreateCaseRequest getCreateCaseRequest() {
        return this.createCaseRequest;
    }

    public void setCreateCaseRequest(CreateCaseRequest value) {
        this.createCaseRequest = value;
    }

    public AddAttachmentRequestContext getAttachmentRequest() {
        return this.attachmentRequest;
    }

    public void setAttachmentRequest(AddAttachmentRequestContext value) {
        this.attachmentRequest = value;
    }

    public ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }
}

