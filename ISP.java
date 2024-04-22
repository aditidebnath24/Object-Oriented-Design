/ Title : A Java program to demonstrate Interface Segregation Principle.
// Author : Aditi Debnath, Student ID: 220224
//*************************************************************************
/**
 * Interface representing an employee in a company.
 */
interface Employee {
    void work();
}

/**
 * Interface representing a manager in a company.
 */
interface Manager {
    void manage();
}

/**
 * Interface representing a developer in a company.
 */
interface Developer {
    void code();
}

/**
 * Interface representing a tester in a company.
 */
interface Tester {
    void test();
}

/**
 * Class representing an employee in a company.
 */
class CompanyEmployee {
    protected String name;

    /**
     * Constructs a CompanyEmployee object with the given name.
     *
     * @param name The name of the employee.
     */
    public CompanyEmployee(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }
}

/**
 * Class representing a manager in a company.
 */
class ManagerEmployee extends CompanyEmployee implements Manager {
    /**
     * Constructs a ManagerEmployee object with the given name.
     *
     * @param name The name of the manager.
     */
    public ManagerEmployee(String name) {
        super(name);
    }

    @Override
    public void manage() {
        System.out.println(getName() + " is managing.");
    }
}

/**
 * Class representing a developer in a company.
 */
class DeveloperEmployee extends CompanyEmployee implements Developer {
    /**
     * Constructs a DeveloperEmployee object with the given name.
     *
     * @param name The name of the developer.
     */
    public DeveloperEmployee(String name) {
        super(name);
    }

    @Override
    public void code() {
        System.out.println(getName() + " is coding.");
    }
}

/**
 * Class representing a tester in a company.
 */
class TesterEmployee extends CompanyEmployee implements Tester {
    /**
     * Constructs a TesterEmployee object with the given name.
     *
     * @param name The name of the tester.
     */
    public TesterEmployee(String name) {
        super(name);
    }

    @Override
    public void test() {
        System.out.println(getName() + " is testing.");
    }
}

/**
 * Main class to demonstrate the Interface Segregation Principle.
 */
public class Main {
    public static void main(String[] args) {
        // Create manager
        ManagerEmployee manager = new ManagerEmployee("Alice");
        manager.manage();

        // Create developer
        DeveloperEmployee developer = new DeveloperEmployee("Bob");
        developer.code();

        // Create tester
        TesterEmployee tester = new TesterEmployee("Charlie");
        tester.test();
    }
}
