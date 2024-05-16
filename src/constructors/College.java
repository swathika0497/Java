package constructors;

public class College {
    public String collegeName;
    public String collegeCity;
    public String branchName;
    public String studentName;
    public int rollNo;

    // Default constructor because it does not take any parameters
    // Name of the method is same as the name of the class
    // Method does not have any return type not even void
    // It is used to initialize the values of the attributes
    // Even if u do not define explicitly a default constructor , Java creates one for u
    // defining the values of member variables with  default values


    public College(){
        // Inititializing the value here does not means we cannot change it later on
        System.out.println("Default constructor called");
        this.collegeName = "SKCT";
        this.collegeCity = "Coimbatore";
//        this.branchName="CSE";
//        this.studentName="Syed";
//        this.rollNo=14236;
    }

    public College(String collegeName,String collegeCity){
        System.out.println("Parameterized constructor called");
        this.collegeName=collegeName;
        this.collegeCity=collegeCity;
    }
}
