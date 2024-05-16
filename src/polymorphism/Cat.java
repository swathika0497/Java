package polymorphism;

public class Cat extends Animal {
    public String breed;
    public String color;

    public void bark() {
        System.out.println("Dogs bark");
    }
    public void eat(){
        System.out.println("Cat eat rats");
    }
}
