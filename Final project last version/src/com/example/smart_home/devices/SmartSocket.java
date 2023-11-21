package com.example.smart_home.devices;

import com.example.smart_home.core.SmartDevice;

public class SmartSocket implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart outlet is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart outlet is off");
    }
}
