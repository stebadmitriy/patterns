package ru.clevertec.patterns.mediator.mediators;

import ru.clevertec.patterns.mediator.components.Communicable;

public interface Mediator {
    void registerComponent(Communicable device);
    void applyNextStep(Communicable communicable);
    void sendNotification();
}
