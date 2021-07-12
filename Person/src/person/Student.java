package person;

/**
 * defines appropriate methods & attributes for a student
 * @author Saif Ullah
 */
public class Student extends Person{
    
    //variables used
    private String batch, regNumber;

    // no-arg constructor
    public Student() {}

    // parameterized constructor
    public Student(String name, String cnic, String email, String contactNo, 
            String batch, String regNumber) {
        
        // calling superclass constructor
        super(name, cnic, email, contactNo);
        
        // varibales initialized
        this.batch = batch;
        this.regNumber = regNumber;
        
    } // end of parameterized constructor

    // to retrieve batch of a student
    public String getBatch() {
        
        return batch;
        
    } // end of getBatch method

    // to retrieve reg. no. of student
    public String getRegNumber() {
        
        return regNumber;
        
    } // end of getRegNumber method
    
    @Override
    // string representation of Student
    public String toString() {
        
        return "Student: " + this.getName() + "\nBatch: " + batch + "\nReg. No: " + 
                regNumber + "\nContact No.: " + this.getContactNo() + "\n";
        
    } // end of toString method
    
} // end of class Student
