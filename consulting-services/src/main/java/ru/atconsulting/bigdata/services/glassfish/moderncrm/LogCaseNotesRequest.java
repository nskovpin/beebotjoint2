/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="LogCaseNotesRequest", propOrder={"caseNote", "logNoteActionType"})
public class LogCaseNotesRequest {
    @XmlElement(required=true)
    protected String caseNote;
    protected String logNoteActionType;

    public String getCaseNote() {
        return this.caseNote;
    }

    public void setCaseNote(String value) {
        this.caseNote = value;
    }

    public String getLogNoteActionType() {
        return this.logNoteActionType;
    }

    public void setLogNoteActionType(String value) {
        this.logNoteActionType = value;
    }
}

