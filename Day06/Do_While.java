package Day06;
import java.util.Scanner;

public class Do_While {
    
    public static void main(String [] args)
    {
        /*int a=0;
        do {
            System.out.println(a);
            a++;
        }while(a<10);*/

       
       // Printing -- N numbers of Natural Numbers...
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A number to Print Natural Numbers:");
        int b=sc.nextInt();
        int c=0;
        do{
            System.out.println(c);
            c++;
        }while(c<=b);

    }
    
}

    

