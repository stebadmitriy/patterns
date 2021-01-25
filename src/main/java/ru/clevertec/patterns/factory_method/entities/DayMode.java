package ru.clevertec.patterns.factory_method.entities;

public class DayMode implements ViewMode {

    public void increaseBrightness() {
        System.out.println("DayMode: Brightness increased");

    }

    public void decreaseBrightness() {
        System.out.println("DayMode: Brightness decreased");
    }
}
