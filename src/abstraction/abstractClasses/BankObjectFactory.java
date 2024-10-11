package abstraction.abstractClasses;

public class BankObjectFactory {
    public static SBI getSBIObject() {
        return new SBI();
    }

    public static BoB getBoBObject() {

        return new BoB();
    }

    // How can a single method have two classes in the return type ?
    // THe answer lies in making the returntype as Parent class
    // Class is a data type , just like int and String
    // Only difference is int is a primitive data type which is created by Java
    // Class is a user defined data type which we create


    //creating a method with return type as class. we do not need to inherit the class for creating a method with class data type

    public static RBI getBankObject(String bankName){

        if(bankName=="bob"){
            return new BoB();
        }

        else if( bankName =="sbi")
                return new SBI();

        return null;
    }

}
