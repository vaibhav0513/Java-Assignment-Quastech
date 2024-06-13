package AssignmentQuastech;

import java.util.Scanner;

public class MultiplicationTableReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table for " + number + " (in reverse):");
        for (int i = 10; i >= 1; i--) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
}

