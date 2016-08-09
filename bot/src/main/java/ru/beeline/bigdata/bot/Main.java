package ru.beeline.bigdata.bot;

import org.telegram.telegrambots.TelegramBotsApi;

public class Main {

    public static void main(String[] args) {

        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot(args[0]));
            System.out.println("Listening:)");
        } catch (Exception e) {
            System.out.println("Exception in bot");
            System.out.println(e);
        }
    }
}
