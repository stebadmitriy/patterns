package ru.clevertec.patterns.adapter.entities.devices.wifi;

import ru.clevertec.patterns.adapter.entities.devices.Device;
import ru.clevertec.patterns.adapter.entities.protocols.Protocol;

import java.util.Objects;

public class Hub {
    Protocol wifiProtocol;

    public Hub(Protocol protocol) {
        this.wifiProtocol = protocol;
    }

    public Protocol getWifiProtocol() {
        return wifiProtocol;
    }

    public boolean connect(Device device) {
        Protocol deviceProtocol = device.getProtocol();
        return Objects.nonNull(deviceProtocol) && deviceProtocol.getRange() == wifiProtocol.getRange();
    }
}
