package Day05;
import java.util.Scanner;

public class Switch {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age (1-25):");
        int age = sc.nextInt();
        
        switch (age)
        {
            case 25:
                System.out.println("You are a Man Now ");
                break;
            case 18:
                System.out.println("You are an Adult Now");
                break;
            case 15:
                System.out.println("You are a Boy Now ");
                break;
            default:
                System.out.println("You are a Child Now");
            
        }

    }
    
}

    

