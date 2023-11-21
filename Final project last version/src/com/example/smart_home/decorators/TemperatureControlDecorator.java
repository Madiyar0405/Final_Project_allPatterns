package com.example.smart_home.decorators;

import com.example.smart_home.core.SmartDevice;

public class TemperatureControlDecorator implements SmartDeviceDecorator{
    private SmartDevice device;

    public TemperatureControlDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
        System.out.println("Smart thermostat temperature adjusted");
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void additionalFunctionality() {
        System.out.println("Additional functionality: temperature control");
    }
}
