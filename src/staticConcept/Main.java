package staticConcept;

public class Main {
    public static void main(String[] args) {
//        Counter c = new Counter();
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();



//        College c = new College(14235,"Swathika");
//        College c1 = new College(14236,"syed");
//        College c2 = new College(14237,"Ashish");
//        c.display();
//        College.change();
//        c1.display();
//        c2.display();

        StaticBlock s = new StaticBlock(12345,"Ashish");
        StaticBlock s1 = new StaticBlock(12346,"Swathika");
//        s.display();
//        s1.display();
        System.out.println(BaseClass.run);
        System.out.println(StaticBlock.run);




    }
}
