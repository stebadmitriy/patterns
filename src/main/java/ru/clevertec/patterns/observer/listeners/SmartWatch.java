package ru.clevertec.patterns.observer.listeners;

import ru.clevertec.patterns.observer.entities.State;

/** Умные часы младшего сына*/
public class SmartWatch implements EventListener {
    @Override
    public void update(State eventType, String message) {
        System.out.println(eventType.name() + ": " + message);
    }
}
