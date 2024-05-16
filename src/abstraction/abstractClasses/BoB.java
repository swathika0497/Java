package abstraction.abstractClasses;

public class BoB extends RBI {

    public BoB(){
        System.out.println("BOB Constructor");
    }
    @Override
    public void getRateOfInterest() {

        System.out.println("Rate of Interest of Bank Of Baroda is 7.5 %");
    }
}
