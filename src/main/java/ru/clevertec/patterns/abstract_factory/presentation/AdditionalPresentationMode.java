package ru.clevertec.patterns.abstract_factory.presentation;

public class AdditionalPresentationMode implements PresentationMode {
    @Override
    public void showInfo() {
        System.out.println("Show additional info");
    }
}
