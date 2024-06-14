package AssignmentQuastech;
import java.util.Scanner;

public class MaxBetweenThreeNos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the three numbers
        System.out.print("Enter the first no: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second no: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the third no: ");
        double num3 = sc.nextDouble();

        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Max between " + num1 + ", " + num2 + " and " + num3 + " is: " + max);
        sc.close();
    }
}

