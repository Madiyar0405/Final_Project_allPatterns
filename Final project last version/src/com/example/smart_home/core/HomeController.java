package com.example.smart_home.core;

public class HomeController {
    private static HomeController instance;



    private HomeController() {
    }

    public static HomeController getInstance() {
        if (instance == null) {
            instance = new HomeController();
        }
        return instance;
    }

    public void startSystem() {
        System.out.println("The home control system is running.");
    }

    public void stopSystem() {
        System.out.println("The house control system is stopped.");
    }

    public void controlSystem(SmartDevice smartDevice) {

    }
}
