package ru.clevertec.patterns.abstract_factory.service;


import ru.clevertec.patterns.abstract_factory.presentation.PresentationMode;
import ru.clevertec.patterns.abstract_factory.view.ViewMode;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Работают через абстрактный интерфейс.
 */
public class ProcessService {
    private final ViewMode viewMode;
    private final PresentationMode presentationMode;

    public ProcessService(ViewMode viewMode, PresentationMode presentationMode) {
        this.viewMode = viewMode;
        this.presentationMode = presentationMode;
    }

    public void execute() {
        viewMode.decreaseBrightness();
        presentationMode.showInfo();
    }
}
