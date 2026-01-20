package Day05;
import java.util.Scanner;


public class Else_if {
        public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        
        // Using Else if Ladder..
        if(age>=30)
        {
            System.out.println("You are a Man");
        }
        else if(age >=18)
        {
            System.out.println("You are an Adult");
        }
        else if (age >=15)
        {
            System.out.println("You are a Boy");
        }
        else 
        {
            System.out.println("You are a Child");
        }


    }
    
}

    

