package AssignmentQuastech;

public class PrintAllStrongNumbers {

    public static void main(String[] args) {
        System.out.println("Strong Numbers between 1 and 100,000:");
        for (int i = 1; i <= 100000; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;
        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }
        return sumOfFactorials == originalNum;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

