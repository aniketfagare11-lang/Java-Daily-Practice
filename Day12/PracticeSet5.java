package Day12;

    public class PracticeSet5 {
    public static void main(String[] args)
    {
        // Question 1:To print * Pattern
        /*int n=5;
        for (int i=n ; i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //Question 2:Print even numbers using for loop.
        /*int sum=0;
        int n=4;
        for (int i=0;i<n;i++)
        {
            sum=sum +(2*i);
           
        }
        System.out.println("Sum of even Numbers is:");
        System.out.print(sum);*/
        
        //Question 3:Print Table of given numbers..
        /*int n=10;
        for (int i=n;i<=n*10;i=i+n)
        {
            System.out.println(i);
        }*/

        //Question 4:printing table in reverse order..
        /*int n=10;
        for(int i=n*10;i>=n;i=i-n)
        {
            System.out.println(i);
        }*/

        //Question 5 :Factorial of 5 using for loop
        /*int n =5;
        int factorial=1;
        for (int i=1;i<=n;i++)
        {
            factorial *=i;
        }
        System.out.println(factorial);*/

      //Question 6:factorial of 8 using while loop.
       /* int n=8;
        int i=1;
        int factorial =1;
        while (i<=n)
        {
            factorial *=i;
            i++;
        }
        System.out.println(factorial);*/

        //Question 7:Calculate the sum of 8 in the multiplication table..
        /*int sum=0;
        int n=8;
        for (int i=1;i<=10;i++)
        {
            sum +=i*n;
           
        }
        System.out.println(sum);*/

        // Question 8:Print even Numbers using while loop
        int  n=5;
        int sum=0;
        int i=0;
        while(i<=n)
        {
            sum=sum+(2*i);
            i++;
        }
        System.out.println(sum);

    }
    
}


    

