package AssignmentQuastech;
import java.util.Scanner;
public class SumOfEvenNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("The sum of all even numbers from 1 to " + n + " is: " + sum);

        sc.close();
    }
}

