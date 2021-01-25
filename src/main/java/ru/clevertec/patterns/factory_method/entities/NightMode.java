package ru.clevertec.patterns.factory_method.entities;


public class NightMode implements ViewMode {

    public void increaseBrightness() {
        System.out.println("NightMode: Brightness increased");
    }

    public void decreaseBrightness() {
        System.out.println("NightMode: Brightness decreased");
    }
}
