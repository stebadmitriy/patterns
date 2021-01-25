package ru.clevertec.patterns.observer;

import ru.clevertec.patterns.observer.entities.Kettle;
import ru.clevertec.patterns.observer.entities.Robot;
import ru.clevertec.patterns.observer.entities.WaterLeakSensor;
import ru.clevertec.patterns.observer.listeners.FitnessBracelet;
import ru.clevertec.patterns.observer.listeners.Phone;
import ru.clevertec.patterns.observer.listeners.SmartWatch;
import ru.clevertec.patterns.observer.publisher.Hub;

import static ru.clevertec.patterns.observer.entities.State.*;

public class App {
    public static void main(String[] args) {
        Hub hub = new Hub(WATER_LEAK, KETTLE_WARMED_UP, ROBOT_DISCHARGED);

        Kettle kettle = new Kettle(hub);
        Robot robot = new Robot(hub);
        WaterLeakSensor waterLeakSensor = new WaterLeakSensor(hub);

        kettle.getHub().subscribe(KETTLE_WARMED_UP, new SmartWatch());
        robot.getHub().subscribe(ROBOT_DISCHARGED, new FitnessBracelet());
        Phone fatherPhone = new Phone();
        Phone matherPhone = new Phone();
        waterLeakSensor.getHub().subscribe(WATER_LEAK, fatherPhone);
        waterLeakSensor.getHub().subscribe(WATER_LEAK, matherPhone);

        kettle.warmUp();
        robot.charge();
        waterLeakSensor.wetSensor();
        System.out.println("-----------------");
        waterLeakSensor.getHub().unsubscribe(WATER_LEAK, matherPhone);

        kettle.warmUp();
        robot.charge();
        waterLeakSensor.wetSensor();
    }
}
