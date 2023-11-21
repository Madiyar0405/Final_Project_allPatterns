package com.example.smart_home.core;

import com.example.smart_home.devices.DeviceAdapter;

public class BluetoothAdapter implements DeviceAdapter {
    private BluetoothDevice device;

    public BluetoothAdapter(BluetoothDevice device) {
        this.device = device;
    }

    @Override
    public void connect() {
        device.initializeBluetoothConnection();
        System.out.println("Connected to Bluetooth device.");
    }

    @Override
    public void disconnect() {
        device.closeBluetoothConnection();
        System.out.println("Disconnected from Bluetooth device.");
    }

    @Override
    public void sendData(String data) {
        device.sendBluetoothData(data);
        System.out.println("Data sent via Bluetooth: " + data);
    }

    @Override
    public String receiveData() {
        String receivedData = device.receiveBluetoothData();
        System.out.println("Data received via Bluetooth: " + receivedData);
        return receivedData;
    }
}
