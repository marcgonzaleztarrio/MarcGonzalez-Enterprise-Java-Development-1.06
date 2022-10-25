import java.util.UUID;

public class Employee {
    //Create an Employee class to represent an employee of a company.
    // Add all relevant properties and behaviors that you might need
    // but you have to include a salary property. Don’t forget to add getters and setters.
    //Create an Intern class that extends from Employee.
    // All the Interns have a salary limit of 20000 (constant).
    // You must validate if an intern is created (or salary updated) with a
    // bigger salary than the max. The max value is set.
    //Write a program that creates 10 Employees and print it al the properties into a file
    // named employees.txt.

    private UUID employeeID;
    private String name;
    private String work;
    private int salary;

    public Employee(UUID employeeID, String name, String work, int salary) {
        this.setEmployeeID(employeeID);
        this.setName(name);
        this.setWork(work);
        this.setSalary(salary);
    }

    public UUID getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(UUID employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
