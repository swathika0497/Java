package abstraction.interfaceConcept;

public class BankObjectFactory {
    public static RBI getBankObject(String bankName){
        if(bankName=="bob"){
            return new BoB();
        }
        else if(bankName=="sbi"){
            return new Sbi();
        }
        return null;
    }
}
