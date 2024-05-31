package org.example;

public class MotorCycle extends Vehicle {
    // Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.

    private int speed;
    private int acceleration;

    public MotorCycle(String manufacturer, String model, int yearOfManufacture, int speed, int acceleration) {
        super(manufacturer, model, yearOfManufacture);
        this.speed = speed;
        this.acceleration = acceleration;
    }
}
