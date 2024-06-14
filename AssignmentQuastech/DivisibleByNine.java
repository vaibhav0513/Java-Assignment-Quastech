package AssignmentQuastech;

public class DivisibleByNine {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        System.out.println("Numbers between 100 and 200 that are divisible by 9:");
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("Total count of numbers divisible by 9: " + count);
        System.out.println("Sum of numbers divisible by 9: " + sum);
    }
}

