package Day14;

class Employee
{
    int  id;
    int Salary;
    String name;
    
    public void printDetails()
    {
        System.out.println("My id is "+ id);
        System.out.println("And My Name is "+ name);
        System.out.println("Salary:"+ Salary);
    }
    public int getSalary()
    {
        return Salary;
    }

}



public class CustomClass {
    public static void main(String[] args) 
    {
        System.out.println("This is our Custom class");
        Employee aniket =new Employee();//Instantiating a New Employee Object
        Employee abhi=new Employee();
        
        //setting Attributes for Aniket
        aniket.id=12;
        aniket.name="Aniket Fagare";
        aniket.Salary=80000;

        //setting Attributes for Abhi
        abhi.id=01;
        abhi.name="Abhi Fagare";
        abhi.Salary=90000;

        aniket.printDetails();
        abhi.printDetails();

        //printing The Attributes
        //System.out.println(aniket.id);
        //System.out.println(aniket.name);


    }
    
}

    

