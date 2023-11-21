package com.example.smart_home.core;

import com.example.smart_home.strategies.HomeControlStrategy;

public class HomeModeStrategy implements HomeControlStrategy {
    public void execute() {
        System.out.println("Home mode: Switching on the main devices.");
    }
}
