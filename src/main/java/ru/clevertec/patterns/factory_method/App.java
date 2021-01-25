package ru.clevertec.patterns.factory_method;

import ru.clevertec.patterns.factory_method.entities.ViewMode;
import ru.clevertec.patterns.factory_method.factory.ViewModeFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        try (InputStream inputStream = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);

            String mode = properties.getProperty("mode.view");
            ViewMode viewMode = ViewModeFactory.valueOf(mode).getViewMode();
            viewMode.increaseBrightness();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
