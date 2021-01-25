package ru.clevertec.patterns.builder;


import ru.clevertec.patterns.builder.builders.Builder;
import ru.clevertec.patterns.builder.builders.TVBuilder;
import ru.clevertec.patterns.builder.entities.Display;
import ru.clevertec.patterns.builder.entities.TV;
import ru.clevertec.patterns.builder.entities.TVFunction;

public class App {
    public static void main(String[] args) {
        Builder tvBuilder = new TVBuilder();

        /** Premium Smart TV*/
//        tvBuilder.setModel("XS-200-500");
//        tvBuilder.setNumber("123-456-789");
//        tvBuilder.setDisplay(Display.IPS);
//        tvBuilder.setVoiceControl(new TVFunction("Multi languages voice control",
//                "Supports voice control in 25 languages"));
//        tvBuilder.setInternetSurfing(new TVFunction("Chrome browser",
//                "Support internet surfing"));
//        tvBuilder.setRecord(new TVFunction("record only TV", "Support record only TV"));
//        tvBuilder.setCamera(new TVFunction("web camera", "Equipped web camera f2/0"));
//        tvBuilder.setGame(new TVFunction("Full game package", "installed 30 games"));

//        TV premiumTv = tvBuilder.getTv();
//        System.out.println(premiumTv);

        /** Simple Smart TV*/
        tvBuilder.setModel("SSF-200-500");
        tvBuilder.setNumber("456-789-123");
        tvBuilder.setDisplay(Display.OLED);
        tvBuilder.setInternetSurfing(new TVFunction("Chrome browser",
                "Support internet surfing"));
        tvBuilder.setGame(new TVFunction("Simple game package", "installed 3 games"));

        TV simpleTV = tvBuilder.getTv();
        System.out.println(simpleTV);
    }
}
