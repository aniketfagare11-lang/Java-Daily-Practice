package Day11;
import java.util.Scanner;

public class PracticeSet4
 {
    public static void main(String[] args)
    {
       //Question 1 : find the output of the following program..
       int a =10;
       if (a==11)
       {
        System.out.println("I am 11"); 
       }
       else 
       {
        System.out.println("I am not 11");
       }

       //Question 2:Find out wheather student pass or  fail..
       Scanner sc= new Scanner (System.in);
       System.out.println("Enter Subject 1 marks:");
       int sub1=sc.nextInt();
       System.out.println("Enter Subject 2 marks:");
       int sub2=sc.nextInt();
       System.out.println("Enter Subject 3 marks:");
       int sub3=sc.nextInt();
       int totalmarks=300;

       float percentage=((sub1+sub2+sub3)*100f)/300;
       System.out.println("Percentage in Exam:"+ percentage );
       if (percentage <=32 )
       {
        System.out.println("Your Percetage is below 33 so your Fail in Exam..");
       }
       else
       {
        System.out.println("Congratulations!! You are Pass in Exam");
       }

       //Question 3:calculate income tax to paid by an employee to the goverment as per the states
       System.out.println("Enter Your Income:");
       float income=sc.nextFloat();
       float tax;
       if (income<=250000)
       {
         System.out.println("Your Income Less than 2.5 lakhs.so you doesn't have any tax..");
       }
       else if (income<=500000)
       {
         tax=(income/100)*5;
         System.out.println("Tax on your given Income is :" + tax);
       }
       else if (income<=1000000)
       {
         tax=(income/100)*20;
         System.out.println("Tax on your given Income is :" + tax);
       }
       else 
       {
         tax=(income/100)*30;
         System.out.println("Tax on your given Income is : " + tax);
       }

       // Question 4:Find out the  days of week... using Switch case statments 
       System.out.println("Enter a Number between(1-7) to print day:");
       int day =sc.nextInt();
       switch (day)
       {
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;
         default:
            System.out.println("Sunday");
            break;
      }

      //Question 5:To find the given year is Leap or not...
      System.out.println("Enter Year:");
      int year=sc.nextInt();
      
      if (year%4==0)
      {
         System.out.println("The given Year is Leap year..");
      }
      else 
      {
         System.out.println("The given Year is Not a Leap year..");
      }

      //Question 6:To find the type of website for the url..
      System.out.println("Enter Website:");
      String website =sc.next();
      if(website.endsWith(".org"))
      {
         System.out.println("It is an Orgnizational website.");
      }
      else if(website.endsWith(".com"))
      {
         System.out.println("It is a Commercial website.");
      }
      else if(website.endsWith(".in"))
      {
         System.out.println("It is an Indian website.");
      }
    }
    
}

    

