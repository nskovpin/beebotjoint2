package ru.beeline.bigdata.bot.test;

import org.telegram.telegrambots.TelegramBotsApi;

public class Main {

    public static void main(String[] args) {

        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot("229664190:AAFLQnf2yuMv8KIT0s81SDGPnD_-3MA1pw4"));
            System.out.println("Listening:)");
        } catch (Exception e) {
            System.out.println("Exception in bot");
            System.out.println(e);
        }
    }
}
