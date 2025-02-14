/*program to model different types of vehicles using inheritance*/

 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0

// Car class inheriting from Vehicle
public class Car extends Vehicle {
    // Additional attribute specific to Car
    private int fuelLevel;

    // Constructor to initialize brand, speed, and fuel level
    public Car(String brand, int speed, int fuelLevel) {
        // Calling the superclass (Vehicle) constructor
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    // Method to refuel the car
    // Ensures fuel level does not exceed 100%
    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println(brand + " refueled by " + amount + "%. Current fuel level: " + fuelLevel + "%.");
    }

    // Overriding showDetails() to display Car-specific details
    @Override
    public void showDetails() {
        System.out.println("Car: " + brand + " | Speed: " + speed + " km/h | Fuel Level: " + fuelLevel + "%");
    }
}
