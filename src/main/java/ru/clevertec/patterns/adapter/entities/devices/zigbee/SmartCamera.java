package ru.clevertec.patterns.adapter.entities.devices.zigbee;

import ru.clevertec.patterns.adapter.entities.devices.Device;
import ru.clevertec.patterns.adapter.entities.protocols.Protocol;

public class SmartCamera implements Device {
    private Protocol zigbeeProtocol;

    public SmartCamera(Protocol zigbeeProtocol) {
        this.zigbeeProtocol = zigbeeProtocol;
    }

    @Override
    public Protocol getProtocol() {
        return zigbeeProtocol;
    }
}
