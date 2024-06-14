package AssignmentQuastech;
import java.util.Scanner;

public class ProfitOrLossCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;

        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }
        sc.close();
    }
}

