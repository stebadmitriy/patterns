package ru.clevertec.patterns.mediator.components;

import ru.clevertec.patterns.mediator.mediators.Mediator;

public class Humidifier implements Communicable {
    private Mediator mediator;
    private double percent;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void switchOn() {
        System.out.println("Humidifier has been switched on");
    }

    public void switchOff() {
        System.out.println("Humidifier has been switched off");
    }

    public void setHumidity(double percent)  {
        this.percent = percent;
        System.out.println("Humidity has been set to " + percent);
        mediator.applyNextStep(this);
    }

    public double getHumidity() {
        return percent;
    }

}
