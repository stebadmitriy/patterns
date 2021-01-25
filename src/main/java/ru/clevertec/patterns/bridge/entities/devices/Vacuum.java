package ru.clevertec.patterns.bridge.entities.devices;

public class Vacuum implements Device {
    private boolean isDeviceOn = false;
    private int volume = 10;

    @Override
    public void showStatus() {
        System.out.println(toString());
    }

    @Override
    public void enable() {
        isDeviceOn = true;
    }

    @Override
    public boolean isEnabled() {
        return isDeviceOn;
    }

    @Override
    public void disable() {
        isDeviceOn = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }

    @Override
    public String toString() {
        return "LEDLight{" +
                "isDeviceOn=" + isDeviceOn +
                ", volume=" + volume +
                '}';
    }
}
