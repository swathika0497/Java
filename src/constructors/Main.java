package constructors;

public class Main {
    public static void main (String args[]){
        College student1 = new College();
        College student2 = new College();

        student1.collegeName= "SKCT";
        student1.branchName="IT";
        student1.collegeCity="Coimbatore";
        student1.studentName = "Swathika";
        student1.rollNo=14235;

        student2.collegeName= "SKCT";
        student2.branchName="CSE";
        student2.collegeCity="Coimbatore";
        student2.studentName="Syed";
        student2.rollNo=14236;

 // The attribute collegeName and collegeCity will be common and same to each and every object created
        // Initializing these 2 attributes for every obj at the time of obj creation is both time taking and inefficient
        // Hence we need a method which would initialize these attributes automatically at the time of obj creation
        // This method should be such that it should be called automatically without specific need to call it
        // This is the textbook definition of Constructors.

        System.out.println(student1.collegeName);
        System.out.println(student1.branchName);
        System.out.println(student1.collegeCity);
        System.out.println(student1.studentName);
        System.out.println(student1.rollNo);
        System.out.println();

        System.out.println("Printing student2 details ");
        System.out.println(student2.collegeName);
        System.out.println(student2.branchName);
        System.out.println(student2.collegeCity);
        System.out.println(student2.studentName);
        System.out.println(student2.rollNo);

        // This is after the creation of the constructor in the college class
        College student3 = new College();

        student3.branchName="CSE";
        student3.studentName="Selva";
        student3.rollNo=14237;

        System.out.println("Printing student3 details ");
        System.out.println(student3.collegeName);
        System.out.println(student3.branchName);
        System.out.println(student3.collegeCity);
        System.out.println(student3.studentName);
        System.out.println(student3.rollNo);
        student3.collegeCity="Madhupur"; // We can change the value even after asssinging it default value
        System.out.println(student3.collegeCity);

        College student4 = new College("CMRIT","Bangalore");
        student4.branchName="IT";
        student4.studentName="Ashish";
        student4.rollNo=14210;

        System.out.println("Printing student4 details ");
        System.out.println(student4.collegeName);
        System.out.println(student4.branchName);
        System.out.println(student4.collegeCity);
        System.out.println(student4.studentName);
        System.out.println(student4.rollNo);

    }
}
