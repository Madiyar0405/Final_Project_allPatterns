package com.example.smart_home;

import com.example.smart_home.core.*;
import com.example.smart_home.decorators.ColorChangingDecorator;
import com.example.smart_home.decorators.SmartDeviceDecorator;
import com.example.smart_home.decorators.SpeedControlDecorator;
import com.example.smart_home.decorators.TemperatureControlDecorator;
import com.example.smart_home.devices.DeviceAdapter;
import com.example.smart_home.devices.SmartFan;
import com.example.smart_home.devices.SmartLamp;
import com.example.smart_home.devices.SmartThermostat;
import com.example.smart_home.strategies.EnergySavingModeStrategy;
import com.example.smart_home.strategies.GuestModeStrategy;
import com.example.smart_home.zwave.ZWaveAdapter;
import com.example.smart_home.zwave.ZWaveDevice;
import com.example.smart_home.zigbee.ZigbeeAdapter;
import com.example.smart_home.zigbee.ZigbeeDevice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Smart Home System!");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("To fully utilize the Smart Home System, subscription to the System's Software is required. Would you like to subscribe now? (y/n): ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals("y")) {
            SmartHomeProvider softwareProvider = new SmartHomeProvider();

            SmartHomeUser user = new SmartHomeUser(userName);
            user.subscribe();

            softwareProvider.addObserver(user);
            softwareProvider.updateSoftware("v2.0");

            DeviceAdapter deviceAdapter = null;
            HomeControlContext context = new HomeControlContext();
            HomeController homeController = HomeController.getInstance();
            homeController.startSystem();


            while (true) {
                System.out.println(
                        "╔═══════════════════════════════════╗\n" +
                        "║        Smart Home System          ║\n" +
                        "║      ----------------------       ║\n" +
                        "║        System is running...       ║\n" +
                        "╚═══════════════════════════════════╝");
                System.out.println(
                        "╔══════════════════════════════════════╗\n" +
                        "║          Select a smart device       ║\n" +
                        "║ ------------------------------------ ║\n" +
                        "║    1. Smart lamp                     ║\n" +
                        "║    2. Smart thermostat               ║\n" +
                        "║    3. Smart fan                      ║\n" +
                        "║    0. Exit                           ║\n" +
                        "╚══════════════════════════════════════╝");


                int deviceChoice = scanner.nextInt();
                SmartDevice smartDevice = null;

                switch (deviceChoice) {
                    case 1:
                        smartDevice = new SmartLamp();
                        break;
                    case 2:
                        smartDevice = new SmartThermostat();
                        break;
                    case 3:
                        smartDevice = new SmartFan();
                        break;
                    case 0:
                        System.out.println("Exit the programme.");
                        homeController.stopSystem();
                        System.exit(0);
                    default:
                        System.out.println("Invalid selection. Please re-enter.");
                        continue;
                }
                System.out.println(
                        "╔════════════════════════════════════════════╗\n" +
                        "║     Select the device control protocol     ║\n" +
                        "║ ------------------------------------------ ║\n" +
                        "║    1. Zigbee                               ║\n" +
                        "║    2. Z-Wave                               ║\n" +
                        "║    3. Bluetooth                            ║\n" +
                        "╚════════════════════════════════════════════╝");
                int protocolChoice = scanner.nextInt();
                switch (protocolChoice) {
                    case 1:
                        deviceAdapter = new ZigbeeAdapter(new ZigbeeDevice());
                        break;
                    case 2:
                        deviceAdapter = new ZWaveAdapter(new ZWaveDevice());
                        break;
                    case 3:
                        deviceAdapter = new BluetoothAdapter(new BluetoothDevice());
                        break;
                    default:
                        System.out.println("Invalid protocol selection. Enter again.");
                        continue;
                }

                // Декораторы
                System.out.println(
                        "╔════════════════════════════════════════════════════╗\n" +
                        "║           Add additional functionality?            ║\n" +
                        "║ -------------------------------------------------- ║\n" +
                        "║    1. Colour change (for smart lamp)               ║\n" +
                        "║    2. Temperature control (for smart thermostat)   ║\n" +
                        "║    3. Speed control (for smart fan)                ║\n" +
                        "║    0. Skip                                         ║\n" +
                        "╚════════════════════════════════════════════════════╝");

                int decoratorChoice = scanner.nextInt();

                switch (decoratorChoice) {
                    case 1:
                        if (smartDevice instanceof SmartLamp) {
                            smartDevice = new ColorChangingDecorator(smartDevice);
                            ((SmartDeviceDecorator) smartDevice).additionalFunctionality();
                        } else {
                            System.out.println("This functionality is only available for the smart lamp.");
                        }
                        break;
                    case 2:
                        smartDevice = new TemperatureControlDecorator(smartDevice);
                        ((SmartDeviceDecorator) smartDevice).additionalFunctionality();
                        break;
                    case 3:
                        if (smartDevice instanceof SmartFan) {
                            smartDevice = new SpeedControlDecorator(smartDevice);
                            ((SmartDeviceDecorator) smartDevice).additionalFunctionality();
                        } else {
                            System.out.println("This functionality is only available for the smart fan.");
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid selection. Additional functionality omitted.");
                }

                // Выбор стратегии
                System.out.println(
                        "╔══════════════════════════════════════╗\n" +
                        "║       Select home control mode       ║\n" +
                        "║ ------------------------------------ ║\n" +
                        "║    1. Home mode                      ║\n" +
                        "║    2. Energy saving mode             ║\n" +
                        "║    3. Guest mode                     ║\n" +
                        "║    0. Exit                           ║\n" +
                        "╚══════════════════════════════════════╝");

                int strategyChoice = scanner.nextInt();

                switch (strategyChoice) {
                    case 1:
                        context.setStrategy(new HomeModeStrategy());
                        break;
                    case 2:
                        context.setStrategy(new EnergySavingModeStrategy());
                        break;
                    case 3:
                        context.setStrategy(new GuestModeStrategy());
                        break;
                    case 0:
                        System.out.println("Exit the programme.");
                        homeController.stopSystem();
                        System.exit(0);
                    default:
                        System.out.println("Invalid selection. Please enter again.");
                        continue;
                }


                homeController.controlSystem(smartDevice);
                smartDevice.turnOn();
                deviceAdapter.connect();

            }
        } else {
            System.out.println("You chose not to subscribe. Smart Home System terminated.");
        }


    }

}
