package com.example.smart_home.devices;

import com.example.smart_home.core.SmartDevice;

public class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart fan on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart fan is off");
    }
}
