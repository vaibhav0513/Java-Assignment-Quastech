package AssignmentQuastech;
import java.util.Scanner;

public class EmployeeGrossSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = 0, da = 0;
        if (basicSalary <= 10000) {
            hra = basicSalary * 0.2;
            da = basicSalary * 0.8;
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.9;
        } else {
            hra = basicSalary * 0.3;
            da = basicSalary * 0.95;
        }
        double grossSalary = basicSalary + hra + da;
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        sc.close();
    }
}
