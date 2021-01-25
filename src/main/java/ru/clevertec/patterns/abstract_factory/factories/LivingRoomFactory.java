package ru.clevertec.patterns.abstract_factory.factories;


import ru.clevertec.patterns.abstract_factory.presentation.AdditionalPresentationMode;
import ru.clevertec.patterns.abstract_factory.presentation.PresentationMode;
import ru.clevertec.patterns.abstract_factory.view.DayViewMode;
import ru.clevertec.patterns.abstract_factory.view.ViewMode;

/**
 * Для гостиной мы желаем иметь девайсы с дневным режимом и дополнительной информацией
 */
public class LivingRoomFactory implements ModeFactory {
    @Override
    public PresentationMode getPresentationMode() {
        return new AdditionalPresentationMode();
    }

    @Override
    public ViewMode getViewMode() {
        return new DayViewMode();
    }
}
