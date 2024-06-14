package AssignmentQuastech;
public class PrintAllPerfectNumbers {

    public static void main(String[] args) {
        System.out.println("Perfect Numbers between 1 and 10,000:");

        for (int i = 1; i <= 10000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfectNumber(int num) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == num;
    }
}

