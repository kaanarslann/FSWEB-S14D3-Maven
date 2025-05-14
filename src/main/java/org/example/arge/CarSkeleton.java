package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        return "the car's engine is starting";
    }

    public String drive() {
        runEngine();
        return "the car is driving";
    }

    protected String runEngine() {
        return "the car's engine is running";
    }
}

