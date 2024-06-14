package AssignmentQuastech;
import java.util.Scanner;

public class TriangleValidChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first angle of the triangle: ");
        double angle1 = sc.nextDouble();

        System.out.print("Enter the second angle of the triangle: ");
        double angle2 = sc.nextDouble();

        System.out.print("Enter the third angle of the triangle: ");
        double angle3 = sc.nextDouble();

        boolean isValid = isTriangleValid(angle1, angle2, angle3);

        if (isValid) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
        sc.close();
    }
    public static boolean isTriangleValid(double angle1, double angle2, double angle3) {
        return (angle1 > 0 && angle2 > 0 && angle3 > 0) && (angle1 + angle2 + angle3 == 180);
    }
}
