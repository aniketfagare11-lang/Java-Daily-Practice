package Day09;

public class Methods {
    static int logic (int x,int y) // Function in java 
    {
        int z;
        if (x>y)
        {
            z=x+y;
        }
        else
        {
            z=x*y;
        }
        return z;
    }
    
    public static void main (String [] args)
    {
        int a =10;
        int b =7;
        int c ;
        // Methid invocation using Object creation
        //methods obj = new methods();
        //c=obj.logic(a,b);
        
        c= logic(a,b); // Calling the function..
        System.out.println(c);

        int d=8;
        int s=12;
        int n= logic(d,s); // calling the function..
        System.out.println(n);
    }

    

}

    

