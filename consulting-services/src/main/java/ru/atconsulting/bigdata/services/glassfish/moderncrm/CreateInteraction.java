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
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateInteractionRequest;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateInteraction", propOrder={"createInteractionRequest", "attachmentRequest", "activityInfo"})
public class CreateInteraction {
    @XmlElement(required=true)
    protected CreateInteractionRequest createInteractionRequest;
    protected AddAttachmentRequestContext attachmentRequest;
    @XmlElement(required=true)
    protected ActivityInfo activityInfo;

    public CreateInteractionRequest getCreateInteractionRequest() {
        return this.createInteractionRequest;
    }

    public void setCreateInteractionRequest(CreateInteractionRequest value) {
        this.createInteractionRequest = value;
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

