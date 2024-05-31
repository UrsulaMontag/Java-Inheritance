package org.example;

public class Car extends Vehicle {
    // Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties
    // like "Number of Doors".

    private int doorsQuantity;

    public Car(String manufacturer, String model, int yearOfManufacture, int doorsQuantity) {
        super(manufacturer, model, yearOfManufacture);

        this.doorsQuantity = doorsQuantity;
    }
}
