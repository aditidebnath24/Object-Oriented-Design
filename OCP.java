//Title: A java programme to show Open Close Principle 
//Author: Aditi Debnath, Student Id: 220224
/**
 * Abstract class representing an employee.
 */
abstract class Employee {
    protected String name;
    protected int age;
    protected String department;

    /**
     * Constructs an Employee object with the given details.
     * 
     * @param name       The name of the employee.
     * @param age        The age of the employee.
     * @param department The department the employee belongs to.
     */
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    /**
     * Calculates the statistics or performance metrics of the employee.
     */
    public abstract void calculatePerformance();
}

/**
 * Represents a software developer employee.
 */
class Developer extends Employee {
    private int totalProjects;
    private int bugsFixed;

    /**
     * Constructs a Developer object with the given details.
     * 
     * @param name          The name of the developer.
     * @param age           The age of the developer.
     * @param department    The department the developer belongs to.
     * @param totalProjects The total projects completed by the developer.
     * @param bugsFixed     The total bugs fixed by the developer.
     */
    public Developer(String name, int age, String department, int totalProjects, int bugsFixed) {
        super(name, age, department);
        this.totalProjects = totalProjects;
        this.bugsFixed = bugsFixed;
    }

    @Override
    public void calculatePerformance() {
        double bugFixRate = (double) bugsFixed / totalProjects;
        System.out.println("Developer: " + name);
        System.out.println("Department: " + department);
        System.out.println("Bug Fix Rate: " + bugFixRate);
    }
}

/**
 * Represents a manager employee.
 */
class Manager extends Employee {
    private int teamSize;
    private int projectsCompleted;

    /**
     * Constructs a Manager object with the given details.
     * 
     * @param name             The name of the manager.
     * @param age              The age of the manager.
     * @param department       The department the manager belongs to.
     * @param teamSize         The size of the manager's team.
     * @param projectsCompleted The total projects completed by the manager's team.
     */
    public Manager(String name, int age, String department, int teamSize, int projectsCompleted) {
        super(name, age, department);
        this.teamSize = teamSize;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public void calculatePerformance() {
        double projectCompletionRate = (double) projectsCompleted / teamSize;
        System.out.println("Manager: " + name);
        System.out.println("Department: " + department);
        System.out.println("Project Completion Rate: " + projectCompletionRate);
    }
}

/**
 * Main class to demonstrate the Open-Closed Principle with employees.
 */
public class Main {
    public static void main(String[] args) {
        // Create a developer
        Employee developer = new Developer("Alice", 30, "Engineering", 20, 100);
        developer.calculatePerformance();

        // Create a manager
        Employee manager = new Manager("Bob", 40, "Engineering", 5, 15);
        manager.calculatePerformance();
    }
}
