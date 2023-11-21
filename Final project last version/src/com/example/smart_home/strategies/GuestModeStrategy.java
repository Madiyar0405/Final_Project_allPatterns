package com.example.smart_home.strategies;

public class GuestModeStrategy implements HomeControlStrategy{
    @Override
    public void execute() {
        System.out.println("Guest mode: Restricted access to devices.");
    }
}
