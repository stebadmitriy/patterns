package ru.clevertec.patterns.mediator.components;

import ru.clevertec.patterns.mediator.mediators.Mediator;

public class Conditioner implements Communicable {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void switchOn() {
        System.out.println("Conditioner has been switched on");
    }

    public void switchOff() {
        System.out.println("Conditioner has been switched off");
    }
}
