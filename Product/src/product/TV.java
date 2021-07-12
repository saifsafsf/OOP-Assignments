package product;

/**
 *
 * @author Saif Ullah
 */
public class TV extends Electronics{
    
    // variable declared
    private int size;

    // parameterized constructor
    public TV(double regularPrice, String manufacturer, int size) {
        
        // calling superclass constructor
        super(manufacturer, regularPrice);
        
        // variable initialized
        this.size = size;
    }

    @Override
    // defined abstract method to compute sale price of TV
    public double computeSalePrice() {
        
        return this.getRegularPrice() * 0.8;
    }
    
} // end of class TV
