package AssignmentQuastech;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortAscendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}

