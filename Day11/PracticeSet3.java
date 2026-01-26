package Day11;

public class PracticeSet3 {
    public static void main(String [] args)
    {
        // Question 1:Convert a  string into lowercasse..
        String st ="HELLO";
        String a=st.toLowerCase();
        System.out.println(a);

        //Question 2:replace replace Spaces with underscores..
        String b="To My Friend";
        System.out.println(b.replace(" ", "_"));

        //Question 3:replace name with Aniket...
        String letter  ="Dear <|name|>,Thanks a lot";
        letter= letter.replace("<|name|>","Aniket");
        System.out.println(letter);

        //Question 4:detect Double and triple spaces in string..
        String mystring="my   name  aniket";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Question 5:Use escape sequences to format a letter..
        String letter2="Dear Harry,\n\tThis Java Course is nice.\n\tThanks!!";
        System.out.println(letter2);

    }
}

    

