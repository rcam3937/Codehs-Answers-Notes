//Student.java
//--------------

public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gradeAverage;
    private double gpa;
    // Add GPA instance variable called gpa here.
    
    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor and how to add the gpa to the constructor. 
     */
    public Student(String fName, String lName, int grade, double gpa1)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpa = gpa1;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + gpa;
    }
}

//SudentTester.java
//------------------

public class StudentTester
{
    public static void main(String[] args)
    {
    Student alan = new Student("Alan", "Turing", 11, 3.5);
    Student ada = new Student("Ada", "Lovelace", 12, 3.8);
        
    System.out.print(alan);
    System.out.print(ada);    

}

}