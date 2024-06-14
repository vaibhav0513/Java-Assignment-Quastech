package AssignmentQuastech;
import java.util.Scanner;

public class PowerUsingMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println("Result: " + base + "^" + exponent + " = " + result);
        sc.close();
    }
}

