import java.util.Scanner;

public class Precedence {
    public static void main (String [] args)
    {
        int a = 32/2+6*5; // Highest Precedence goes to * and /.They are Evaluated on the basis of left to right Associativity
        System.out.println(a);
        
        int b = 30*5-12/2;
        System.out.println(b);

        //Quick Quiz Q- Write Expressions in Java..
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
       // int o = (x-y)/2;                 // first Expression
       //float o= (y*y - 4.0f*x*z)/ 2.0f*x;// Second Expression
       //int o= x*x-y*y;                   //Third Expression
        int o=x*y-z;                       // Fourth EXpression
       System.out.println(o);              // (Use Variables each expression as per need )

    }    
}
 
