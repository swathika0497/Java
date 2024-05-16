package accessSpecifierDemo;


import accessSpecifiers.AccessSpecifier;// this resolves the ambiguity for the compiler as to which exact class it has to refer based on the package name

public class Main2 extends AccessSpecifier {


    public static void main(String[] args) {
        Main2 m = new Main2();
        m.protectedDemo(); // Protected methods can be accessed outside the package only via Inheritance
        m.publicDemo(); // Public methods can be accessed anywhere
      //  m.defaultDemo() // Since it is a default method , it can never be accessed outside the package, even with Inheritance

    }
}
