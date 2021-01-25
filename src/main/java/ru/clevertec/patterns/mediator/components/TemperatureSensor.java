package ru.clevertec.patterns.mediator.components;

import ru.clevertec.patterns.mediator.mediators.Mediator;

public class TemperatureSensor implements Communicable {
    private Mediator mediator;
    private double temperature = 21.0;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
