package AssignmentQuastech;
import java.util.Scanner;

public class MaxBetweenTwoNos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second no: ");
        double num2 = sc.nextDouble();

        double max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + max);
        sc.close();
    }
}

