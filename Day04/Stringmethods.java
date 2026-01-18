package Day04;

public class Stringmethods {
    public static void main (String [] args)
    {
        String st="Aniket";
        int value = st.length();
        System.out.println(value);

        String lstring = st.toLowerCase();
        System.out.println(lstring);

        String ustring = st.toUpperCase();
        System.out.println(ustring);

        String nontrimstring="  Aniket   ";
        System.out.println(nontrimstring);

        String trimstring = nontrimstring.trim();
        System.out.println(trimstring);

        System.out.println(st.substring(1));
        System.out.println(st.substring(1,4));

        System.out.println(st.replace('e', 'i'));
        System.out.println(st.replace("ket","l"));

        System.out.println(st.startsWith("An"));
        System.out.println(st.startsWith("Ant"));

        System.out.println(st.endsWith("An"));
        System.out.println(st.endsWith("et"));

        System.out.println(st.charAt(3));

        System.out.println(st.indexOf("ke"));
        System.out.println(st.indexOf("t",4));

        System.out.println(st.lastIndexOf("e"));
        System.out.println(st.lastIndexOf("k",4));

        System.out.println(st.equals("Aniket"));
        System.out.println(st.equalsIgnoreCase("aNiKeT"));


    }
    
}

