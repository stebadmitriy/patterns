package ru.clevertec.patterns.adapter.entities.devices.wifi;

import ru.clevertec.patterns.adapter.entities.devices.Device;
import ru.clevertec.patterns.adapter.entities.protocols.Protocol;

public class LEDLight implements Device {
    private Protocol wifiProtocol;

    public LEDLight(Protocol wifiProtocol) {
        this.wifiProtocol = wifiProtocol;
    }

    @Override
    public Protocol getProtocol() {
        return wifiProtocol;
    }
}
