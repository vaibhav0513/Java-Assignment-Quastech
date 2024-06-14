package AssignmentQuastech;
import java.util.Scanner;

public class TriangleValidityBySides {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of the triangle: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of the triangle: ");
        double side3 = sc.nextDouble();
        boolean isValid = isTriangleValid(side1, side2, side3);
        if (isValid) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
        sc.close();
    }
    public static boolean isTriangleValid(double side1, double side2, double side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) &&
                (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }
}
