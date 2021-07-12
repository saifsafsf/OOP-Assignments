package person;

/**
 * defines appropriate methods & attributes for a faculty member
 * @author Saif Ullah
 */
public class Faculty extends Person{
    
    // variables used
    private int officeNumber;
    private HiringDate hiringDate;
    private JobDescription jobDescription;

    // no-arg constructor
    public Faculty() {}

    // parameterized constructor
    public Faculty(int officeNumber, HiringDate hiringDate, JobDescription jobDescription, 
            String name, String cnic, String email, String contactNo) {
        // calling superclass constructor
        super(name, cnic, email, contactNo);
        
        // variable initialized
        this.officeNumber = officeNumber;
        this.jobDescription = jobDescription;
        this.hiringDate = hiringDate;
        
    } // end of parameterized constructor

    // to retrieve office no. of faculty member
    public int getOfficeNumber() {
        
        return officeNumber;
        
    } // end of getOfficeNumber

    // to retreive Hiring Date of faculty
    public HiringDate getHiringDate() {
        
        return hiringDate;
    
    } // end of getHiringDate method

    // to retrieve Job Description of faculty
    public JobDescription getJobDescription() {
        
        return jobDescription;
    
    } // end of getJobDescription method
    
    @Override
    // String representation of Faculty
    public String toString() {
        
        return "Faculty: " + this.getName() + "\nOffice No.: " + officeNumber + 
                "\nE-mail: " + this.getEmail() + "\n" + hiringDate +
                "\n" + jobDescription + "\n";
    
    } // end of toString method
    
} // end of class Faculty
