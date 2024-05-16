package polymorphism;

public class CompileTimePolymorphism {
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.eat("burger"); // eat method in the dog class is having 3 implementation with the same access specifier
        //same return type and same function name. only difference is in the number of parameters accepted
        // In Java, this is called as having 3 overloaded function of eat() and the concept is called as
        // method overloading or compile time polymorphism
        // Compile time polymorphism because, compiler knows at the compile time which specific
        // implementation of eat method it has to call based on the parameters passed
        // For compile time polymorphism inheritance is not needed
        d.eat("pasta",4);
    }


}
