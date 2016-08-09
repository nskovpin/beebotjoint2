/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CloseCase;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CloseCaseResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateCase;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateCaseResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateClient;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateClientResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateInteraction;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateInteractionResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DataNotFoundException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetCaseListRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetCaseListResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetLastInteractionsRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetLastInteractionsResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ObjectFactory;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SearchClient;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SearchClientResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.UpdateCase;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.UpdateCaseResponse;

@WebService(name="ModernCRMInterface", targetNamespace="urn:gf-crmoperations:interface")
@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso(value={ObjectFactory.class})
public interface ModernCRMInterface {
    @WebMethod(operationName="CreateCase")
    @WebResult(name="createCaseResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public CreateCaseResponse createCase(@WebParam(name = "createCase", targetNamespace = "urn:gf-crmoperations:types", partName = "request") CreateCase var1) throws IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="UpdateCase")
    @WebResult(name="updateCaseResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public UpdateCaseResponse updateCase(@WebParam(name = "updateCase", targetNamespace = "urn:gf-crmoperations:types", partName = "request") UpdateCase var1) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="CloseCase")
    @WebResult(name="closeCaseResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public CloseCaseResponse closeCase(@WebParam(name = "closeCase", targetNamespace = "urn:gf-crmoperations:types", partName = "request") CloseCase var1) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="CreateInteraction")
    @WebResult(name="createInteractionResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public CreateInteractionResponse createInteraction(@WebParam(name = "createInteraction", targetNamespace = "urn:gf-crmoperations:types", partName = "request") CreateInteraction var1) throws IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="SearchClient")
    @WebResult(name="searchClientResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public SearchClientResponse searchClient(@WebParam(name = "searchClient", targetNamespace = "urn:gf-crmoperations:types", partName = "request") SearchClient var1) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="CreateClient")
    @WebResult(name="createClientResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public CreateClientResponse createClient(@WebParam(name = "createClient", targetNamespace = "urn:gf-crmoperations:types", partName = "request") CreateClient var1) throws IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="GetLastInteractions")
    @WebResult(name="getLastInteractionsResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public GetLastInteractionsResponse getLastInteractions(@WebParam(name = "getLastInteractionsRequest", targetNamespace = "urn:gf-crmoperations:types", partName = "request") GetLastInteractionsRequest var1) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception;

    @WebMethod(operationName="GetCaseList")
    @WebResult(name="getCaseListResponse", targetNamespace="urn:gf-crmoperations:types", partName="result")
    public GetCaseListResponse getCaseList(@WebParam(name = "getCaseListRequest", targetNamespace = "urn:gf-crmoperations:types", partName = "request") GetCaseListRequest var1) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception;
}

