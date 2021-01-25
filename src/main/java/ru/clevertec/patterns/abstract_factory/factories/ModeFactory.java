package ru.clevertec.patterns.abstract_factory.factories;


import ru.clevertec.patterns.abstract_factory.presentation.PresentationMode;
import ru.clevertec.patterns.abstract_factory.view.ViewMode;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface ModeFactory {
    PresentationMode getPresentationMode();

    ViewMode getViewMode();
}
