package ru.clevertec.patterns.builder.entities;

public class TVFunction {
    private String name;
    private String description;

    public TVFunction(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TVFunction{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
