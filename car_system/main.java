//Car program to practice data encapsulation using java 

 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 13/3/2025
 //version 1.0


import java.util.Scanner;

class Car {
    // Private fields for license plate and rental status (data encapsulation)
    private String licensePlate;
    private boolean isRented;

    // Constructor to set the license plate when the car is created
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // By default, the car is not rented
    }

    // Method to rent the car
    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with license plate: " + licensePlate + " has been rented!");
        } else {
            System.out.println("Car with license plate: " + licensePlate + " is already rented!");
        }
    }

    // Method to return the car
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with license plate: " + licensePlate + " has been returned!");
        } else {
            System.out.println("Car with license plate: " + licensePlate + " was not rented!");
        }
    }

    // Getter method to check if the car is rented
    public boolean isCarRented() {
        return isRented;
    }

    // Getter method for license plate
    public String getLicensePlate() {
        return licensePlate;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the license plate
        System.out.print("Enter the license plate of the car: ");
        String licensePlate = scanner.nextLine();

        // Create a new car object
        Car car1 = new Car(licensePlate);

        // Rent the car
        car1.rentCar();

        // Attempt to rent the car again
        car1.rentCar();

        // Return the car
        car1.returnCar();

        // Attempt to return the car again
        car1.returnCar();

        // Close the scanner
        scanner.close();
    }
}