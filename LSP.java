// Title: A Java program to demonstrate Liskov's Substitution Principle.
// Author: Aditi Debnath, Student ID: 220224
//*************************************************************************

/**
 * Represents an employee.
 */
class Employee {
    protected String name;
    protected String designation;

    /**
     * Constructs an Employee object with the given name and designation.
     * 
     * @param name        The name of the employee.
     * @param designation The designation of the employee.
     */
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    /**
     * Gets the name of the employee.
     * 
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the designation of the employee.
     * 
     * @return The designation of the employee.
     */
    public String getDesignation() {
        return designation;
    }
}

/**
 * Represents a software developer.
 */
class SoftwareDeveloper extends Employee {
    private String programmingLanguage;

    /**
     * Constructs a SoftwareDeveloper object with the given name, designation, and programming language.
     * 
     * @param name              The name of the software developer.
     * @param designation       The designation of the software developer.
     * @param programmingLanguage The programming language the developer is proficient in.
     */
    public SoftwareDeveloper(String name, String designation, String programmingLanguage) {
        super(name, designation);
        this.programmingLanguage = programmingLanguage;
    }

    /**
     * Gets the programming language the developer is proficient in.
     * 
     * @return The programming language the developer is proficient in.
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}

/**
 * Main class to demonstrate the Liskov Substitution Principle.
 */
public class Main {
    public static void main(String[] args) {
        // Create an employee
        Employee employee = new SoftwareDeveloper("Alice", "Software Engineer", "Java");

        // Print employee information
        printEmployeeInfo(employee);
    }

    /**
     * Prints information about the given employee.
     * 
     * @param employee The employee to print information about.
     */
    public static void printEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());

        // Check if the employee is a software developer
        if (employee instanceof SoftwareDeveloper) {
            SoftwareDeveloper developer = (SoftwareDeveloper) employee; // Downcasting
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }
}
