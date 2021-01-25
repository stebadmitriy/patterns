package ru.clevertec.patterns.adapter.entities.protocols;

public class WifiProtocol implements Protocol {
    private double range;

    public WifiProtocol(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }
}
