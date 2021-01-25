package ru.clevertec.patterns.builder.builders;

import ru.clevertec.patterns.builder.entities.Display;
import ru.clevertec.patterns.builder.entities.TV;
import ru.clevertec.patterns.builder.entities.TVFunction;


public interface Builder {
    void setModel(String model);

    void setNumber(String number);

    void setDisplay(Display display);

    void setVoiceControl(TVFunction voiceControl);

    void setRecord(TVFunction record);

    void setInternetSurfing(TVFunction internetSurfing);

    void setCamera(TVFunction camera);

    void setGame(TVFunction game);

    TV getTv();
}
