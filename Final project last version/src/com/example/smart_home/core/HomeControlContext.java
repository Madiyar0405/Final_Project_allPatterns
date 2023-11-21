package com.example.smart_home.core;

import com.example.smart_home.strategies.HomeControlStrategy;

public class HomeControlContext {
    private HomeControlStrategy strategy;


    public void setStrategy(HomeControlStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(SmartDevice smartDevice) {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Error: Strategy not installed.");
        }
    }
}
