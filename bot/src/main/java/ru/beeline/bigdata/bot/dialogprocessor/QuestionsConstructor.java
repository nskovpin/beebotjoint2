package ru.beeline.bigdata.bot.dialogprocessor;

import com.sun.tools.javac.util.Pair;
import ru.beeline.bigdata.bot.utils.Geocoder;
import ru.beeline.bigdata.bot.utils.PyConnector;

import java.io.IOException;

/**
 * Created by valeriastrizkova on 27/07/16.
 */
public class QuestionsConstructor {
    public static String makeQuestion(String type, String userAnswer) {
        String question = null;

        switch (type) {
            case "solveProblem":
                question = solveProblem(userAnswer);
                break;
            case "checkLocation":
                question = checkLocation(userAnswer);
                break;
            case "autoAuth":
                question = autoAuth(userAnswer);
                break;
            default:
                question = "Сорян";
                break;
        }

        return question;
    }

    private static String solveProblem(String userAnswer) {
        String replyText = null;

        try {
            replyText = "Вот что я понял про тебя: \n";
            replyText += PyConnector.getInstance().getWorkflow(userAnswer);
        } catch (IOException ex) {
            replyText = "А, ниче я не понял. К классификатору не могу подключиться...";
        }

        return replyText;
    }

    private static String checkLocation(String userAnswer) {
        String replyText;
        String address;

        Pair<String, Pair<Double, Double>> pairAddress = null;
        try {
            pairAddress = Geocoder.getInstance().findAddress(userAnswer);

            if (pairAddress != null) {
                address = pairAddress.fst;
                address += "\n Ваши координаты: " + pairAddress.snd.fst + ", " + pairAddress.snd.snd;
                replyText = "Ты находишься: " + address;
            } else {
                replyText = "Такой адрес я не нашел...";
            }
        } catch (Exception e) {
            replyText = "У нас случилась проблема, сорри!";
            e.printStackTrace();
        }

        return replyText;
    }

    private static String autoAuth(String userAnswer) {
        return null;
    }
}
