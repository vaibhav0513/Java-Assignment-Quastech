package AssignmentQuastech;

import java.util.Scanner;

public class EnterLargestAndSmallestNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int number;
        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("stop")) {
                    continueInput = false;
                } else {
                    System.out.println("Invalid input. Please enter a valid number or 'stop' to finish.");
                }
            }
        }
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
        sc.close();
    }
}

