package AssignmentQuastech;
import java.util.Scanner;

public class ReverseNaturalNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Natural numbers from " + n + " to 1:");
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

