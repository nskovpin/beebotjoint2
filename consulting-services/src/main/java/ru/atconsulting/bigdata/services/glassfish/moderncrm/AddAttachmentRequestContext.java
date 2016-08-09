/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.Attachment;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="AddAttachmentRequestContext", propOrder={"moveAttachment", "attachment"})
public class AddAttachmentRequestContext {
    protected Boolean moveAttachment;
    @XmlElement(required=true)
    protected List<Attachment> attachment;

    public Boolean isMoveAttachment() {
        return this.moveAttachment;
    }

    public void setMoveAttachment(Boolean value) {
        this.moveAttachment = value;
    }

    public List<Attachment> getAttachment() {
        if (this.attachment == null) {
            this.attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }
}

