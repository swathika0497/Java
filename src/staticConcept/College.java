package staticConcept;

public class College {
    int rollNo;
    static String collegeName = "SKCT";
    String studentName;
    public College(int rollNo,String studentName){ //Constructor only initializes the data members which are part of the object.
        // Since Static data members are not part of the objects hence they are not initialized inside a constructor.
        // Not that u cant. But u should not
        this.rollNo=rollNo;
        this.studentName=studentName;
    }
    public void display(){ /*non static method can access a static variable but vice versa is not true. Eg : Here, display
                                                            can access collegeName */
        System.out.println(rollNo);
        System.out.println(studentName);
        System.out.println(collegeName);
    }
    public static void change(){
        collegeName="CMRIT";
//        rollNo=1423;   /* Non static members cannot be referenced from a static method */
    }
}
