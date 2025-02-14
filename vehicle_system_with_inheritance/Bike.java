/*program to model different types of vehicles using inheritance*/

 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0

// Bike class inheriting from Vehicle
public class Bike extends Vehicle {
    // Additional attribute specific to Bike
    private boolean helmetOn;

    // Constructor to initialize brand, speed, and helmet status
    public Bike(String brand, int speed, boolean helmetOn) {
        // Calling the superclass (Vehicle) constructor
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    // Method to wear a helmet, setting helmetOn to true
    public void wearHelmet() {
        helmetOn = true;
        System.out.println(brand + " rider is now wearing a helmet.");
    }

    // Overriding showDetails() to display Bike-specific details
    @Override
    public void showDetails() {
        // Conditional to display helmet status as Yes or No
        String helmetStatus = helmetOn ? "Yes" : "No";
        System.out.println("Bike: " + brand + " | Speed: " + speed + " km/h | Helmet On: " + helmetStatus);
    }
}
