package ru.beeline.bigdata.flowmanager.workflow.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class JacksonUtils {

    public static ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    public static <T> T loadObject(String filePath, Class<T> clazz){
        T result = null;
        try {
            String jsonStr = new String(Files.readAllBytes(Paths.get(filePath)));
            result = loadObjectFromJson(jsonStr, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static <T> T loadObjectFromJson(String jsonData, Class<T> clazz) {
        T result = null;
        if (jsonData != null) {
            ObjectMapper mapper = getObjectMapper();

            try {
                result = mapper.readValue(jsonData, clazz);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public static <T> List<T> loadList(String jsonData, Class<T> clazz) {
        List<T> result = null;
        if (jsonData != null) {
            ObjectMapper mapper = getObjectMapper();

            try {
                result = mapper.readValue(jsonData, mapper.getTypeFactory().constructParametricType(List.class, clazz));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public static <T> List<T> loadAsList(String jsonData, Class<T> clazz) {
        List<T> result = null;

        if (jsonData != null) {
            String trimmedData = jsonData.trim();
            if (trimmedData.startsWith("{")) {
                result = new ArrayList<T>();
                result.add(loadObject(trimmedData, clazz));
            } else if (trimmedData.startsWith("[")) {
                result = loadList(trimmedData, clazz);
            }
        }

        return result;
    }


}
