
Smart Home Device Management System
Overview
This repository contains a comprehensive Smart Home Device Management System, featuring two new classes of smart devices - SmartSocket and Smart Thermostat. The system includes factories for creating these devices, management strategies for controlling them, and adapters for Zigbee and Z-Wave protocols.

Smart Devices
SmartSocket
The SmartSocket class implements the Smart Device interface and includes methods such as turnOn and turnOff to control the power state of the socket.

Smart Thermostat
The Smart Thermostat class also implements the Smart Device interface, providing methods for managing temperature and settings within a home.

Factories
SocketFactory
The SocketFactory implements the Device Factory interface and is responsible for creating instances of the SmartSocket class.

ThermostatFactory
The ThermostatFactory, on the other hand, implements the Device Factory interface for creating Smart Thermostat instances.

Management Strategies
EnergySavingModeStrategy
The EnergySavingModeStrategy implements the Home Control Strategy interface, offering various methods to control smart devices in an energy-efficient manner.

GuestModeStrategy
The GuestModeStrategy is another Home Control Strategy that provides different ways to control devices when the home is in guest mode.

Device Adapters
ZigbeeAdapter
The ZigbeeAdapter implements the DeviceAdapter interface, enabling communication with devices operating under the Zigbee protocol. It includes methods for connecting, disconnecting, and exchanging data.

ZWaveAdapter
Similarly, the ZWaveAdapter implements the DeviceAdapter interface for devices using the Z-Wave protocol, facilitating connection, disconnection, and data transmission.
