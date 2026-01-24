package Day09;

public class MethodsOverloading {
    static void foo()
    {
        System.out.println("Good Night !!");
    }

    static void foo(int a)
    {
        System.out.println("Good night!! "+a+" Bro!!");
    }

    static void foo(int a,int b)
    {
         System.out.println("Good night!! "+a+" Bro!!");
          System.out.println("Good night!! "+b+" Bro!!");
    }

    static void change(int a)
    {
        a=98;
    }
    
    static void change2(int [] arr)
    {
        arr[0] =98;
    } 
    
    static void telljoke() 
    {
        System.out.println("Why did the computer go to the doctor?\n" + 
                        "Because it caught a virus… and forgot to update its antivirus");
    }
    public static void main (String [] args)
    {
       // telljoke();


       //Case 1: Changing the Integer
       //int x =45;
       //change(x);
      // System.out.println(x);

       //Case 2: Changing the array
       //int [] marks={45,56,78,89,90};
       //change2(marks);
       //System.out.println("The value of arry[0] after changing is :"+ marks[0]);

       //Methods Overloading
       foo();
       foo(2);
       foo(4,5);
        // Arguments are actual !

    }
    
    
}

    

