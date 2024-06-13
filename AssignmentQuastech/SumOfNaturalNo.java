package AssignmentQuastech;
import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("The sum of all natural numbers from 1 to " + n + " is: " + sum);

        sc.close();
    }
}
