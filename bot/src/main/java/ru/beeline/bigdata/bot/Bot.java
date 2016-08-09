package ru.beeline.bigdata.bot;

import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import ru.beeline.bigdata.bot.dialogprocessor.QuestionsConstructor;
import ru.beeline.bigdata.flowmanager.Button;
import ru.beeline.bigdata.flowmanager.Choices;
import ru.beeline.bigdata.flowmanager.FlowManager;

import java.util.ArrayList;

/**
 * Callcenter bot
 * <p>
 * Created by aleksandrlazarenko on 12.07.16.
 * lazarenko.ale@gmail.com
 * Telegram: @alexlazarenko
 */
public class Bot extends TelegramLongPollingBot {


    private String ACCESS_TOKEN;
    FlowManager flowManager;

    public Bot (String str) {
        super();
        this.ACCESS_TOKEN = str;
        this.flowManager = new FlowManager();
        System.out.println(flowManager.getStep());
    }

    private SendMessage prepareMessageForUser(Message message) {
        SendMessage msgToSend = new SendMessage();
        msgToSend.setChatId(message.getChatId().toString());

        // Set question
        if (flowManager.hasStaticQeustion()) {
            msgToSend.setText(flowManager.getQuestion());
        } else if (flowManager.hasDynamicQeustion()) {
            System.out.println(flowManager.getQuestionConstructor());
            msgToSend.setText(QuestionsConstructor.makeQuestion(flowManager.getQuestionConstructor(), message.getText()));
        }

        // Set answer
        if (flowManager.hasChooseAnswer()) {
            msgToSend.setReplayMarkup(prepareKeyboard(flowManager.getAnswerChoices()));
        }

        return msgToSend;
    }

    private KeyboardButton createButton(Button button) {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText(button.getName());

        if (button.isLocation()) {
            keyboardButton.setRequestLocation(true);
        }

        return keyboardButton;
    }

    private ReplyKeyboardMarkup prepareKeyboard(Choices choices) {

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

    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {

            Message message = update.getMessage();

            if (message.hasText() | message.hasLocation()) {
                if (message.getText().equals("/start")) {
                    flowManager.startSession();
                } else {
                    flowManager.nextStep(message.getText());
                }

                SendMessage msgToSend = prepareMessageForUser(message);

                try {
                    sendMessage(msgToSend);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                    SendMessage errorMsg = new SendMessage();
                    errorMsg.setText("Сорян, проблемка, давай еще раз");
                    errorMsg.setChatId(message.getChatId().toString());
                    try {
                        sendMessage(errorMsg);
                    } catch (TelegramApiException e1) {
                        e1.printStackTrace();
                    }
                }

            }
        }
    }

    public String getBotUsername() {
        return "BeelineCallCenterBot";
    }

    @Override
    public String getBotToken() {
        return ACCESS_TOKEN;
    }

}
