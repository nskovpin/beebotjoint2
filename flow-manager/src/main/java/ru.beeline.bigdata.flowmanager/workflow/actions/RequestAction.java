package ru.beeline.bigdata.flowmanager.workflow.actions;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import ru.atconsulting.bigdata.database.dao.LogsDao;
import ru.atconsulting.bigdata.database.dao.impl.LogsDaoImpl;
import ru.beeline.bigdata.flowmanager.Button;
import ru.beeline.bigdata.flowmanager.Choices;
import ru.beeline.bigdata.flowmanager.workflow.ClientTelegramCtnFlow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Decision;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NSkovpin on 04.08.2016.
 */
public class RequestAction extends MessageGenerator implements Action{

    private LogsDao logsDao;

    private Step step;

    private Flow flow;

    private TelegramLongPollingBot telegramLongPollingBot;

    private Message message;

    private ClientTelegramCtnFlow clientTelegramCtnFlow;

    public RequestAction(Step step, Flow flow, ClientTelegramCtnFlow clientTelegramCtnFlow, TelegramLongPollingBot telegramLongPollingBot, Message message){
        this.step = step;
        this.flow = flow;
        this.telegramLongPollingBot = telegramLongPollingBot;
        this.message = message;
        this.logsDao = new LogsDaoImpl();
        this.clientTelegramCtnFlow = clientTelegramCtnFlow;
    }

    @Override
    public Object run() throws Exception {
        Object send = null;
        SendMessage msgToSend = prepareMessageForUser(message, step, flow, null);
        try {
            send = telegramLongPollingBot.sendMessage(msgToSend);

            saveLog(clientTelegramCtnFlow.getClient(), ((Message)send).getText(), "BOT MESSAGE", logsDao);
        } catch (TelegramApiException e) {
            e.printStackTrace();
            SendMessage errorMsg = new SendMessage();
            errorMsg.setText("Sorry, try another one");
            errorMsg.setChatId(message.getChatId().toString());
            try {
                send = telegramLongPollingBot.sendMessage(errorMsg);
            } catch (TelegramApiException e1) {
                e1.printStackTrace();
            }
        }
        return send;
    }

    @Override
    public Step getStep() {
        return step;
    }


}
