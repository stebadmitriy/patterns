package ru.clevertec.patterns.mediator.components;

import ru.clevertec.patterns.mediator.mediators.Mediator;

public class Vacuum implements Communicable {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void vacuumApartment(){
        System.out.println("The vacuum cleaner has started dry cleaning");
        mediator.applyNextStep(this);
    }
}
