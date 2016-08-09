/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.AccountIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ActivityInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.AddAttachmentRequestContext;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.Attachment;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CRMObjectData;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CaseInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CaseTypesData;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CloseCase;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CloseCaseRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CloseCaseResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CompanyInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ContactIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateCase;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateCaseRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateCaseResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateClient;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateClientRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateClientResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateInteraction;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateInteractionRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CreateInteractionResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DataNotFoundException;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DocumentInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ExternalTTInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.FinAccountIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.FlexibleAttribute;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetCaseListRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetCaseListResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetLastInteractionsRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.GetLastInteractionsResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.HeadquartersInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InteractionInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.LogCaseNotesRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.MnpInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.NotificationInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.PrimaryContactInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SearchClient;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SearchClientRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SearchClientResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ServiceIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SiteIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.TopicRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.UpdateCase;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.UpdateCaseRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.UpdateCaseResponse;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.WorkflowInfo;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlRegistry
public class ObjectFactory {
    private static final QName _SearchClientResponse_QNAME = new QName("urn:gf-crmoperations:types", "searchClientResponse");
    private static final QName _CreateClient_QNAME = new QName("urn:gf-crmoperations:types", "createClient");
    private static final QName _GetLastInteractionsRequest_QNAME = new QName("urn:gf-crmoperations:types", "getLastInteractionsRequest");
    private static final QName _CreateClientResponse_QNAME = new QName("urn:gf-crmoperations:types", "createClientResponse");
    private static final QName _SearchClient_QNAME = new QName("urn:gf-crmoperations:types", "searchClient");
    private static final QName _CreateInteraction_QNAME = new QName("urn:gf-crmoperations:types", "createInteraction");
    private static final QName _UpdateCase_QNAME = new QName("urn:gf-crmoperations:types", "updateCase");
    private static final QName _CreateCaseResponse_QNAME = new QName("urn:gf-crmoperations:types", "createCaseResponse");
    private static final QName _GetLastInteractionsResponse_QNAME = new QName("urn:gf-crmoperations:types", "getLastInteractionsResponse");
    private static final QName _UpdateCaseResponse_QNAME = new QName("urn:gf-crmoperations:types", "updateCaseResponse");
    private static final QName _IllegalUsageException_QNAME = new QName("urn:gf-crmoperations:types", "illegalUsageException");
    private static final QName _CreateInteractionResponse_QNAME = new QName("urn:gf-crmoperations:types", "createInteractionResponse");
    private static final QName _DataNotFoundException_QNAME = new QName("urn:gf-crmoperations:types", "dataNotFoundException");
    private static final QName _GetCaseListRequest_QNAME = new QName("urn:gf-crmoperations:types", "getCaseListRequest");
    private static final QName _InternalSystemErrorException_QNAME = new QName("urn:gf-crmoperations:types", "internalSystemErrorException");
    private static final QName _CreateCase_QNAME = new QName("urn:gf-crmoperations:types", "createCase");
    private static final QName _CloseCase_QNAME = new QName("urn:gf-crmoperations:types", "closeCase");
    private static final QName _CloseCaseResponse_QNAME = new QName("urn:gf-crmoperations:types", "closeCaseResponse");
    private static final QName _GetCaseListResponse_QNAME = new QName("urn:gf-crmoperations:types", "getCaseListResponse");

    public InternalSystemErrorException createInternalSystemErrorException() {
        return new InternalSystemErrorException();
    }

    public CreateCase createCreateCase() {
        return new CreateCase();
    }

    public CloseCase createCloseCase() {
        return new CloseCase();
    }

    public GetCaseListResponse createGetCaseListResponse() {
        return new GetCaseListResponse();
    }

    public CloseCaseResponse createCloseCaseResponse() {
        return new CloseCaseResponse();
    }

    public IllegalUsageException createIllegalUsageException() {
        return new IllegalUsageException();
    }

    public CreateInteractionResponse createCreateInteractionResponse() {
        return new CreateInteractionResponse();
    }

    public UpdateCaseResponse createUpdateCaseResponse() {
        return new UpdateCaseResponse();
    }

    public GetCaseListRequest createGetCaseListRequest() {
        return new GetCaseListRequest();
    }

    public DataNotFoundException createDataNotFoundException() {
        return new DataNotFoundException();
    }

    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    public GetLastInteractionsResponse createGetLastInteractionsResponse() {
        return new GetLastInteractionsResponse();
    }

    public CreateCaseResponse createCreateCaseResponse() {
        return new CreateCaseResponse();
    }

    public UpdateCase createUpdateCase() {
        return new UpdateCase();
    }

    public CreateInteraction createCreateInteraction() {
        return new CreateInteraction();
    }

    public SearchClient createSearchClient() {
        return new SearchClient();
    }

    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    public SearchClientResponse createSearchClientResponse() {
        return new SearchClientResponse();
    }

    public GetLastInteractionsRequest createGetLastInteractionsRequest() {
        return new GetLastInteractionsRequest();
    }

    public Attachment createAttachment() {
        return new Attachment();
    }

    public MnpInfo createMnpInfo() {
        return new MnpInfo();
    }

    public LogCaseNotesRequest createLogCaseNotesRequest() {
        return new LogCaseNotesRequest();
    }

    public CaseInfo createCaseInfo() {
        return new CaseInfo();
    }

    public CreateCaseRequest createCreateCaseRequest() {
        return new CreateCaseRequest();
    }

    public InteractionInfo createInteractionInfo() {
        return new InteractionInfo();
    }

    public UpdateCaseRequest createUpdateCaseRequest() {
        return new UpdateCaseRequest();
    }

    public HeadquartersInfo createHeadquartersInfo() {
        return new HeadquartersInfo();
    }

    public FlexibleAttribute createFlexibleAttribute() {
        return new FlexibleAttribute();
    }

    public SiteIdent createSiteIdent() {
        return new SiteIdent();
    }

    public FinAccountIdent createFinAccountIdent() {
        return new FinAccountIdent();
    }

    public ContactIdent createContactIdent() {
        return new ContactIdent();
    }

    public AccountIdent createAccountIdent() {
        return new AccountIdent();
    }

    public WorkflowInfo createWorkflowInfo() {
        return new WorkflowInfo();
    }

    public CreateClientRequest createCreateClientRequest() {
        return new CreateClientRequest();
    }

    public CreateInteractionRequest createCreateInteractionRequest() {
        return new CreateInteractionRequest();
    }

    public SearchClientRequest createSearchClientRequest() {
        return new SearchClientRequest();
    }

    public CaseTypesData createCaseTypesData() {
        return new CaseTypesData();
    }

    public CloseCaseRequest createCloseCaseRequest() {
        return new CloseCaseRequest();
    }

    public AddAttachmentRequestContext createAddAttachmentRequestContext() {
        return new AddAttachmentRequestContext();
    }

    public PrimaryContactInfo createPrimaryContactInfo() {
        return new PrimaryContactInfo();
    }

    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    public ExternalTTInfo createExternalTTInfo() {
        return new ExternalTTInfo();
    }

    public ServiceIdent createServiceIdent() {
        return new ServiceIdent();
    }

    public TopicRequest createTopicRequest() {
        return new TopicRequest();
    }

    public CompanyInfo createCompanyInfo() {
        return new CompanyInfo();
    }

    public ActivityInfo createActivityInfo() {
        return new ActivityInfo();
    }

    public CRMObjectData createCRMObjectData() {
        return new CRMObjectData();
    }

    public NotificationInfo createNotificationInfo() {
        return new NotificationInfo();
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="searchClientResponse")
    public JAXBElement<SearchClientResponse> createSearchClientResponse(SearchClientResponse value) {
        return new JAXBElement<SearchClientResponse>(_SearchClientResponse_QNAME, SearchClientResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="getLastInteractionsRequest")
    public JAXBElement<GetLastInteractionsRequest> createGetLastInteractionsRequest(GetLastInteractionsRequest value) {
        return new JAXBElement<GetLastInteractionsRequest>(_GetLastInteractionsRequest_QNAME, GetLastInteractionsRequest.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="searchClient")
    public JAXBElement<SearchClient> createSearchClient(SearchClient value) {
        return new JAXBElement<SearchClient>(_SearchClient_QNAME, SearchClient.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="createInteraction")
    public JAXBElement<CreateInteraction> createCreateInteraction(CreateInteraction value) {
        return new JAXBElement<CreateInteraction>(_CreateInteraction_QNAME, CreateInteraction.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="updateCase")
    public JAXBElement<UpdateCase> createUpdateCase(UpdateCase value) {
        return new JAXBElement<UpdateCase>(_UpdateCase_QNAME, UpdateCase.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="createCaseResponse")
    public JAXBElement<CreateCaseResponse> createCreateCaseResponse(CreateCaseResponse value) {
        return new JAXBElement<CreateCaseResponse>(_CreateCaseResponse_QNAME, CreateCaseResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="getLastInteractionsResponse")
    public JAXBElement<GetLastInteractionsResponse> createGetLastInteractionsResponse(GetLastInteractionsResponse value) {
        return new JAXBElement<GetLastInteractionsResponse>(_GetLastInteractionsResponse_QNAME, GetLastInteractionsResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="updateCaseResponse")
    public JAXBElement<UpdateCaseResponse> createUpdateCaseResponse(UpdateCaseResponse value) {
        return new JAXBElement<UpdateCaseResponse>(_UpdateCaseResponse_QNAME, UpdateCaseResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="illegalUsageException")
    public JAXBElement<IllegalUsageException> createIllegalUsageException(IllegalUsageException value) {
        return new JAXBElement<IllegalUsageException>(_IllegalUsageException_QNAME, IllegalUsageException.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="createInteractionResponse")
    public JAXBElement<CreateInteractionResponse> createCreateInteractionResponse(CreateInteractionResponse value) {
        return new JAXBElement<CreateInteractionResponse>(_CreateInteractionResponse_QNAME, CreateInteractionResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="dataNotFoundException")
    public JAXBElement<DataNotFoundException> createDataNotFoundException(DataNotFoundException value) {
        return new JAXBElement<DataNotFoundException>(_DataNotFoundException_QNAME, DataNotFoundException.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="getCaseListRequest")
    public JAXBElement<GetCaseListRequest> createGetCaseListRequest(GetCaseListRequest value) {
        return new JAXBElement<GetCaseListRequest>(_GetCaseListRequest_QNAME, GetCaseListRequest.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="internalSystemErrorException")
    public JAXBElement<InternalSystemErrorException> createInternalSystemErrorException(InternalSystemErrorException value) {
        return new JAXBElement<InternalSystemErrorException>(_InternalSystemErrorException_QNAME, InternalSystemErrorException.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="createCase")
    public JAXBElement<CreateCase> createCreateCase(CreateCase value) {
        return new JAXBElement<CreateCase>(_CreateCase_QNAME, CreateCase.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="closeCase")
    public JAXBElement<CloseCase> createCloseCase(CloseCase value) {
        return new JAXBElement<CloseCase>(_CloseCase_QNAME, CloseCase.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="closeCaseResponse")
    public JAXBElement<CloseCaseResponse> createCloseCaseResponse(CloseCaseResponse value) {
        return new JAXBElement<CloseCaseResponse>(_CloseCaseResponse_QNAME, CloseCaseResponse.class, null, value);
    }

    @XmlElementDecl(namespace="urn:gf-crmoperations:types", name="getCaseListResponse")
    public JAXBElement<GetCaseListResponse> createGetCaseListResponse(GetCaseListResponse value) {
        return new JAXBElement<GetCaseListResponse>(_GetCaseListResponse_QNAME, GetCaseListResponse.class, null, value);
    }
}

