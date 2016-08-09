
package ru.atconsulting.bigdata.services.glassfish.trouble;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CaseToTroubleTicketInterface", targetNamespace = "urn:gf-case-to-trouble:service:wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CaseToTroubleTicketInterface {


    /**
     * 
     * @param part
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.trouble.GetTTInfoByCoordinateResponse
     * @throws GetTTInfoByCoordinateFault_Exception
     */
    @WebMethod
    @WebResult(name = "getTTInfoByCoordinateResponse", targetNamespace = "urn:gf-case-to-trouble:service:types", partName = "part")
    public GetTTInfoByCoordinateResponse getTTInfoByCoordinate(
            @WebParam(name = "getTTInfoByCoordinateRequest", targetNamespace = "urn:gf-case-to-trouble:service:types", partName = "part")
            GetTTInfoByCoordinateRequest part)
        throws GetTTInfoByCoordinateFault_Exception
    ;

}
