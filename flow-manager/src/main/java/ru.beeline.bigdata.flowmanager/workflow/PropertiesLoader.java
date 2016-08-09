package ru.beeline.bigdata.flowmanager.workflow;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by NSkovpin on 10.10.2015.
 */
public class PropertiesLoader {

    public enum Params {
        FLOW_DIRECTORY_PATH("flow.directory.path"),
        REASON_FILE_PATH("reasons.file.path"),
        FLOW_DIRECTORY_BEGINNING_PATH("flow.directory.beginning.path"),

        WORKFLOW_SEARCH_FLAG("workflow.search.flag");

        private String value;

        public String getValue() {
            return value;
        }

        Params(String value) {
            this.value = value;
        }

    }

    public static Properties loadAllProperties(String pathToPropertyFile) {
        Properties props = new Properties();
        try (FileInputStream inputStream = new FileInputStream(pathToPropertyFile)) {
            props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Property file load exception");
        }
        return props;
    }

}
