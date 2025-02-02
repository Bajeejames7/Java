//This is a program to calculate the employee bonus based on the salary...it is linked with external classes called Employee and SalaryCalculator

//Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0

 //importing the scanner tool
import java.util.Scanner;

//MainApp class
public class MainApp {
    ///where the actual code runs
    public static void main(String[] args) {
        //creating a scanner called input to collect the users input
        Scanner input = new Scanner(System.in);
        
        //askin for the users name and saving it as a string
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        //asking for the users salary and saving it as a double
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        // Creating Employee object
        Employee e1 = new Employee(name, salary);
        e1.displayDetails();

        // Creating SalaryCalculator object
        SalaryCalculator s1 = new SalaryCalculator();
        
        // Calling calculateBonus() method with salary
        s1.calculateBonus(e1.getSalary());

        // Displaying bonus
        s1.displayBonus();

        input.close();
    }
}
