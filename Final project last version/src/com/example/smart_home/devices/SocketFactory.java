package com.example.smart_home.devices;

import com.example.smart_home.core.DeviceFactory;
import com.example.smart_home.core.SmartDevice;

public class SocketFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice() {
        return new SmartSocket();
    }
}
