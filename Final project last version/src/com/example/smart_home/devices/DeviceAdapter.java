package com.example.smart_home.devices;

public interface DeviceAdapter {
    void connect();

    void disconnect();

    void sendData(String data);

    String receiveData();
}
