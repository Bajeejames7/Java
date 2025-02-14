import java.util.Scanner;

// Class for storing student details
class StudentRecord {
    // Fields
    String studentID;
    String name;
    String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Main class for the application
public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        // Creating StudentRecord object with user inputs
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Displaying student details
        student.displayInfo();

        input.close();
    }
}
