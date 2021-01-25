package ru.clevertec.patterns.observer.listeners;

import ru.clevertec.patterns.observer.entities.State;

/**
 * Телефон отца
 */
public class Phone implements EventListener {
    @Override
    public void update(State eventType, String message) {
        System.out.println(eventType.name() + ": " + message);
        //дополнительная логика
    }
}
