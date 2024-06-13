package AssignmentQuastech;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
        // Fibnocci series
        int n, a=0,b=0,c=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of n:");
        n = sc.nextInt();
        System.out.println("Fibnocci series: ");
        for(int i=1; i<=n; i++)
        {
            a =b;
            b=c;
            c= a +b;
            System.out.print(a+ " ");
        }
    }

}

