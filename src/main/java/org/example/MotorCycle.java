package org.example;

public class MotorCycle extends Vehicle {
    // Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.

    private String cycleType;
    private int speed;
    private int acceleration;

    public MotorCycle(String manufacturer, String model, int yearOfManufacture, String cycleType, int speed, int acceleration) {
        super(manufacturer, model, yearOfManufacture);
        this.cycleType = cycleType;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    // Implement a method in the "Motorcycle" class that returns the
    // type of motorcycle (e.g. Chopper, Sportbike, Cruiser).
    public String getCycleType() {
        return cycleType;
    }

    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.println("Your Motorcycle is a: " + cycleType + " " + speed + " " + acceleration);
    }

}
