package AssignmentQuastech;
public class CheckAllArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong Nos between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrongNumber(int num) {
        int numOfDigits = String.valueOf(num).length();
        int sumOfPowers = 0;
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            sumOfPowers += Math.pow(digit, numOfDigits);
            num /= 10;
        }
        return sumOfPowers == originalNum;
    }
}

