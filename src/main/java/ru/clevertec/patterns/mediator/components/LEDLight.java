package ru.clevertec.patterns.mediator.components;

import ru.clevertec.patterns.mediator.mediators.Mediator;

public class LEDLight implements Communicable {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void switchOff() {
        System.out.println("All lamps have been switch off");
        mediator.applyNextStep(this);
    }
}
