import java.util.Scanner;

public class Input {
    public static void main(String [] args){
        System.out.println("Taking Input From User");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value for  Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter value for Number 2:"); 
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum of two Numbers");
        System.out.println(sum);
    }    
}
