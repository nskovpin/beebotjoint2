/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="Attachment", propOrder={"fileName", "filePath", "mimeType", "creator", "creationDate", "title", "type", "subtype", "description", "relatedBranches"})
public class Attachment {
    @XmlElement(required=true)
    protected String fileName;
    @XmlElement(required=true)
    protected String filePath;
    @XmlElement(required=true)
    protected String mimeType;
    @XmlElement(required=true)
    protected String creator;
    @XmlElement(required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(required=true)
    protected String title;
    @XmlElement(required=true)
    protected String type;
    @XmlElement(required=true)
    protected String subtype;
    protected String description;
    protected List<String> relatedBranches;

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String value) {
        this.fileName = value;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String value) {
        this.filePath = value;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String value) {
        this.mimeType = value;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String value) {
        this.creator = value;
    }

    public XMLGregorianCalendar getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public void setSubtype(String value) {
        this.subtype = value;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public List<String> getRelatedBranches() {
        if (this.relatedBranches == null) {
            this.relatedBranches = new ArrayList<String>();
        }
        return this.relatedBranches;
    }
}

