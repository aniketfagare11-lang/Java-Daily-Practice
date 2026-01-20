package Day06;

public class BreakContinue {
    public static void main(String [] args)
    {
       /*  for (int i=1;i<=5;i++)
        {
            System.out.println(i);
            System.out.println("Java is Great.");

            if(i==2)
            {
                System.out.println("Exit The Loop");
                break; // After Condition True Break the loop Here..
            }

        }*/

        for (int b=1;b<=5;b++)
        {
             if( b==2)
            {
                System.out.println("Exit The Loop");
                continue; // After Condition True Skips part Here..
            }
             System.out.println(b);
            System.out.println("Java is Great.");

        }

        

    }
    
}

    

