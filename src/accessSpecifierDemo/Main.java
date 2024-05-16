package accessSpecifierDemo;

import accessSpecifiers.AccessSpecifier; // Import packagename.classname; - It is this statement which is letting us create
// an object of the AccessSpecifier

public class Main {

    public static void main(String[] args) {
        AccessSpecifier b = new AccessSpecifier(); //Able to create an object of AccessSpecifier class in another
        // package (AccessSpecifierDemo) because AccessSpecifier class is a public class
        b.publicDemo(); //Public method is the only method which can be accessed from another package

    }
}
