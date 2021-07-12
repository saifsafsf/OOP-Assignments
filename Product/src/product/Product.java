package product;

/**
 * declares appropriate methods & variables for Product
 * @author Saif Ullah
 */
public abstract class Product {

    private double regularPrice;

    // parameterized constructor
    public Product(double regularPrice) {
        
        // variable initialized
        this.regularPrice = regularPrice;
    }

    // to get regularprice of Product
    public double getRegularPrice() {
        
        return regularPrice;
    }

    // to set regular price of Product
    public void setRegularPrice(double regularPrice) {
        
        this.regularPrice = regularPrice;
    }
    
    // sale price to be implemented by subclasses
    public abstract double computeSalePrice();
    
} // end of class Product
