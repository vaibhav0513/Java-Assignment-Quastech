package AssignmentQuastech;
import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int rev=0,r;
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int t=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of the number is: "+rev);
        if(rev==t)
            System.out.println("The number is palindrome. ");
        else
            System.out.println("The number is not palindrome. ");
    }

}
