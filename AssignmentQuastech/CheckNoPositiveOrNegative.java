package AssignmentQuastech;
import java.util.Scanner;

public class CheckNoPositiveOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.println(number + " is a positive no.");
        } else if (number < 0) {
            System.out.println(number + " is a negative no.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}

