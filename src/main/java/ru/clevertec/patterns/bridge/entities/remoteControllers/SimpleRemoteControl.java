package ru.clevertec.patterns.bridge.entities.remoteControllers;

import ru.clevertec.patterns.bridge.entities.devices.Device;

public class SimpleRemoteControl implements RemoteControl {
    private Device device;

    public SimpleRemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("SimpleRemoteControl: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("SimpleRemoteControl: volume down");
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("SimpleRemoteControl: volume up");
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void showInfo() {
        device.showStatus();
    }
}
