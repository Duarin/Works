package com.gmail.bilvania2906.homeworks2.work22;

public class Logger {
    private static Logger instance;
    private StringBuilder logMessages;

    private Logger() {
        logMessages = new StringBuilder();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    public void showLogs() {
        System.out.println(logMessages.toString());
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Перше повідомлення");
        logger2.log("Друге повідомлення");

        System.out.println("logger1 == logger2 : " + (logger1 == logger2));

        logger1.showLogs();
    }
}
