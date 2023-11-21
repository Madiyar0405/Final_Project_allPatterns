package com.example.smart_home.strategies;

public class EnergySavingModeStrategy implements HomeControlStrategy{
    public void execute() {
        System.out.println("Power saving mode: Switch off non-critical devices.");
    }
}
