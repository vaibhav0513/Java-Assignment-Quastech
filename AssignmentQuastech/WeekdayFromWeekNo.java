package AssignmentQuastech;
import java.util.Scanner;

public class WeekdayFromWeekNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number (1-7): ");
        int weekNumber = sc.nextInt();

        if (weekNumber < 1 || weekNumber > 7) {
            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        } else {
            String weekday;
            switch (weekNumber) {
                case 1:
                    weekday = "Monday";
                    break;
                case 2:
                    weekday = "Tuesday";
                    break;
                case 3:
                    weekday = "Wednesday";
                    break;
                case 4:
                    weekday = "Thursday";
                    break;
                case 5:
                    weekday = "Friday";
                    break;
                case 6:
                    weekday = "Saturday";
                    break;
                case 7:
                    weekday = "Sunday";
                    break;
                default:
                    weekday = "Invalid";
            }

            System.out.println("Weekday for week number " + weekNumber + " is " + weekday);
        }
        sc.close();
    }
}
