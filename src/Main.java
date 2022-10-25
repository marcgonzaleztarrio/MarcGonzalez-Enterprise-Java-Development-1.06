import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {



        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                employees.add(new Employee(UUID.randomUUID(), "nameBOSS " + i, "work " + i, getSalary(35000, 45000)));
            }else {
                employees.add(new Intern(UUID.randomUUID(), "nameINTERN " + i, "work " + i, getSalary(15000, 25000)));
            }
        }

        var scanner = new Scanner(System.in);
        var writer = new FileWriter("src/result.txt", true);

        for (Employee employee : employees) {
            writer.write(employee.getName() + " --> " + employee.getSalary() + "\n");
            System.out.println(employee.getName() + " --> " + employee.getSalary());
        }
        writer.close();
        scanner.close();
    }

    private static int getSalary(int min, int max) {
        Random r = new Random();
        return r.nextInt(max-min)+min;
    }

}
