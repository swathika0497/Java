package superConcepts;

public class Dog extends Animal{
    String color = "brown";
    public Dog(){
        super(); //Super will call the parent class constructor but it will be added in each constructor automatically
                    // by the compiler even if you do not specify it
        System.out.println("Dog Constructor");
    }
    public void print(){
        System.out.println(super.color); //Super will always call the data member of the parent class.
        // It is used if parent class and child class have same fields. For eg ; color
        System.out.println(color);
    }
    public void eat(){
        System.out.println("Dogs eating");
    }
     public void work(){
        super.eat();  // Super keyword will directly/explicitly call the method of the parent class
        eat();
    }
}
