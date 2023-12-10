package com.company.observer;

import java.util.HashSet;

public class Notifier {

    HashSet<Subscriber> subscribers;

    public Notifier() {
        subscribers = new HashSet<>();
    }

    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notify(String message) {
        for (Subscriber s : subscribers) {
            s.update(message);
        }
    }

}
