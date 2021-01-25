package ru.clevertec.patterns.abstract_factory.presentation;

public class TechnicalPresentationMode implements PresentationMode {
    @Override
    public void showInfo() {
        System.out.println("Show technical info");
    }
}
