package com.example.smart_home.core;

public class SmartHomeUser implements Observer {
    private String name;
    private boolean isSubscribed = false;

    public SmartHomeUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a notification: " + message);
    }

    public void subscribe() {
        isSubscribed = true;
    }

    public void unsubscribe() {
        isSubscribed = false;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }
}