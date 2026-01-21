package Day07;

public class Array {
    public static void main (String [] args)
    {
        //There are 3 Ways to Decalare Array in Java

       // int [] marks= new int [5]; //Method 1st -- Declaration and Memory allocation In one Line..
        /*int [] marks;             // Method 2nd -- Declaration and Memory Allocation in seprate lines..
        marks=new int [5];
        marks[0] =100;
        marks[1] =90;
        marks[2] =85;
        marks[3] =80;
        marks[4] =75;
        System.out.println(marks[3]);*/

        int [] marks = {100,90,80,85,70}; // Method 3rd Declaration ,Memory Allocation and Initialize in One Line..
        System.out.println(marks[4]);
        


    }
    
}

    

