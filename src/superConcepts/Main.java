package superConcepts;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
//        Animal d1 = new Dog();
//        d1.eat();
        d.work();
        Person p = new Person("Swathy",32);
        Employee e = new Employee(98,"Ashish",98000);
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.salary);

    }
}
