package Day07;

public class ForEachloop {
    public static void main(String [] args)
    {
        int [] Marks = {90,79,77,56,44};

        System.out.println("Length of Array is :");
        System.out.println(Marks.length);
        System.out.println("Printing the Array Using Naive Way:");
        System.out.println(Marks[0]);
        System.out.println(Marks[1]);
        System.out.println(Marks[2]);
        System.out.println(Marks[3]);
        System.out.println(Marks[4]);
        
        
        // For Loop To Display the Array
        System.out.println("Printing Array Using For Loop:");
        for (int i=0;i<Marks.length;i++)
        {
            System.out.println(Marks[i]);
        }

        //Question -- Reverse the Array
        System.out.println("Printing an Array in reverse Order:");
        for (int a=Marks.length -1;a>=0;a--)
        {
            System.out.println(Marks[a]);
        }
        
        //Displaying the array using For-Each Loop
        System.out.println("Printing an Array Using For-Each Loop:");
        for  (int element:Marks)
        {
            System.out.println(element);
        }
    }
    
}

    

