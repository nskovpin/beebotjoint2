package ru.atconsulting.bigdata.services;

/**
 * Created by NSkovpin on 14.07.2016.
 */
public enum ServicesNamesImpl implements ServicesNames {

    SubscribeInfoBindingPort {
        public String getServiceName() {
            return SubscribeInfoBindingPort.name();
        }
    },

    SubscriberCoreBalance {
        public String getServiceName() {
            return SubscriberCoreBalance.name();
        }
    },

    SubscriberType {
        public String getServiceName() {
            return SubscriberType.name();
        }
    },

    CreateInteraction {
        public String getServiceName() {
            return CreateInteraction.name();
        }
    },

    SubscriberTypeStateSOCs{
        public String getServiceName() {
            return SubscriberTypeStateSOCs.name();
        }
    },

    TroubleTicket {
        public String getServiceName() {
            return TroubleTicket.name();
        }
    },

    TokenService {
        public String getServiceName() {
            return TokenService.name();
        }
    },

    LocationService {
        public String getServiceName() {
            return LocationService.name();
        }
    },

    LastInteractions{
        public String getServiceName() {
            return LastInteractions.name();
        }
    },

    CaseList{
        public String getServiceName() {
            return CaseList.name();
        }
    }

}
