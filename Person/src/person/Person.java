package person;

/**
 * defines appropriate methods & attributes for a person
 * @author Saif Ullah
 */
public class Person {

    // variables used
    private String name, cnic, email, contactNo;

    // no-arg constructor
    public Person() {}

    // parameterized constructor
    public Person(String name, String cnic, String email, String contactNo) {
        
        // variables initialized
        this.name = name;
        this.cnic = cnic;
        this.email = email;
        this.contactNo = contactNo;
        
    } // end of parameterized constructor

    // getter method of name
    public String getName() {
        
        return name;
    
    } // end of getName method

    // getter method of cnic
    public String getCnic() {
        
        return cnic;
    
    } // end of getCnic method

    // getter method of email
    public String getEmail() {
        
        return email;
    
    } // end of getEmail method

    // getter method of contact no.
    public String getContactNo() {
        
        return contactNo;
    
    } // end of getContactNo

    @Override
    // to retrieve string representation of Person
    public String toString() {
        
        return "Person: " + name + "\nCNIC: " + cnic + "\nE-mail: " + email + 
                "\nContact No: " + contactNo + "\n";
    
    } // end of toString method
    
} // end of Person class
