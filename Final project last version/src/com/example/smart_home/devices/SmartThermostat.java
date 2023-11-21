package com.example.smart_home.devices;

import com.example.smart_home.core.SmartDevice;

public class SmartThermostat implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart thermostat is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart thermostat is off");
    }
}
