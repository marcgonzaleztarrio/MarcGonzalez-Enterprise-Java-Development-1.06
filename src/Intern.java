import java.util.UUID;

public class Intern extends Employee {

    private int maxSalary = 20000;

    public Intern(UUID employeeID, String name, String work, int salary) {
        super(employeeID, name, work, salary);
    }
    @Override
    public void setSalary(int salary) {
        if (salary > maxSalary){
            this.setSalary(maxSalary);
            return;
        }

        super.setSalary(salary);
    }
}
