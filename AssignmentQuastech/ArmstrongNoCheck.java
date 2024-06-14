package AssignmentQuastech;
import java.util.Scanner;

public class ArmstrongNoCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isArmstrong = checkArmstrong(number);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong no.");
        } else {
            System.out.println(number + " is not an Armstrong no.");
        }
        sc.close();
    }

    public static boolean checkArmstrong(int num) {
        int numberOfDigits = Integer.toString(num).length();

        int sum = 0;
        int tempNumber = num;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;

            sum += Math.pow(digit, numberOfDigits);

            tempNumber /= 10;
        }
        return sum == num;
    }
}

