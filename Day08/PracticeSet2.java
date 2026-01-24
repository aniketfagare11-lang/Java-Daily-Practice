package Day08;
 import java.util.Scanner;
 
public class PracticeSet2 {
   
    public static void main (String [] args)
    {
        //Question 1: What will be the result of follwing expression..
        float a = (7.0f/4) * (9.0f/2);
        System.out.println(a);
        
       //Question 2: WAP to encrypt a grade by adding 8 to it.
       // and Decrypt it to show the correct grade.
         char grade ='B'; 
        grade =(char) (grade + 8); // Encrypting the grade
        System.out.println(grade);

        // Decrypting the grade 
        grade = (char)(grade - 8);
        System.out.println(grade);



        //Question 3: Use comparison operators to
        //find out whether a given num is greater than the user enterd number..
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int d = sc.nextInt();
        System.out.println(d>10);
    

        //Question 4:Find the value of the following expression..
        int x =7;
        int g=7*49/7 + 35/7;
        System.out.println("The Value Of D is :");
        System.out.println(g);



    }
    
}

    

