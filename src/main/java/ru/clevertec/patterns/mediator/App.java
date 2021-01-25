package ru.clevertec.patterns.mediator;

import ru.clevertec.patterns.mediator.components.*;
import ru.clevertec.patterns.mediator.mediators.EmptyHouseMediator;
import ru.clevertec.patterns.mediator.mediators.Mediator;

public class App {
    public static void main(String[] args) {
        Mediator mediator = new EmptyHouseMediator();
        mediator.registerComponent(new Humidifier());
        mediator.registerComponent(new LEDLight());
        mediator.registerComponent(new Vacuum());
        mediator.registerComponent(new Conditioner());
        mediator.registerComponent(new TemperatureSensor());

        mediator.sendNotification();

    }
}
