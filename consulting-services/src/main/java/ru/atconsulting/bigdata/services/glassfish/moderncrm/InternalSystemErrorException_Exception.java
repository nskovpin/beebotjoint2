/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.ws.WebFault;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException;

@WebFault(name="internalSystemErrorException", targetNamespace="urn:gf-crmoperations:types")
public class InternalSystemErrorException_Exception
extends Exception {
    private InternalSystemErrorException faultInfo;

    public InternalSystemErrorException_Exception(String message, InternalSystemErrorException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public InternalSystemErrorException_Exception(String message, InternalSystemErrorException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public InternalSystemErrorException getFaultInfo() {
        return this.faultInfo;
    }
}

