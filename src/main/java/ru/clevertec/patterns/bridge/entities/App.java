package ru.clevertec.patterns.bridge.entities;

import ru.clevertec.patterns.bridge.entities.devices.Humidifier;
import ru.clevertec.patterns.bridge.entities.devices.Vacuum;
import ru.clevertec.patterns.bridge.entities.remoteControllers.RemoteControl;
import ru.clevertec.patterns.bridge.entities.remoteControllers.SimpleRemoteControl;
import ru.clevertec.patterns.bridge.entities.remoteControllers.VoiceRemoteControl;

public class App {
    public static void main(String[] args) {
        testDevice(new SimpleRemoteControl(new Humidifier()));
        testDevice(new VoiceRemoteControl(new Vacuum()));
    }

    public static void testDevice(RemoteControl remoteControl) {
        System.out.println("Tests with simple remote control.");
        remoteControl.power();
        remoteControl.volumeUp();
        remoteControl.showInfo();
    }
}
