package abstraction.interfaceConcept;

public class Main {
    public static void main(String[] args) {
        RBI obj = BankObjectFactory.getBankObject("bob");
        obj.bank();
        obj.getRateOfInterest();
        obj.getHeadQuarterLocation();


        RBI obj1 = BankObjectFactory.getBankObject("sbi");
        obj1.bank();
        obj1.getRateOfInterest();
        obj1.getHeadQuarterLocation();
    }
}
