package com.company.observer;

public interface Subscriber {

    void update(String message);
    String getMessage();
}
