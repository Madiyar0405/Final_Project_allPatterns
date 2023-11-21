package com.example.smart_home.zigbee;

import com.example.smart_home.devices.DeviceAdapter;

public class ZigbeeAdapter implements DeviceAdapter {
    private ZigbeeDevice device;

    public ZigbeeAdapter(ZigbeeDevice device) {
          this.device = device;
    }

    @Override
    public void connect() {
        device.initializeZigbeeConnection();
        System.out.println("Connected to Zigbee device.");
    }

    @Override
    public void disconnect() {
        device.closeZigbeeConnection();
        System.out.println("Disconnected from Zigbee device.");
    }

    @Override
    public void sendData(String data) {
        device.sendZigbeeData(data);
        System.out.println("Data sent via Zigbee: " + data);
    }

    @Override
    public String receiveData() {
        String receivedData = device.receiveZigbeeData();
        System.out.println("Data received via Zigbee: " + receivedData);
        return receivedData;
    }
}
