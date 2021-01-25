package ru.clevertec.patterns.bridge.entities.devices;

public interface Device {
    void showStatus();

    void enable();

    boolean isEnabled();

    void disable();

    int getVolume();

    void setVolume(int percent);


}
