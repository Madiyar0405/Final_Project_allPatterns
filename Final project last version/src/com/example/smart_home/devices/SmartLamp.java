package com.example.smart_home.devices;

import com.example.smart_home.core.SmartDevice;

public class SmartLamp implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart lamp is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart lamp is off");
    }
}
