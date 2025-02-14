/*program to model different types of vehicles using inheritance*/

 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0


// Main class to test the Vehicle system
public class VehicleSystem {
    public static void main(String[] args) {
        // Creating a Car object with brand, initial speed, and fuel level
        Car car = new Car("Toyota", 60, 50);

        // Creating a Bike object with brand, initial speed, and helmet status
        Bike bike = new Bike("Yamaha", 40, false);

        // --- Actions for Car ---
        car.accelerate(20);  // Increases speed by 20 km/h
        car.brake(30);       // Decreases speed by 30 km/h
        car.refuel(30);      // Refuels the car by 30%
        car.showDetails();   // Displays car details

        System.out.println(); // Blank line for better output formatting

        // --- Actions for Bike ---
        bike.accelerate(15);   // Increases speed by 15 km/h
        bike.brake(10);        // Decreases speed by 10 km/h
        bike.wearHelmet();     // Sets helmet status to true
        bike.showDetails();    // Displays bike details
    }
}
