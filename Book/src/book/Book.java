package book;

/**
 * defines appropriate methods & attributes for a book
 * @author Saif Ullah
 */
public class Book {
    
    // variables used
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    // no-arg constructor
    public Book() {}
    
    // 3-param constructor
    public Book(String name, Author author, double price) {
        
        // ariables initialized
        this.name = name;
        this.author = author;
        this.price = price;
        
    } // end of 3-param constructor
    
    // 4-param constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        
        // variables initialized
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
        
    } // end of 4-param constructor
    
    // to retrieve Book name
    public String getName() {
        
        return name;
        
    } // end of getName method
    
    // to retrieve Author details
    public Author getAuthor() {
        
        return author;
    }
     // end of getAuthor method
    
    // to retrieve Book price
    public double getPrice() {
        
        return price;
        
    } // end of getPrice
    
    // to set price of Book
    public void setPrice(double price) {
        
        this.price = price;
        
    } // end of setPrice method

    // to retrieve quantity of a book
    public int getQtyInStock() {
        
        return qtyInStock;
        
    } // end of getQtyInStock
    
    // to set value of quantity of a book
    public void setQtyInStock(int qtyInStock) {
        
        this.qtyInStock = qtyInStock;
        
    } // end of setQtyInStock method

    @Override
    // String representation of Book
    public String toString() {
        
        // author.toString() used implicitly
        return "Book Name: " + name + "\n" + author
                + "\nPrice: $" + price + "\nQty In Stock: " + qtyInStock + " pcs\n";
    
    } // end of toString method
    
} // end of Book class
