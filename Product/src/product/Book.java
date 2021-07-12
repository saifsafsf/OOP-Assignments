package product;

/**
 * defines appropriate methods & variables for Book
 * @author Dar Computers
 */
public class Book extends Product{
    
    // variables declared
    private String publisher;
    private int yearPublished;

    // parameterized constructor
    public Book(double regularPrice, String publisher, int yearPublished) {
        
        // calling superclass constructor
        super(regularPrice);
        
        // variables initialized
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    // to get publisher's name
    public String getPublisher() {
        
        return publisher;
    }

    // to set publisher name
    public void setPublisher(String publisher) {
        
        // variable initialized
        this.publisher = publisher;
    }

    // to get publish year
    public int getYearPublished() {
        
        return yearPublished;
    }

    // to set publish year
    public void setYearPublished(int yearPublished) {
        
        // variable initialized
        this.yearPublished = yearPublished;
    }

    @Override
    // defined abstract method to compute sale price of Book
    public double computeSalePrice() {
        
        return this.getRegularPrice() * 0.5;
    }
    
} // end of class Book
