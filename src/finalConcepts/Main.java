package finalConcepts;

public class Main {
    public static void main(String[] args) {
        Honda2 h = new Honda2();
        h.mileage(); // Final methods can be inherited but not overridden
        System.out.println(h.numberOfGears);
        System.out.println(Honda2.engineCC);

    }
}
