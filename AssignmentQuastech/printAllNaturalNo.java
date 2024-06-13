package AssignmentQuastech;
import java.util.Scanner;

public class printAllNaturalNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Use a for loop to print natural numbers from 1 to n
            System.out.println("Natural numbers from 1 to " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

