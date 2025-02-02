public class Student{
    // Attributes
    private String name;
    private double marks;

    //constructor
    public Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    //method to dispaly Details
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    //Getter for marks
    public double getMarks(){
        return marks;
    }
}