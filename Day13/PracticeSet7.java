package Day13;

public class PracticeSet7 {
 //Question 1: to Print n number of Multiplication Table..
    /*static void multiplication(int n)
    {
        for (int i=n;i<=n*10;i=i+n)
        {
            System.out.println(i);
        }
    }


    public static void main(String[] args) 
    {
        int n =2;
        multiplication(n);
    }*/

//Question 2: To print * Pattern
/*static void Pattern1(int n)
{
    for (int i=0;i<n;i++)
    {
        for (int j=0;j<i+1;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

public static void main(String[] args) 
{
    int n=5;
    Pattern1(n);
}*/

//To Calculate First n Natural numbers value..
/*static int sum(int n)
{
    if(n==1)
    {
        return 1;
    }
    return n + sum(n-1);
}
public static void main(String[] args) 
{
    int n=3;
    System.out.println(sum(n));

}*/

//To Print * Pattern
/*static void Pattern2(int n)
{
    for (int i=n ; i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
}
public static void main(String[] args)
{
    int n=5;
    Pattern2(n);    
}*/


//To print Fibonacci Series.
/*static int fibonacci(int n)
{
    if (n==1)
    {
        return 0;
    }
    else if(n==2)
    {
        return 1;
    }
    else
    {
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    
}
public static void main(String[] args)
{
    int n =7;
    System.out.println(fibonacci(n));
    
}*/

//To print * Pattern using recursion
/*static void  pattern(int n)
{
   
    if(n>0)
    {
         pattern (n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
    System.out.println();
}

public static void main(String[] args) 
{
    int n= 5;
    pattern(n);
    

}*/

}
    

