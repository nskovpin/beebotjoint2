package ru.beeline.bigdata.flowmanager.workflow.files;

import ru.atconsulting.bigdata.services.glassfish.Reason;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NSkovpin on 13.07.2016.
 * Class which produces list of reasons
 */
public class ReasonsMaker {

    public static final String DELIMITER = ";";
    public static final int COLUMN_NUMBER = 3;
    public static final int FIRST_REASON_INDEX = 0;
    public static final int SECOND_REASON_INDEX = 1;
    public static final int THIRD_REASON_INDEX = 2;

    /**
     * Parse file, read lines, split lites to words then generate list of Reasons
     * @param pathToFile - path to reasons.csv
     * @return - list of Reasons
     * @throws IOException - if file doesnt exist
     */
    public static List<Reason> loadReasonsToList(String pathToFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String line;
        List<Reason> reasonsList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                String[] splitLine = line.split(DELIMITER);
                if (splitLine.length == COLUMN_NUMBER) {
                    String first = splitLine[FIRST_REASON_INDEX];
                    String second = splitLine[SECOND_REASON_INDEX];
                    String third = splitLine[THIRD_REASON_INDEX];

                    Reason reason = new Reason();
                    reason.setReasonFirst(first);
                    reason.setReasonSecond(second);
                    reason.setReasonThird(third);

                    reasonsList.add(reason);
                }
            }
        }
        return reasonsList;
    }

}
