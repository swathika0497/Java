package stringConcepts;

public class StringCompare {
    public static void main(String[] args) {
        String name = "Swathika";
        String name1 = "Swathika";
        String name2 = new String("Swathika");
        String name3 = "Ashish";
        String name4 = "SWATHIKA";
        String name5 = new String("Swathika");



        //Using equals() - Equals() method compares the content of the string, that is, it compares values of the Strings for equality
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name.equals(name4));
        System.out.println(name.equalsIgnoreCase(name4));

        //Using == operator - This compares references that is, the address i the heap memory rather than the content
        System.out.println(name2==name5);
        System.out.println(name==name1);

        //Using compareTo() - This method also compares the value rather than the references.
        // It returns 0 if the two strings are equal, 1 if string1>string2, -1 if string1<string2
        System.out.println(name.compareTo(name1));
        System.out.println(name.compareTo(name3));
        System.out.println(name3.compareTo(name));

        System.out.println(name.concat(name3));
        System.out.println(name+name3);




    }
}
