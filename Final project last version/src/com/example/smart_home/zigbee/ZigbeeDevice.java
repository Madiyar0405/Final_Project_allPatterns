package com.example.smart_home.zigbee;

public class ZigbeeDevice {
    private boolean isConnected;

    void initializeZigbeeConnection() {
        isConnected = true;
        System.out.println("Zigbee connection initialized.");
    }

    void closeZigbeeConnection() {
        isConnected = false;
        System.out.println("Zigbee connection closed.");
    }

    void sendZigbeeData(String data) {
        if (isConnected) {
            System.out.println("Data sent via Zigbee: " + data);
        } else {
            System.out.println("Error: Zigbee connection not initialized.");
        }
    }

    String receiveZigbeeData() {
        if (isConnected) {
            System.out.println("Receiving data via Zigbee.");
            return "Data from Zigbee";
        } else {
            System.out.println("Error: Zigbee connection not initialized.");
            return null;
        }
    }
}
