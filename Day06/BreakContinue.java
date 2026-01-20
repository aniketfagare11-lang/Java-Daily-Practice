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

        for (int a=1;a<=5;a++)
        {
             if(a==2)
            {
                System.out.println("Exit The Loop");
                continue; // After Condition True Skips part Here..
            }
             System.out.println(a);
            System.out.println("Java is Great.");

        }

        

    }
    
}

    

