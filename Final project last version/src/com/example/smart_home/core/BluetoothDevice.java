package com.example.smart_home.core;

public class BluetoothDevice {
    private boolean isConnected;

    void initializeBluetoothConnection() {
        isConnected = true;
        System.out.println("Bluetooth connection initialized.");
    }

    void closeBluetoothConnection() {
        isConnected = false;
        System.out.println("Bluetooth connection closed.");
    }

    void sendBluetoothData(String data) {
        if (isConnected) {
            System.out.println("Data sent via Bluetooth: " + data);
        } else {
            System.out.println("Error: Bluetooth connection not initialized.");
        }
    }

    String receiveBluetoothData() {
        if (isConnected) {
            System.out.println("Receiving data via Bluetooth.");
            return "Data from Bluetooth";
        } else {
            System.out.println("Error: Bluetooth connection not initialized.");
            return null;
        }
    }
}
