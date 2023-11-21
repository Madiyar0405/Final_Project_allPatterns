package com.example.smart_home.decorators;

import com.example.smart_home.core.SmartDevice;

public class SpeedControlDecorator implements SmartDeviceDecorator{
    private SmartDevice device;

    public SpeedControlDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
        System.out.println("The speed of the smart fan is adjusted");
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void additionalFunctionality() {
        System.out.println("Additional functionality: speed control");
    }
}
