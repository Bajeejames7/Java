//program to calculate the student grade based on marks entered by the user

//Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0

//importing the scanner
import java.util.Scanner;

//public class that will contain the execution part and link to other classes through objects
public class MainApp {

    //where the actual exection of the code begins
    public static void main(String[] args) {
        //creating object of student class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = input.nextLine();
        System.out.println("Enter the marks of the student: ");
        double marks = input.nextDouble();

        Student s1 = new Student(name, marks);
        //calling displayDetails method
        s1.displayDetails();
        //creating object of Grade_calculator class
        Grade_calculator g1 = new Grade_calculator();
        //calling calculateGrade method
        g1.calculateGrade(s1.getMarks());
        
        //diaplaying the grade
        g1.displayGrade();

        input.close();
    }
}
