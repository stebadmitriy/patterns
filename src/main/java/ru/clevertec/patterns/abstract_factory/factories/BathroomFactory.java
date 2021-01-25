package ru.clevertec.patterns.abstract_factory.factories;


import ru.clevertec.patterns.abstract_factory.presentation.PresentationMode;
import ru.clevertec.patterns.abstract_factory.presentation.TechnicalPresentationMode;
import ru.clevertec.patterns.abstract_factory.view.NightViewMode;
import ru.clevertec.patterns.abstract_factory.view.ViewMode;

/**
 * Для ванной команты мы желаем иметь девайсы с ночным режимом и технической информацией
 */
public class BathroomFactory implements ModeFactory {
    @Override
    public PresentationMode getPresentationMode() {
        return new TechnicalPresentationMode();
    }

    @Override
    public ViewMode getViewMode() {
        return new NightViewMode();
    }
}
