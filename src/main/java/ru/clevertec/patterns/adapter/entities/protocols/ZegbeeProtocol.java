package ru.clevertec.patterns.adapter.entities.protocols;

public class ZegbeeProtocol implements Protocol {
    private double range;

    public ZegbeeProtocol(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }
}
