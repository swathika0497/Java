package polymorphism;


public class RuntimePolymorphism {
    public static void main(String args[]) {

        //  Classic example of Run time Polymorphism
        // Inheritance is needed for run time polymorphism



        Dog d = new Dog();
        d.eat(); // Will call the eat() of the Dog class since the reference type and the object assigned both
        // are of the type Dog
        d.bark();




        Animal a = new Animal();
        a.eat(); // Will call the eat method of the Animal class since the reference type and the object assigned
        // are both of the type Animal




        Animal d1;


        //Dog d2 = new Animal();  Trying to create an obj with the reference of the child class but assigning the obj of the parent class
        //which is not allowed in java



        d1= new Dog();
        d1.eat(); /* d1 is created with the reference of the base class but assigned the obj reference of the
        child class, classic example of run time polymorphism where a child class method overrides the
        parent class method also known as method overriding */


       // d1.bark(); // Compile time error since the bark() method is not present in the Animal Class and
        // the object d1 is created with the reference of the Type Animal;

        // Assume , method1 is implemented in both TypeRef1 and TypeRef2;
        // Assume , TypeRef2 is a child class extending TypeRef1


        // TypeRef1 obj = new TypeRef2();
        // obj.method1();

        // At the compile time, compiler will check if the method1() is present in the TypeRef1
        // If not , it throws the compile time error
        // If present , compile check passes
        // At run time , executor checks if the method1() is present in the TypeRef2
        // If present, the method1() implementation inside the TypeRef2 is executed





        d1= new Cat();
        d1.eat(); // Will call the eat method of Cat Class;
        // Child class method overriden the parent class method
        // classic example of Method Overriding OR run time polymorphism
        // because the decision to call the eat() method of the child class is taken at the run time






        d1= new Animal();
        d1.eat(); // Normal Invocation, not overriding here






    }


}
