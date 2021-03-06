
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "fault", targetNamespace = "urn:gf-subscriber-info-service:xsd")
public class ServiceException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Fault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ServiceException(String message, Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ServiceException(String message, Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ru.atconsulting.bigdata.client.glassfish.generated.Fault
     */
    public Fault getFaultInfo() {
        return faultInfo;
    }

}
