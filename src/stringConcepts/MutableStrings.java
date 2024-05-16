package stringConcepts;

public class MutableStrings {
    public static void main(String[] args) {
        // To create a mutable string
//        String s="Swathika";
//        s=s.concat("Ganapathy");
//        System.out.println(s);
        StringBuffer s1=new StringBuffer("Swathika"); //If  you want to create a mutable string, then we use
        // StringBuilder class. The values that are stored in StringBuilder object can be updated or changed
        s1.append(" Ganapathy");
        System.out.println(s1.toString());
//        System.out.println(s1.insert(1,"Ashish"));
        System.out.println(s1.replace(1,4,"Ashish"));
        System.out.println(s1.delete(1,4));
        System.out.println(s1.reverse());

    }
}
