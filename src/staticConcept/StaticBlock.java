package staticConcept;

public class StaticBlock extends  BaseClass {


    // Static members cannot be overrriden beause they are completely detached entity from the object
    // So there is no concept of overriding there
    // The static members are called with the class reference
    // So ParentClass.M1() will call M1() of the parent class
    // ChildClass.M1() will call the M1() of the child class

    int rollNo;
    static String collegeName;
    static int run;

    String studentName;
    public StaticBlock(int rollNo, String studentName){
        System.out.println("This is a  child constructor");
        this.rollNo=rollNo;
        this.studentName=studentName;
    }
    static{ // This is a static block. This blocks get executed even before the constructor. This block gets executed only once. This block is used to initialize the static variable.
        System.out.println("This is a child class static block");
        collegeName="SKCT";
        run=20;
    }
    public void display(){ /*non static method can access a static variable but vice versa is not true. Eg : Here, display
                                                            can access collegeName */
        System.out.println(rollNo);
        System.out.println(studentName);
        System.out.println(collegeName);
        System.out.println(run);
    }

}
