package com.example.smart_home.decorators;

import com.example.smart_home.core.SmartDevice;

public class ColorChangingDecorator implements SmartDeviceDecorator {
    private SmartDevice device;

    public ColorChangingDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
        System.out.println("The colour of the smart lamp has been changed");
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void additionalFunctionality() {
        System.out.println("Additional functionality: colour change");
    }
}
