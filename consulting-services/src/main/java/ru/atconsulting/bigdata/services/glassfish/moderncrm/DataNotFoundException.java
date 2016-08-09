/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="DataNotFoundException", propOrder={"errorCode", "exception", "message"})
public class DataNotFoundException {
    protected String errorCode;
    protected String exception;
    protected String message;

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String getException() {
        return this.exception;
    }

    public void setException(String value) {
        this.exception = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }
}

