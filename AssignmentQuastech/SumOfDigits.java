package AssignmentQuastech;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            sum += lastDigit;
            tempNumber = tempNumber / 10;
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);
        sc.close();
    }
}

