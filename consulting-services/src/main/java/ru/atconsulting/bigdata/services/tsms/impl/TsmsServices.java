package ru.atconsulting.bigdata.services.tsms.impl;

import ru.atconsulting.bigdata.services.ServicesNames;

/**
 * Created by NSkovpin on 07.07.2016.
 */
public enum TsmsServices implements ServicesNames{

    TokenService {
        public String getServiceName() {
            return TokenService.name();
        }
    },

    LocationService {
        public String getServiceName() {
            return LocationService.name();
        }
    }


}
