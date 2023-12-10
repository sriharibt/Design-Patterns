package com.company.observer;

public class EmailSubscriber implements Subscriber {

    private String message;

    @Override
    public void update(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
