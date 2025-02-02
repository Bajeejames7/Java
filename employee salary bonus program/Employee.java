//public class called employee
public class Employee {
    // Attributes
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Getter method for salary
    public double getSalary() {
       return salary;
    }
}
