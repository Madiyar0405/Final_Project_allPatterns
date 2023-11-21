package com.example.smart_home.devices;

import com.example.smart_home.core.DeviceFactory;
import com.example.smart_home.core.SmartDevice;
import com.example.smart_home.devices.SmartLamp;

public class LampFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice() {
        return new SmartLamp();
    }
}
