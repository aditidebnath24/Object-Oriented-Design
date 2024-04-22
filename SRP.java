// Title: A java programe to show Single Responsibility Principle 
// Author: Aditi Debnath, Student Id: 220224
/**
 * This class represents a simple Employee.
 */
class Employee {
    private String name;
    private int age;
    private String department;

    /**
     * Constructs a new Employee object with the given name, age, and department.
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
     * Retrieves the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age of the employee.
     *
     * @return The age of the employee.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the department the employee belongs to.
     *
     * @return The department the employee belongs to.
     */
    public String getDepartment() {
        return department;
    }
}

/**
 * This class represents a simple EmployeeManagementSystem.
 */
class EmployeeManagementSystem {

    /**
     * Prints the details of an employee.
     *
     * @param employee The employee whose details to print.
     */
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Department: " + employee.getDepartment());
    }
}

/**
 * This class demonstrates the usage of Employee and EmployeeManagementSystem classes.
 */
class Single_Responsibility_Principle {
    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("John", 30, "Human Resources");

        // Manage the employee using EmployeeManagementSystem
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Print employee details using EmployeeManagementSystem
        ems.printEmployeeDetails(employee);
    }
}
