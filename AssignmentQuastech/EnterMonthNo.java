package AssignmentQuastech;
import java.util.Scanner;

public class EnterMonthNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Month " + monthNumber + " is January.");
                break;
            case 2:
                System.out.println("Month " + monthNumber + " is February.");
                break;
            case 3:
                System.out.println("Month " + monthNumber + " is March.");
                break;
            case 4:
                System.out.println("Month " + monthNumber + " is April.");
                break;
            case 5:
                System.out.println("Month " + monthNumber + " is May.");
                break;
            case 6:
                System.out.println("Month " + monthNumber + " is June.");
                break;
            case 7:
                System.out.println("Month " + monthNumber + " is July.");
                break;
            case 8:
                System.out.println("Month " + monthNumber + " is August.");
                break;
            case 9:
                System.out.println("Month " + monthNumber + " is September.");
                break;
            case 10:
                System.out.println("Month " + monthNumber + " is October.");
                break;
            case 11:
                System.out.println("Month " + monthNumber + " is November.");
                break;
            case 12:
                System.out.println("Month " + monthNumber + " is December.");
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
        sc.close();
    }
}
