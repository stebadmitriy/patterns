package ru.clevertec.patterns.factory_method.factory;

import ru.clevertec.patterns.factory_method.entities.DayMode;
import ru.clevertec.patterns.factory_method.entities.NightMode;
import ru.clevertec.patterns.factory_method.entities.ViewMode;

public enum ViewModeFactory {
    DAY_MODE{
        @Override
        public ViewMode getViewMode() {
            return new DayMode();
        }
    },
    NIGHT_MODE{
        @Override
        public ViewMode getViewMode() {
            return new NightMode();
        }
    };

    public abstract ViewMode getViewMode();
}
