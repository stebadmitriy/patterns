package ru.clevertec.patterns.adapter;

import ru.clevertec.patterns.adapter.adapter.DeviceAdapter;
import ru.clevertec.patterns.adapter.entities.devices.Device;
import ru.clevertec.patterns.adapter.entities.devices.wifi.Hub;
import ru.clevertec.patterns.adapter.entities.devices.wifi.LEDLight;
import ru.clevertec.patterns.adapter.entities.devices.zigbee.SmartCamera;
import ru.clevertec.patterns.adapter.entities.protocols.Protocol;
import ru.clevertec.patterns.adapter.entities.protocols.WifiProtocol;
import ru.clevertec.patterns.adapter.entities.protocols.ZegbeeProtocol;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {
    private final static String WIFI_RANGE_PROPERTY = "range.wifi";
    private final static String ZIGBEE_RANGE_PROPERTY = "range.zigbee";

    public static void main(String[] args) {
        double wifiRange = getRange(WIFI_RANGE_PROPERTY);
        Protocol wifi = new WifiProtocol(wifiRange);
        Device ledLight = new LEDLight(wifi);

        Hub hub = new Hub(wifi);
        boolean connectByWifi = hub.connect(ledLight);
        System.out.println("connect ledLight to hub is " + connectByWifi);

        double zigbeeRange = getRange(ZIGBEE_RANGE_PROPERTY);
        Protocol zegbee = new ZegbeeProtocol(zigbeeRange);
        Device smartCamera = new SmartCamera(zegbee);
        boolean connectByZigbee = hub.connect(smartCamera);
        System.out.println("connect smartCamera to hub is " + connectByZigbee);

        Device adapter = new DeviceAdapter(hub);
        boolean connectByAdapter = hub.connect(adapter);
        System.out.println("connect smartCamera to hub is by adapter is " + connectByAdapter);
    }

    private static double getRange(String propertyName) {
        Properties properties = new Properties();
        try (InputStream inputStream = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(properties.getProperty(propertyName));
    }
}
