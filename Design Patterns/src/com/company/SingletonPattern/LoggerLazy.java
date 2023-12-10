package com.company.SingletonPattern;

public class LoggerLazy {
    private static LoggerLazy instance = null;

    private LoggerLazy() {

    }

    public static LoggerLazy getInstance() {
        if (instance == null) {
            instance = new LoggerLazy();
        }
        return instance;
    }
}
