package Day15;


class MyEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setId()
    {
        id=1;
    }
    public int getId()
    {
        return id;
    }
}

public class AccessModifiers {
public static void main(String[] args) {
    MyEmployee aniket=new MyEmployee();

    aniket.setName("Aniket");
    System.out.println(aniket.getName());
}
}

    

