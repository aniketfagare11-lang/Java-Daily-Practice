package Day08;
import java.util.Scanner;

public class PracticeSet1 {
    
    public static void main( String[] args){
    
    //Question1: WAP to Sum Numbers in java Take input From User..
    System.out.println("Program For Add Three Numbers");
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int a= sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int b=sc.nextInt();
    System.out.println("Enter 3rd Number:");
    int c=sc.nextInt();
    int sum=a+b+c;
    System.out.println("Sum Of Three Numbers:");
    System.out.println(sum); 



    //Question2: WAP To calculate CGPA using marks of three Subjects (out of 100) .take input from user.
    /*System.out.println("Program for Calculate CGPA");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Subjects Marks out of 100:")
        System.out.println("Enter 1st Subject Marks:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Subject Marks:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Subject Marks:");
        int c=sc.nextInt();
        int totalmarks=300;
        float percent=((a+b+c)*100)/totalmarks;
        float cgpa=percent/10f;
        System.out.println("Your Gained CGPA:");
        System.out.println(cgpa);*/
    

    //Question3: WAP which asks the user to enter  his/her name and greets them with "Hello<name>,have a Good Day"
   /* Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Name:");
    String a=sc.next();
    System.out.println("Hello!!"+ a);
    System.out.println("Have a Good day!!");*/


    //Question4 : WAP to convert kilometer to miles..
    /*Scanner sc =new Scanner(System.in);
    System.out.println("---Program to Convaert kiloMeter to Miles---");
    System.out.println("Enter Kilometers:");
    float a=sc.nextFloat();
    float b= a/1.60f;
    System.out.println("The given kilometers into Miles:" + b); */

    //Question5: WAP To detect whether a number entered by the user is interger or not.
    Scanner input =new Scanner(System.in);
    System.out.println("Enter Number :");
    boolean x = input.hasNextInt();
    System.out.println(x);



    

}
}
    

