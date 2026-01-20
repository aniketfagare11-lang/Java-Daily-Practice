package Day06;
import java.util.Scanner;

public class ForLoop {
    
    public static void main(String [] args)
    {
        for(int b=1;b<=10;b++) // Printing 1 to 10 Numbers..
        {
            System.out.println(b);
        }

       
        // Question -- To Print Odd Numbers Using For Loop
        System.out.println("Printing Odd Numbers:");
         for(int i=1; i<=20; i+=2)
        {
            System.out.println(i);
        }

        // Decrement for Loop
        System.out.println("Printing 10 to 1 In DESC:");
        for (int a=10;a >0;a--)
        {
            System.out.println(a);
        }

        //Print first N Natural Numbers in Reverse Order
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number:");
        int c=sc.nextInt();
        
        for (int d=c;d>=1;d--)
        {
            System.out.println(d);
        }
        
    }
    
}

    

