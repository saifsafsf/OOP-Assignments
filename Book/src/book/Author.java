package book;

/**
 * defines appropriate attributes & methods for an Author
 * @author Saif Ullah
 */
class Author {
    
    // variables used
    private String name, email;
    private char gender;
    
    // no-arg constructor
    public Author() {}
    
    // paramterized constructor
    public Author(String name, char gender, String email) {
        
        // variables initialized
        this.name = name;
        this.email = email;
        this.gender = gender;
        
    } // end of parameterized constructor

    // to retrieve name of author
    public String getName() {
        
        return name;
        
    } // end of getName method

     // to retrieve email of author
    public String getEmail() {
        
        return email;
        
    } // end of getEmail method

     // to retrieve gender of Author
    public char getGender() {
        
        return gender;
        
    } // end of getGender method
    
    // to retrieve string representation of Author
    @Override
    public String toString() {
        
        return "Author: " + name + ", Email: " + email + ", Gender: " + gender;
    
    } // end of toString method
    
} // end of Author class
