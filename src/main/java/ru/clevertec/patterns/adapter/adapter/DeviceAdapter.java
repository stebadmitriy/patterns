package ru.clevertec.patterns.adapter.adapter;

import ru.clevertec.patterns.adapter.entities.devices.Device;
import ru.clevertec.patterns.adapter.entities.devices.wifi.Hub;
import ru.clevertec.patterns.adapter.entities.protocols.Protocol;
import ru.clevertec.patterns.adapter.entities.protocols.ZegbeeProtocol;

public class DeviceAdapter implements Device {
    private Hub hub;

    public DeviceAdapter(Hub hub) {
        this.hub = hub;
    }


    /**
     * уменьшаем диапазон на котором работают устройства по протоколду Zigbee к wifi диапазону
     * */
    @Override
    public Protocol getProtocol() {
        return new ZegbeeProtocol(hub.getWifiProtocol().getRange());
    }
}
