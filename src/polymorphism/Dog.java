package polymorphism;

public class Dog extends Animal {
    public String breed;
    public String color;

    public void bark() {
        System.out.println("Dogs bark");
    }
    public void eat(){
        System.out.println("Dogs eat bones");
    }
    public void eat(String food){
        System.out.println("Dog eats " +food);
    }
    public void eat(String food, int count){
        System.out.println("Dog eats " +count+" " +food);
    }
}
