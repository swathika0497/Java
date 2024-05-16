package superConcepts;

public class Employee extends Person{
    float salary;
    public Employee(int id,String name,float salary){
        super(name,id); // Makes the call to the parent class constructor to initialize the variables present in the parent class
        this.salary=salary;

    }
}
