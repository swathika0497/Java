package staticConcept;

public class BaseClass {

    static int run =5;

    static{
        System.out.println("This is the parent class static block");
    }


  public BaseClass(){
      System.out.println("THis is the base class constructor");
  }
}
