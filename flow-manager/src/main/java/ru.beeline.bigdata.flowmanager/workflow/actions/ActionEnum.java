package ru.beeline.bigdata.flowmanager.workflow.actions;


import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import ru.beeline.bigdata.flowmanager.workflow.ClientTelegramCtnFlow;
import ru.beeline.bigdata.flowmanager.workflow.ConfigurationHolder;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

/**
 * Created by NSkovpin on 20.06.2016.
 * You can create this instructions
 */
public enum ActionEnum {
    DECISION_instruction,
    REQUEST_instruction,
    CHECK_LOCATION_instruction,
    SOLVE_PROBLEM_instruction,
    GLASSFISH_instruction,
    TSMS_instruction;

    public static Action getActionByName(Step step, ClientTelegramCtnFlow clientTelegramCtnFlow,
                                         ConfigurationHolder configurationHolder, Object inputObject,
                                         TelegramLongPollingBot telegramLongPollingBot, Message message){
        ActionEnum actionEnum = ActionEnum.valueOf(step.getInstruction().getName());
        switch (actionEnum){
            case REQUEST_instruction:
                return new RequestAction(step, clientTelegramCtnFlow.getFlow(), clientTelegramCtnFlow, telegramLongPollingBot, message);
            case DECISION_instruction:
                return new DecisionAction(step, clientTelegramCtnFlow.getFlow(), inputObject);
            case GLASSFISH_instruction:
                return new GlassfishAction(step, clientTelegramCtnFlow.getCtn(), configurationHolder.getReasonsHolder(), inputObject);
            case TSMS_instruction:
                return new TsmsAction(step, clientTelegramCtnFlow.getCtn());
            case SOLVE_PROBLEM_instruction:
                return new SolveProblemAction(step, clientTelegramCtnFlow.getFlow(), clientTelegramCtnFlow, telegramLongPollingBot, message);
        }
        throw new RuntimeException("Application doesn't know this action:"
                + step.getInstruction().getName()
        );
    }

}
