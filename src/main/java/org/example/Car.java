package org.example;

public class Car extends Vehicle {
    // Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties
    // like "Number of Doors".

    private int doorsQuantity;

    public Car(String manufacturer, String model, int yearOfManufacture, int doorsQuantity) {
        super(manufacturer, model, yearOfManufacture);

        this.doorsQuantity = doorsQuantity;
    }

    // Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.println("And the number of doors is: " + doorsQuantity);
    }
}
