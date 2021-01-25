package ru.clevertec.patterns.builder.builders;

import ru.clevertec.patterns.builder.entities.Display;
import ru.clevertec.patterns.builder.entities.TV;
import ru.clevertec.patterns.builder.entities.TVFunction;

public class TVBuilder implements Builder {
    private String model;
    private String number;
    private Display display;
    private TVFunction voiceControl;
    private TVFunction record;
    private TVFunction internetSurfing;
    private TVFunction camera;
    private TVFunction game;

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void setVoiceControl(TVFunction voiceControl) {
        this.voiceControl = voiceControl;
    }

    @Override
    public void setRecord(TVFunction record) {
        this.record = record;
    }

    @Override
    public void setInternetSurfing(TVFunction internetSurfing) {
        this.internetSurfing = internetSurfing;
    }

    @Override
    public void setCamera(TVFunction camera) {
        this.camera = camera;
    }

    @Override
    public void setGame(TVFunction game) {
        this.game = game;
    }

    @Override
    public TV getTv() {
        return new TV(model, number, display, voiceControl, record, internetSurfing, camera, game);
    }
}
