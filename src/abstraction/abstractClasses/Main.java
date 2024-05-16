package abstraction.abstractClasses;

public class Main {
    public static void main(String args[]){
//        Shape r = new Rectangle();
//        r.draw();
//        Shape s = new Square();
//        s.draw();

//         Rectangle obj  =ObjectFactory.getRectangleObject();
//         Square obj1 = ObjectFactory.getSquareObject();


        RBI obj = BankObjectFactory.getBankObject("bob");
        obj.getRateOfInterest(); // Calls the method of bob Class
        obj.bank();

        RBI obj1 = BankObjectFactory.getBankObject("sbi");
        obj1.getRateOfInterest(); // Calls the method of sbi Class
        obj1.bank();
        // The internal implementation is hidden from user.
        // The object creation or the logic used to create the object is also hidden from user.
        // THat logic is present in the BankObjectFactory class.
        // User just has to pass tha input parameter as sbi


    }


}
