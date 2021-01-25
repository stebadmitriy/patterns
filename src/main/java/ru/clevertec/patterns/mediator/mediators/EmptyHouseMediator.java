package ru.clevertec.patterns.mediator.mediators;

import ru.clevertec.patterns.mediator.components.*;

/**
 * Конкретный посредник. Все связи между конкретными устройствами нашего дома переехали в
 * код посредника. Он получает извещения от своих устройств и знает как на них
 * реагировать.
 */

public class EmptyHouseMediator implements Mediator {

    private Humidifier humidifier;
    private LEDLight ledLight;
    private Vacuum vacuum;
    private Conditioner conditioner;
    private TemperatureSensor temperatureSensor;

    @Override
    public void sendNotification() {
        ledLight.switchOff();
    }


    @Override
    public void registerComponent(Communicable device) {
        device.setMediator(this);
        String name = device.getName();
        switch (name) {
            case "Humidifier": {
                humidifier = (Humidifier) device;
                break;
            }
            case "LEDLight": {
                ledLight = (LEDLight) device;
                break;
            }
            case "Vacuum": {
                vacuum = (Vacuum) device;
                break;
            }
            case "Conditioner": {
                conditioner = (Conditioner) device;
                break;
            }
            case "TemperatureSensor": {
                temperatureSensor = (TemperatureSensor) device;
                break;
            }
        }
    }

    @Override
    public void applyNextStep(Communicable device) {
        String name = device.getName();
        switch (name) {
            case "Humidifier": {
                humidifier = (Humidifier) device;


                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                temperatureSensor.setTemperature(15);
                /***/

                double temperature = temperatureSensor.getTemperature();
                while (temperature < 18) {
                    conditioner.switchOn();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    temperature++;
                    System.out.println("Current temperature is " + temperature);
                }
                conditioner.switchOff();
                break;
            }
            case "LEDLight": {
                vacuum.vacuumApartment();
                break;
            }
            case "Vacuum": {
                humidifier.switchOn();
                humidifier.setHumidity(58);
                break;
            }
        }
    }
}
