package com.example.smart_home.zwave;

import com.example.smart_home.devices.DeviceAdapter;

public class ZWaveAdapter implements DeviceAdapter {
    private ZWaveDevice device;

    public ZWaveAdapter(ZWaveDevice device) {
        this.device = device;
    }

    @Override
    public void connect() {
        device.initializeZWaveConnection();
        System.out.println("Connected to Z-Wave device.");
    }

    @Override
    public void disconnect() {
        device.closeZWaveConnection();
        System.out.println("Disconnected from Z-Wave device.");
    }

    @Override
    public void sendData(String data) {
        device.sendZWaveData(data);
        System.out.println("Data sent via Z-Wave: " + data);
    }

    @Override
    public String receiveData() {
        String receivedData = device.receiveZWaveData();
        System.out.println("Data received via Z-Wave: " + receivedData);
        return receivedData;
    }
}
