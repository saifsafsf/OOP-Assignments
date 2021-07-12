package person;

/**
 * defines appropriate methods & attributes for a job description
 * @author Saif Ullah
 */
public class JobDescription {
    
    // variables used
    private String designation, teachingLoad;
    private long salary;
    
    // no-arg constructor
    public JobDescription() {}
    
    // parameterzied constructor
    public JobDescription(String designation, String teachingLoad, int salary) {
        
        // variables initailized
        this.designation = designation;
        this.teachingLoad = teachingLoad;
        this.salary = salary;
        
    } // end of parameterized constructor

    // to retrieve designation from job description
    public String getDesignation() {
        
        return designation;
        
    } // end of getDesignation method

    // to retrieve Teaching Load from job description
    public String getTeachingLoad() {
        
        return teachingLoad;
        
    } // end of getteachingLoad method

    // to retrieve Salary from Job Description
    public long getSalary() {
        
        return salary;
        
    } // end of getSalary method
    
    @Override
    // String representation of JobDeescription
    public String toString() {
        
        return "Designation: " + designation + "\nTeaching Load: " + teachingLoad
                + "\nSalary: $" + salary;
    
    }// end of toString method
    
    
} // end of JobDescription
