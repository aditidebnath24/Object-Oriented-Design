// Title: A java programme to show Dependency Inversion Principle
//Author: Aditi Debnath, Student Id: 220224
//Interface defining the contract for data access
interface EmployeeDataAccess {
    void saveEmployee(Employee employee);
}

// Concrete implementation of EmployeeDataAccess
class DatabaseEmployeeDataAccess implements EmployeeDataAccess {
    @Override
    public void saveEmployee(Employee employee) {
        // Code to save employee data to a database
        System.out.println("Saving employee data to database: " + employee.getName());
    }
}

// Another concrete implementation of EmployeeDataAccess (can be used for testing or different storage mechanism)
class FileEmployeeDataAccess implements EmployeeDataAccess {
    @Override
    public void saveEmployee(Employee employee) {
        // Code to save employee data to a file
        System.out.println("Saving employee data to file: " + employee.getName());
    }
}

// Employee class depending on abstraction (EmployeeDataAccess interface)
class Employee {
    private String name;
    private EmployeeDataAccess dataAccess;

    // Constructor injection to provide EmployeeDataAccess implementation
    public Employee(String name, EmployeeDataAccess dataAccess) {
        this.name = name;
        this.dataAccess = dataAccess;
    }

    // Method to save employee data using the provided EmployeeDataAccess implementation
    public void save() {
        dataAccess.saveEmployee(this);
    }

    public String getName() {
        return name;
    }
}

// Main class for testing
public class Dependency Inversion Principle  {
    public static void main(String[] args) {
        // Creating employee objects with different data access implementations
        Employee employee1 = new Employee("John", new DatabaseEmployeeDataAccess());
        Employee employee2 = new Employee("Jane", new FileEmployeeDataAccess());

        // Saving employees
        employee1.save();
        employee2.save();
    }
}
