package ru.clevertec.patterns.builder.entities;

public class TV {
    private final String model;
    private final String number;
    private final Display display;
    private final TVFunction voiceControl;
    private final TVFunction record;
    private final TVFunction internetSurfing;
    private final TVFunction camera;
    private final TVFunction game;

    public TV(String model,
              String number,
              Display display,
              TVFunction voiceControl,
              TVFunction record,
              TVFunction internetSurfing,
              TVFunction camera,
              TVFunction game) {
        this.model = model;
        this.number = number;
        this.display = display;
        this.voiceControl = voiceControl;
        this.record = record;
        this.internetSurfing = internetSurfing;
        this.camera = camera;
        this.game = game;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public Display getDisplay() {
        return display;
    }

    public TVFunction getVoiceControl() {
        return voiceControl;
    }

    public TVFunction getRecord() {
        return record;
    }

    public TVFunction getInternetSurfing() {
        return internetSurfing;
    }

    public TVFunction getCamera() {
        return camera;
    }

    public TVFunction getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "TV{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", display=" + display +
                ", voiceControl=" + voiceControl +
                ", record=" + record +
                ", internetSurfing=" + internetSurfing +
                ", camera=" + camera +
                ", game=" + game +
                '}';
    }
}
