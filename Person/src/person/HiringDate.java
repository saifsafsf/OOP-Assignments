package person;

/**
 * defines appropriate methods & attributes for a hiring date
 * @author Saif Ullah
 */
public class HiringDate {
    
    // variables used
    private int day, month, year;
    
    // no-arg constructor
    public HiringDate() {}
    
    // parameterized constructor
    public HiringDate(int day, int month, int year) {
        // variables initialized
        this.day = day;
        this.month = month;
        this.year = year;
    
    } // end of parameterized constructor

    // to retrieve Day of hiring
    public int getDay() {
        
        return day;
    
    } // end of getDay method

    // to retrieve month of hiring
    public int getMonth() {
        
        return month;
        
    } // end of getMonth method

    // to retrieve year of hiring
    public int getYear() {
        
        return year;
        
    } // end of getYear method

    @Override
    // string representation of HiringDate
    public String toString() {
        
        return "Hiring Date: " + day + "-" + month + "-" + year;
        
    } // end of toString method
    
} // end of classs Hiring Date
