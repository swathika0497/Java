package encapsulation;

public class Main {
    public static void main (String args[]){
        Animal a = new Animal();
////        a.type = "herbivore";
////        a.color = "black";   The reason why we are able to directly access the member variable is because of public
//        access specifier in the animal class for the member variable " color ".
//        Had color been set to private, the same would not have been possible
//        It is not good practice to let object access the member variable directly and that is where we make these
//        member variables as private which can only be changed by a public member function. This concept of restricting
//                the authority to change the data is called encapsulation
        System.out.println(a);
        a.setType("herbivore");
        a.setColor("black");
        System.out.println(a.getColor());
        System.out.println(a.getType());

        Animal b = new Animal();
      //  b.type="kdjbfwfbiufue"; // No Restriction ,  No Data sanity check
          b.setType("carnivore");
        /* This is possible because we have a public setter method which is invoked on the
        object b. Now, object(b) doesn't have the authority to access the private member variables directly   */
        b.setColor("white");
        System.out.println(b.getColor());
        System.out.println(b.getType());
      //  System.out.println(b.type);





    }

}
