Final Project, Software Design Patterns SE-2210

Zhanzhigitov Madiyar, Taishanov Taiyr

Smart home control device

Bluetooth adapter and Bluetooth device:

The Bluetooth adapter is an additional adapter for working with Bluetooth
devices, optimizing the device interface.
Bluetooth device - A class that installs a Bluetooth device.
The connect(), disconnect(), sendData(string data), and receiveData() methods
use basic Bluetooth operations.

Device Factory:

The built-in DeviceFactory is a CreateDevice() method, which is intended for
use with factory classes to create devices.
HomeControlContext and HomeModeStrategy for home use:
HomeControlContext manages the smart user management strategy.
HomeModeStrategy is a specific strategy that optimizes the home
management strategy.

HomeController:

The built-in home controller controls the boot and remote system.
The method management system (SmartDevice SmartDevice) does not require
automation.

Observer and Subject:

An independent observer and a subject represent the "Observer" pattern.
The SmartHomeProvider provider analyzes information about the subject and
provides methods for adding, removing and removing browsers.
SmartHomeUser is a specific user.

Smart devices and decorators:

Smart Device is a tool for managing smart devices.
Decorators (ColorChangingDecorator, SpeedControlDecorator,
TemperatureControlDecorator) add value to universally smart devices.

DeviceAdapter and DeviceFactory:

DeviceAdapter is a tool for configuring devices.
DeviceFactory is a tool for creating devices.

LampFactory and SmartFan/Smart Lamp:

Lamp Factory is a laboratory for creating smart lamps.
SmartFan and SmartLamp are specific solutions for smart users.

Smart devices:

New classes of smart devices have been introduced - SmartSocket and Smart
Thermostat. Each of them implements the Smart Device interface with the
TurnOn and turnOff methods.

Factories for creating devices:

SocketFactory and ThermostatFactory implement the Device Factory interface
for creating smart sockets and thermostats, respectively.

Management strategies:

Added new management strategies - EnergySavingModeStrategy and
GuestModeStrategy. Each of them implements the Home Control Strategy
interface and provides various ways to control smart devices.

Zigbee and Z-Wave adapters:

Adapters have been introduced for devices operating under the Zigbee and ZWave protocols - ZigbeeAdapter and ZWaveAdapter. Each of them implements
the DeviceAdapter interface for connecting, disconnecting, sending and
receiving data via the corresponding protocol.



UML-diagram:
![photo1700588749](https://github.com/Madiyar0405/Final_Project_allPatterns/assets/123325330/a574e3e3-043a-4e9f-8c48-5bc3069a31f3)



