package ru.clevertec.patterns.abstract_factory.view;

public class DayViewMode implements ViewMode {

    public void increaseBrightness() {
        System.out.println("DayMode: Brightness increased");

    }

    public void decreaseBrightness() {
        System.out.println("DayMode: Brightness decreased");
    }
}
