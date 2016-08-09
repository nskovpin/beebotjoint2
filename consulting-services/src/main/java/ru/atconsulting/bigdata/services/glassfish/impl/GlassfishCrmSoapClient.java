package ru.atconsulting.bigdata.services.glassfish.impl;

import org.joda.time.DateTime;
import org.joda.time.Days;
import ru.atconsulting.bigdata.services.ClientProperties;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.ServicesNames;
import ru.atconsulting.bigdata.services.glassfish.Reason;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.*;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by NSkovpin on 11.07.2016.
 */
public class GlassfishCrmSoapClient {

    public static final String INTERACTION_TITLE = "Diagnostica";
    public static final String TYPE = "Bot";
    public static final String MEDIA = "Telegram";
    public static final String DIRECTION = "1";
    public static final String ACTIVITY_USERNAME = "Tech_GlassFish_MS";
    public static final String ACTIVITY_SOURCE_APPLICATION = "Telegram";
    public static final String ACTIVITY_SOURCE_CHANNEL = "Bot";
    public static final String ACTIVITY_REASON = "Creating new interaction in CRM";

    public static final String COUNT = "20";

    public static final String OPEN = "Open";
    public static final String CLOSED = "Closed";
    public static final String NONE = "None";
    public static final String CLOSED_IN_PERIOD = "ClosedInPeriod";

    public CreateInteractionResponse createInteractionResponse(String ctn, String glassfishName,
                                                               String glassfishPassword, String url,
                                                               String note, String reasonCode1,
                                                               String reasonCode2, String result) throws ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception, DatatypeConfigurationException {

        long milliSeconds = System.currentTimeMillis();
        DateTime currentTime = new DateTime(milliSeconds);

        CRMOperationsSOAPService crmOperationsSOAPService = new CRMOperationsSOAPService();
        ModernCRMInterface modernCRMInterface = crmOperationsSOAPService.getModernCRMInterfaceBindingPort();

        CreateInteraction createInteraction = new CreateInteraction();

        CreateInteractionRequest createInteractionRequest = new CreateInteractionRequest();
        createInteractionRequest.setInteractionTitle(INTERACTION_TITLE);
        createInteractionRequest.setType(TYPE);
        createInteractionRequest.setMedia(MEDIA);
        createInteractionRequest.setNotes(note);
        createInteractionRequest.setDirection(new BigInteger(DIRECTION));
        XMLGregorianCalendar startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(currentTime.toGregorianCalendar());
        XMLGregorianCalendar endDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(currentTime.toGregorianCalendar());
        createInteractionRequest.setStartDate(startDate);
        createInteractionRequest.setEndDate(endDate);

        ServiceIdent serviceIdent = new ServiceIdent();
        serviceIdent.setServiceID(ctn);
        createInteractionRequest.setReporterServiceIdent(serviceIdent);

        TopicRequest topicRequest = new TopicRequest();
        topicRequest.setReasonCode1(reasonCode1);
        topicRequest.setReasonCode2(reasonCode2);
        topicRequest.setIsPrimary(true);
        topicRequest.setResult(result);
        createInteractionRequest.getTopics().add(topicRequest);
        createInteraction.setCreateInteractionRequest(createInteractionRequest);

        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setUserName(ACTIVITY_USERNAME);
        activityInfo.setSourceApplication(ACTIVITY_SOURCE_APPLICATION);
        activityInfo.setSourceChannel(ACTIVITY_SOURCE_CHANNEL);
        activityInfo.setActivityReason(ACTIVITY_REASON);

        XMLGregorianCalendar requestDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(currentTime.toGregorianCalendar());
        activityInfo.setRequestTime(requestDate);

        createInteraction.setActivityInfo(activityInfo);

        Helper.setProperCredentialsAndUrl((BindingProvider) modernCRMInterface,
                glassfishName, glassfishPassword, url);

        return modernCRMInterface.createInteraction(createInteraction);
    }

    public String createInteractionResponseService(String ctn, String glassfishName,
                                                   String glassfishPassword, String url,
                                                   String note, String reasonCode1,
                                                   String reasonCode2, String result) throws ServiceException, DatatypeConfigurationException, InternalSystemErrorException_Exception, IllegalUsageException_Exception {
        CreateInteractionResponse createInteractionResponse = createInteractionResponse(ctn, glassfishName, glassfishPassword, url, note, reasonCode1, reasonCode2, result);
        return createInteractionResponse.getInteractionId();
    }


    public GetLastInteractionsResponse getLastInteractions(String ctn, String glassfishName,
                                                           String glassfishPassword, String url, Integer period) throws IllegalUsageException_Exception, InternalSystemErrorException_Exception, DataNotFoundException_Exception, DatatypeConfigurationException {

        long milliSeconds = System.currentTimeMillis();
        DateTime currentTime = new DateTime(milliSeconds);
        XMLGregorianCalendar from = DatatypeFactory.newInstance().newXMLGregorianCalendar(currentTime.minusDays(period).toGregorianCalendar());
        XMLGregorianCalendar to = DatatypeFactory.newInstance().newXMLGregorianCalendar(currentTime.toGregorianCalendar());

        CRMOperationsSOAPService crmOperationsSOAPService = new CRMOperationsSOAPService();
        ModernCRMInterface modernCRMInterface = crmOperationsSOAPService.getModernCRMInterfaceBindingPort();

        GetLastInteractionsRequest lastInteractionsRequest = new GetLastInteractionsRequest();
        lastInteractionsRequest.setServiceID(ctn);
        lastInteractionsRequest.setCount(new BigInteger(COUNT));
        lastInteractionsRequest.setDateFrom(from);
        lastInteractionsRequest.setDateTo(to);

        Helper.setProperCredentialsAndUrl((BindingProvider) modernCRMInterface,
                glassfishName, glassfishPassword, url);

        return modernCRMInterface.getLastInteractions(lastInteractionsRequest);
    }

    public Boolean getLastInteractionsService(String ctn, String glassfishName,
                                              String glassfishPassword, String url, Integer period) throws IllegalUsageException_Exception, InternalSystemErrorException_Exception, DatatypeConfigurationException {
        try {
            GetLastInteractionsResponse lastInteractionsResponse = getLastInteractions(ctn, glassfishName, glassfishPassword, url, period);
            return lastInteractionsResponse != null ? true : false;
        } catch (DataNotFoundException_Exception e) {
            return false;
        }
    }


    public GetCaseListResponse getCaseListResponse(String ctn, String glassfishName,
                                                   String glassfishPassword, String url) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception {

        CRMOperationsSOAPService crmOperationsSOAPService = new CRMOperationsSOAPService();
        ModernCRMInterface modernCRMInterface = crmOperationsSOAPService.getModernCRMInterfaceBindingPort();

        GetCaseListRequest caseListRequest = new GetCaseListRequest();
        caseListRequest.setServiceID(ctn);
        Helper.setProperCredentialsAndUrl((BindingProvider) modernCRMInterface,
                glassfishName, glassfishPassword, url);

        return modernCRMInterface.getCaseList(caseListRequest);
    }

    public String getCaseListResponseService(String ctn, String glassfishName,
                                             String glassfishPassword, String url, Integer period, List<Reason> reasonList) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception {
        GetCaseListResponse caseListResponse = getCaseListResponse(ctn, glassfishName, glassfishPassword, url);

        if (caseListResponse != null && caseListResponse.getCaseInfo().size() != 0 &&
                reasonList != null && reasonList.size() != 0) {

            for (CaseInfo caseInfo : caseListResponse.getCaseInfo()) {

                String caseInd = compareCaseInfoWithReasons(caseInfo, reasonList, period);
                if(!caseInd.equals(NONE)){
                    return caseInd;
                }
            }
        }
        return NONE;
    }

    private String compareCaseInfoWithReasons(CaseInfo caseInfo, List<Reason> reasonList, Integer period) {
        for (Reason reason : reasonList) {
            if (reason.getReasonFirst().equals(caseInfo.getCaseType1().getTitle()) &&
                    reason.getReasonSecond().equals(caseInfo.getCaseType2().getTitle()) &&
                    reason.getReasonThird().equals(caseInfo.getCaseType3().getTitle())) {

                if(!caseInfo.getCondition().equals(CLOSED)){
                    return OPEN;
                }else if(caseInfo.getCondition().equals(CLOSED)){

                    period = period == null ? 14 : period;

                    long milliSeconds = System.currentTimeMillis();
                    DateTime currentTime = new DateTime(milliSeconds);
                    DateTime closeTime = new DateTime(caseInfo.getCreationTime().toGregorianCalendar().getTime());
                    int daysBetween = Days.daysBetween(closeTime.toLocalDate(), currentTime.toLocalDate()).getDays();
                    if(currentTime.isAfter(closeTime) && daysBetween > period){
                        return CLOSED;
                    }else if(currentTime.isAfter(closeTime) && daysBetween <= period){
                        return CLOSED_IN_PERIOD;
                    }
                }
            }
        }
        return NONE;
    }


}
