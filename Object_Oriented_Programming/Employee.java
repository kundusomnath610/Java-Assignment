/*  Java Assignment for CloudVandana..

 *  Question:- 2
 *  Object-Oriented Programming - Employee Management System.
 *  
 *  Design a simple Java class Employee with the following attributes:
•   id (integer)
•   name (string)
•   salary (double)
 * 
 * 
 *  Create a method displayDetails() to print employee details.
 * 
 *  Perform this Task:-
 *  Create at least 3 Employee objects.
 *  Store them in a list.
 *  Display their details.
 * 
 * 
 */


package Object_Oriented_Programming;

import java.util.ArrayList;
import java.util.List;

class EmployeeDetails {

    private int id;

    private String name;

    private double salary;


    // Create Constructor....
    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display the Employee Details...
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        
        // Creating Object for EmployeeDetails class With Values
        EmployeeDetails emp1 = new EmployeeDetails(101, "Somanth", 50000.0);
        EmployeeDetails emp2 = new EmployeeDetails(102, "Rajat", 55000.0);
        EmployeeDetails emp3 = new EmployeeDetails(103, "Sumit", 65000.0);
        EmployeeDetails emp4 = new EmployeeDetails(104, "Arpan", 45000.0);
        EmployeeDetails emp5 = new EmployeeDetails(103, "Sumit", 65000.0);
        EmployeeDetails emp6 = new EmployeeDetails(104, "Arpan", 45000.0);

        // Store them into a ArrayList throungh add Method..
        List<EmployeeDetails> employeeDetails = new ArrayList<>();
        employeeDetails.add(emp1);
        employeeDetails.add(emp2);
        employeeDetails.add(emp3);
        employeeDetails.add(emp4);
        employeeDetails.add(emp5);
        employeeDetails.add(emp6);

        // Display the employee Details 
        System.out.println("Display the Employee Details:- ");

        // Itreate the list through forEach loop..
        for(EmployeeDetails emp : employeeDetails) {
            emp.displayDetails();
        }
    }
}