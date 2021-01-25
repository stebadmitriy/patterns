package ru.clevertec.patterns.mediator.components;

import ru.clevertec.patterns.mediator.mediators.Mediator;

public interface Communicable {
    default String getName() {
        return this.getClass().getSimpleName();
    }

    void setMediator(Mediator mediator);
}
