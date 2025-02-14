/*program to practice inheritance using java*/


 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0

import java.util.Scanner;

// Base class
class Vehicle {
    // Fields
    String brand;
    String model;
    int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass
class Car extends Vehicle {
    // Additional field for Car
    String fuelType;

    // Constructor for Car
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Calling the constructor of Vehicle
        this.fuelType = fuelType;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to Vehicle's displayDetails
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom Class
public class Showroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter Car Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Car Model: ");
        String model = input.nextLine();

        System.out.print("Enter Car Year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = input.nextLine();

        // Creating Car object with user inputs
        Car car1 = new Car(brand, model, year, fuelType);

        // Displaying car details
        car1.displayDetails();

        input.close();
    }
}
