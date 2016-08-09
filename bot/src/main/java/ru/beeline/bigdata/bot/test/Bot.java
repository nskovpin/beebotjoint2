package ru.beeline.bigdata.bot.test;

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
import ru.beeline.bigdata.flowmanager.workflow.ConfigurationHolder;
import ru.beeline.bigdata.flowmanager.workflow.Workflow;
import ru.beeline.bigdata.flowmanager.workflow.actions.RequestAction;

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

    public Bot (String str) {
        super();
        this.ACCESS_TOKEN = str;
    }


    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {


            Message message = update.getMessage();
            System.out.println("New message:" + message.getText());
            if (message.hasText() | message.hasLocation()) {
                if (message.getText().equals("Bye")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    System.out.println(message.getContact());
                    sendMessage.setText("LOL");
                    try {
                        sendMessage(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
            if(message.hasText()){
                if (!message.getText().equals("Bye")) {
                    ConfigurationHolder configurationHolder = ConfigurationHolder.getInstance();
                    Workflow workflow = Workflow.getWorkflowInstance(configurationHolder);
                    workflow.processAction(this, message, "123", "123", null);
                }
            }

        }
    }

    public String getBotUsername() {
        return "SKOVPIN_bot";
    }

    @Override
    public String getBotToken() {
        return ACCESS_TOKEN;
    }

}
