package ru.beeline.bigdata.flowmanager.workflow.actions;

import org.joda.time.DateTime;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import ru.atconsulting.bigdata.database.dao.LogsDao;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.beeline.bigdata.flowmanager.Button;
import ru.beeline.bigdata.flowmanager.Choices;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Decision;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;
import ru.beeline.bigdata.flowmanager.workflow.utils.DataBaseUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by NSkovpin on 08.08.2016.
 */
public abstract class MessageGenerator extends DataBaseUtils{

    public SendMessage prepareMessageForUser(Message message, Step step, Flow flow, String textToSend) {
        SendMessage msgToSend = new SendMessage();
        msgToSend.setChatId(message.getChatId().toString());

        // Set question or just text
        if(textToSend != null){
            msgToSend.setText(textToSend);
        }else{
            msgToSend.setText(step.getInstruction().getParams().getQuestion().getText());
        }


        // Set answer
        Step stepWithAnswers = flow.findStepByName(step.getRef());
        if(stepWithAnswers.getDecisions() != null){
            msgToSend.setReplayMarkup(prepareKeyboard(getAnswerChoices(stepWithAnswers)));
        }

        return msgToSend;
    }

    protected KeyboardButton createButton(Button button) {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText(button.getName());

        if (button.isLocation()) {
            keyboardButton.setRequestLocation(true);
        }

        return keyboardButton;
    }

    protected ReplyKeyboardMarkup prepareKeyboard(Choices choices) {

        if (choices.isOneRow()) {
            ArrayList<KeyboardRow> oneRow = new ArrayList<KeyboardRow>();
            KeyboardRow row = new KeyboardRow();

            for (Button button : choices.getButtons()) {
                KeyboardButton keyboardButton = createButton(button);
                row.add(keyboardButton);
            }

            oneRow.add(row);
            return new ReplyKeyboardMarkup()
                    .setOneTimeKeyboad(true)
                    .setKeyboard(oneRow);
        } else {
            ArrayList<KeyboardRow> rows = new ArrayList<KeyboardRow>();
            for (Button button : choices.getButtons()) {
                KeyboardButton keyboardButton = createButton(button);
                KeyboardRow row = new KeyboardRow();
                row.add(keyboardButton);
                rows.add(row);
            }

            return new ReplyKeyboardMarkup()
                    .setResizeKeyboard(true)
                    .setOneTimeKeyboad(true)
                    .setKeyboard(rows);
        }
    }

    protected Choices getAnswerChoices(Step stepDecision) {
        List<Button> buttons = new ArrayList<Button>();
        List<Decision> decisions = stepDecision.getDecisions();

        if (decisions != null) {
            for (Decision decision : decisions) {
                String text = decision.getValue();
                boolean location = false;
                if (stepDecision.getInstruction().getParams()!= null &&
                        stepDecision.getInstruction().getParams().getArgs() != null &&
                        stepDecision.getInstruction().getParams().getArgs().contains("location")) {
                    location = true;
                }

                Button button = new Button(text, location);
                buttons.add(button);
            }
        } else {
            return null;
        }

        Choices choices = new Choices(buttons);
        return choices;
    }

}
