package com.example.smart_home.core;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeProvider implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Метод для симуляции изменения состояния (например, новая версия ПО)
    public void updateSoftware(String newVersion) {
        notifyObservers("New software version available: " + newVersion);
    }
}