/*program to model different types of vehicles using inheritance*/

 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0


// Base class for all vehicles
public class Vehicle {
    // Protected fields accessible by subclasses
    protected String brand;
    protected int speed;

    // Constructor to initialize brand and speed
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to increase speed
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated by " + increase + " km/h. Current speed: " + speed + " km/h.");
    }

    // Method to decrease speed but ensures it does not go below zero
    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down by " + decrease + " km/h. Current speed: " + speed + " km/h.");
    }

    // Method to display vehicle details
    // This will be overridden by subclasses
    public void showDetails() {
        System.out.println("Vehicle: " + brand + " | Speed: " + speed + " km/h");
    }
}
