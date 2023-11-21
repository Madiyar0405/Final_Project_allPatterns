package com.example.smart_home.zwave;

public class ZWaveDevice {
    private boolean isConnected;

    void initializeZWaveConnection() {
        isConnected = true;
        System.out.println("Z-Wave connection initialized.");
    }

    void closeZWaveConnection() {
        isConnected = false;
        System.out.println("Z-Wave connection closed.");
    }

    void sendZWaveData(String data) {
        if (isConnected) {
            System.out.println("Data sent via Z-Wave: " + data);
        } else {
            System.out.println("Error: Z-Wave connection not initialized.");
        }
    }

    String receiveZWaveData() {
        if (isConnected) {
            System.out.println("Receiving data via Z-Wave.");
            return "Data from Z-Wave";
        } else {
            System.out.println("Error: Z-Wave connection not initialized.");
            return null;
        }
    }
}
