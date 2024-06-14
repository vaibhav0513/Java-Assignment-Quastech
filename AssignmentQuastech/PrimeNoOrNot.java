package AssignmentQuastech;
import java.util.Scanner;

public class PrimeNoOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = checkPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime no.");
        } else {
            System.out.println(number + " is not a prime no.");
        }

        sc.close();
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

