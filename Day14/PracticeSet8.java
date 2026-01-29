package Day14;

//Question 1:use getSalary,getname,setname methods..
/*class Employee
{
    int Salary;
    String name;

   public int getsalary()
   {
      return Salary;
   }

   public String getname()
   {
     return name;
   }

   public void setname(String n)
   {
    name=n;
   }
}*/

//Question 2 : Create Cellphone class and methods..
/*class Cellphone
{
    public void  Ring()
    {
        System.out.println("Ringing...");
    }
    public void Vibrate()
    {
        System.out.println("Vibrating...");
    }

    public void callFriend()
    {
        System.out.println("Call Aniket!!");
    }
}*/

//Question 3:create a class Square with methods to print side ,claculating area ,perimeter..
/*class Square
{
    int side;

    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return side*4;
    }

}*/

//Question 4: create class rectangle with methods to print perimeter and area..
/*class rectangle
{
    int length;
    int width;

    public int area()
    {
        return length*width;
    }

    public int perimeter()
    {
        return 2*(length+width);
    }
}*/

//Question 5:Create a class TommyVecetti for Rockstar Games capable of hitting ,running,etc..
/*class TommyVecetti
{
    public void run()
    {
        System.out.println("Running from the enemy ");
    }
    public void hit()
    {
        System.out.println("Hitting the Enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the Enemy");
    }
}*/

//Question 6: To calculate area of a circle and circumference..
class Circle
{
    float r;
    float pi=3.1415f;

    public float area()
    {
        return pi*r*r;
    }

    public float circum()
    {
        return 2*pi*r;
    }

}


public class PracticeSet8 {
    public static void main(String[] args)
    {
       //Question 1:Use getsalary,getname,setname methods
        /*Employee rahul= new Employee();
        rahul.setname("Rahul Patil");
        rahul.Salary=80000;
        System.out.println(rahul.Salary);
        System.out.println(rahul.getname());*/

       //Question 2:
        /*Cellphone sam=new Cellphone();
        sam.Ring();
        sam.Vibrate();
        sam.callFriend();*/

      //Question 3:
      /*Square a=new Square();
      a.side=9;
      System.out.println("perimeter of a Square is " + a.perimeter());
      System.out.println("Area of a Square is " + a.area());*/

      //Question 4:
      /*rectangle b=new rectangle();
      b.length=9;
      b.width=5;
      System.out.println("Perimeter of a Rectangle is " + b.perimeter());
      System.out.println("Area o fa Rectangle is " + b.area());*/

      //Question 5:
      /*TommyVecetti tom = new TommyVecetti();
      tom.hit();
      tom.run();
      tom.fire();*/

      //Question 6:
      Circle a=new Circle();
      a.r=5.6f;
      System.out.println("The Area of a Circle is " + a.area());
      System.out.println("The Circumference of Circle is " + a.circum());

    }
    
}

