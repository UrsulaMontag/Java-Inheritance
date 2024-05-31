package org.example;

public class Main {
    public static void main(String[] args) {
        // Step 5: Create instances of the "Vehicle" and "Car"
        // classes and call the methods to output the information.
        Vehicle myVehicle = new Vehicle("Company", "Car", 2000);
        Car myCar = new Car("Toyota", "Corolla", 2000, 2);
        MotorCycle myMotorCycle = new MotorCycle("Sauberwisch", "Feuerblitz", 2012, "flying broom", 300, 50);

        myVehicle.printVehicle();
        myCar.printVehicle();
        myMotorCycle.printVehicle();
    }
}