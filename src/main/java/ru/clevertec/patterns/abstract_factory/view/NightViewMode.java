package ru.clevertec.patterns.abstract_factory.view;


public class NightViewMode implements ViewMode {

    public void increaseBrightness() {
        System.out.println("NightMode: Brightness increased");
    }

    public void decreaseBrightness() {
        System.out.println("NightMode: Brightness decreased");
    }
}
