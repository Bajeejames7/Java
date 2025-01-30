/*program to calculate the net salary of an
 employee given the salary and discount, depending on years of work*/

 //Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 22/1/2025
 //version 1.0

//public class called calculate_salary
public class calculate_salary_hard_coded {
    //where the actual code execution starts.
    public static void main(String[] args) {
       
        //hard coded value for salary is collected from the scanner and saved as a double data type called employee_salary
        double employee_salary= 50000;

        //hard coded value for the years are taken from the scanner and stored as int datatype
        int service_years= 7;

        //conditional statement to determine the net salary of an employee, depending of years they have worked in the organization
        if(service_years>10){
            //This part calculates the bonus the employee will get
            double bonus=(0.12 * employee_salary);
            //This line of code add the bonus and the original employee salary to get the net salary
            double net_salary=bonus+employee_salary;
            //This line will output the net salary for the user to see how much their net salary is
            System.out.println("Your Net salary is:" +net_salary);
        }
        else if(service_years>=6){
            double bonus=(0.1 * employee_salary);
            double net_salary=bonus+employee_salary;
            System.out.println("Your Net salary is:" +net_salary);
        }
        else if(service_years<6 && service_years>=1 ){
            double bonus=(0.12 * employee_salary);
            double net_salary=bonus+employee_salary;
            System.out.println("Your Net salary is:" +net_salary);
        }
        
        else{
            //This last part of the conditional statements will display if the user entered an invalid number of years, like -2 years
            System.out.println("YEARS WORKED INVALID");
            //if the input is invalid, then the program will exit with an error, and get terminated
            System.exit(0);
        }

    
    }
}