package Day16;


class MyMainEmployee
{
    private int id ;
    private String name;

    // public MyMainEmployee()
    // {
    //     id =89;
    //     name="Aniket";
    // }

    public MyMainEmployee(String myName,int myId)
    {
        id =myId;
        name=myName;
    }
    public String getName() {return name;}
    public void setName(String n){ this.name=n;}
    public void setId(int i){this.id =i;}
    public int getId(){return id;}

}




public class Constructors {
    public static void main(String[] args)
    {
       MyMainEmployee aniket=new MyMainEmployee("Aniket",11);
       System.out.println(aniket.getId());
       System.out.println(aniket.getName()); 
    }
    
}
