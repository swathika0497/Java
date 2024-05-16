package abstraction.abstractClasses;

public abstract class RBI {
    public  abstract void getRateOfInterest(); // abstract method , no implmentation , the responsibility of the implementation lies with the child class

    public RBI(){

        System.out.println("RBI Constructor");
    }
    public void bank(){

        System.out.println("This is RBI Bank");
    }
}
