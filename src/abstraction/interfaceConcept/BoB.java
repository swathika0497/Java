package abstraction.interfaceConcept;

public class BoB implements RBI{
    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of Interest of Bank Of Baroda is 7.5 %");
    }

    @Override
    public void bank() {
        System.out.println("This is Bob Bank");

    }

    @Override
    public void getHeadQuarterLocation() {
        System.out.println("Chennai");
    }
}
