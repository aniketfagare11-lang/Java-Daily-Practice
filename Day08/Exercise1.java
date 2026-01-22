package Day08;
import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String [] args)
    {   
        // Question:
        // WAP to calculate percentage of a given Student in CBSE board exam.
       // His marks from 5 Subjects must be Taken as input from The Keyboard.
        System.out.println("---Program To Calculate Percentage---");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Marks Of Your Exam:");
        int Totalmarks= sc.nextInt();
        System.out.println("Enter Your Subject Marks Out of 100");
        System.out.println("Enter 1st Subject Marks: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd subject Marks:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Subject Marks:");
        int c=sc.nextInt();
        System.out.println("Enter 4th Subject Marks:");
        int d=sc.nextInt();
        System.out.println("Enter 5th Number Marks:");
        int e=sc.nextInt();
    
        //int Totalmarks=500;
        float percent=((a+b+c+d+e)*100)/500;
        System.out.println("The Percentage You gain is");
        System.out.println(percent);
    }
    
}

    

