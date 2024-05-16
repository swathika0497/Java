package accessSpecifiers;

public class Main {
    public static void main(String[] args) {
        AccessSpecifier a = new AccessSpecifier();
        a.defaultDemo(); // This is a default access specifier which means, it can accessed in the same class or in
                            // other classes which belongs to the same package

      //  a.privateDemo(); // This will never be possible because privateDemo is a private method to the AccessSpecifier class.

        a.protectedDemo();//  This is a protected access specifier which means, it can accessed in the same class / other class inside package
        // OR in another class belonging to other apckage but only if inheritance is there

    }
}
