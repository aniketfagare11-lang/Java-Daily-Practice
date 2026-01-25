package Day10;
import java.util.Scanner;

public class Recursion {

    static int factorial(int n)
    {
        if (n<=0)
        {
            return 1;
        }
        else 
        {
            return n* factorial(n-1);
        }
    }
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();

        if (n<1)
        {
            System.out.println("Please enter Positive Number..");
        }
        else
        {
            System.out.println("The Factorial of Given Number is :"+ factorial(n));
        }
    }
    
}

    

