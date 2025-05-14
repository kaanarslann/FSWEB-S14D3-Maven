package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, int batterySize, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "the hybrid car's engine is starting";
    }

    @Override
    public String drive() {
        return "the hybrid car is driving";
    }
}
