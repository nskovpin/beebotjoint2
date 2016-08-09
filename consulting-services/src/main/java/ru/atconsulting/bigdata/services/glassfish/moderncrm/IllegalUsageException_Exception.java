/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.ws.WebFault;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException;

@WebFault(name="illegalUsageException", targetNamespace="urn:gf-crmoperations:types")
public class IllegalUsageException_Exception
extends Exception {
    private IllegalUsageException faultInfo;

    public IllegalUsageException_Exception(String message, IllegalUsageException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public IllegalUsageException_Exception(String message, IllegalUsageException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public IllegalUsageException getFaultInfo() {
        return this.faultInfo;
    }
}

