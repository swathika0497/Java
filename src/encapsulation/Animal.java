package encapsulation;

public class Animal {
    private String type;
    private String color;
    public void setType(String type){ // Setter Method
        if(type=="herbivore" || type == "carnivore") // Because we have restricted of assigning the value to the member variable
            // via this setters method, we can utilize this method to have any data sanity that we want
                 this.type=type;
        else
            System.out.println("Cant assign Value");
            }
     public void setColor(String color){
        this.color=color;
     }
   public String getType(){
        return type;
   }
    public String getColor(){
        return color;
    }
}
