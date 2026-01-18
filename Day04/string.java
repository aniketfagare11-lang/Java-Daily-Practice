package Day04;
import java.util.Scanner;

public class string {
    public static void main (String [] args)
    {
       // String st = new String(); 
        Scanner sc =new Scanner(System.in);
        String st = sc.nextLine();        
        
        // Methods to print 
        System.out.print("The Name is :");  // print - First Method 
        System.out.println(st);               // println - Second Method 
        int a = 6;
        float b = 7.8f;
        System.out.printf("The Value of a is :%d and value of b is :%.2f\n",a,b); // printf - Third Method
        System.out.format("The Value of a is :%d and value of b is :%.2f",a,b);   // format - Fourth Method


    }    
}

    

