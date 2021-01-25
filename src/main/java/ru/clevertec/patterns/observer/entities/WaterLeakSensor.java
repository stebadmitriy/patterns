package ru.clevertec.patterns.observer.entities;

import ru.clevertec.patterns.observer.publisher.Hub;

public class WaterLeakSensor {
    private Hub hub;

    public WaterLeakSensor(Hub hub) {
        this.hub = hub;
    }

    public Hub getHub() {
        return hub;
    }

    public void wetSensor() {
        System.out.println("The sensor is wet");
        hub.notify(State.WATER_LEAK, "Water leak");
    }

    @Override
    public String toString() {
        return "WaterLeakSensor{" +
                "hub=" + hub +
                '}';
    }
}
