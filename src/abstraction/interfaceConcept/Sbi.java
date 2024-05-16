package abstraction.interfaceConcept;

public class Sbi implements RBI{
    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of Interest of SBI is 5.5 %");

    }
    @Override
    public void bank() {
        System.out.println("This is SBI Bank");
    }
    @Override
    public void getHeadQuarterLocation() {
        System.out.println("Delhi");
    }
}
