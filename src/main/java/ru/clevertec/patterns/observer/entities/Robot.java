package ru.clevertec.patterns.observer.entities;

import ru.clevertec.patterns.observer.publisher.Hub;

public class Robot {
    private Hub hub;

    public Robot(Hub hub) {
        this.hub = hub;
    }

    public Hub getHub() {
        return hub;
    }

    public void charge(){
        System.out.println("charge...");
        hub.notify(State.ROBOT_DISCHARGED, "The robot is charged");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "hub=" + hub +
                '}';
    }
}
