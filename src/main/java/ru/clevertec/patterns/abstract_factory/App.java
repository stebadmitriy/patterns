package ru.clevertec.patterns.abstract_factory;



import ru.clevertec.patterns.abstract_factory.factories.ModeFactory;
import ru.clevertec.patterns.abstract_factory.factories.RoomFactory;
import ru.clevertec.patterns.abstract_factory.service.ProcessService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    public static void main(String[] args) {
        try (InputStream inputStream = ru.clevertec.patterns.factory_method.App.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String mode = properties.getProperty("room");
            ModeFactory modeFactory = RoomFactory.valueOf(mode).getModeFactory();

            ProcessService processService =
                    new ProcessService(modeFactory.getViewMode(), modeFactory.getPresentationMode());
            processService.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
