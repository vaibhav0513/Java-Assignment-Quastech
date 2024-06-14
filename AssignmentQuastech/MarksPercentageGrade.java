package AssignmentQuastech;
import java.util.Scanner;

public class MarksPercentageGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics, chemistry, biology, mathematics, computer;
        double totalMarks;
        double percentage;
        char grade;

        System.out.print("Enter marks for Physics: ");
        physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        chemistry = sc.nextDouble();

        System.out.print("Enter marks for Biology: ");
        biology = sc.nextDouble();

        System.out.print("Enter marks for Mathematics: ");
        mathematics = sc.nextDouble();

        System.out.print("Enter marks for Computer: ");
        computer = sc.nextDouble();

        totalMarks = physics + chemistry + biology + mathematics + computer;
        percentage = (totalMarks / 500) * 100;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}

