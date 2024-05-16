package inheritance;

public class Main {
    public static void main (String args[]){
        Dog d = new Dog();
        d.bark();
        d.eat(); /*object of the dog class is able to access eat() even though it is not defined in the dog class
                   because dog is inherited from animal */
      //  d.bite(); the bite method is a private method in the base class and the private methods are not accessible
        //            in the child class
    }
}
