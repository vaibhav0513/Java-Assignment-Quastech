package AssignmentQuastech;
import java.util.Scanner;

public class LargestElementInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int maxElement = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + maxElement);
        sc.close();
    }
}
