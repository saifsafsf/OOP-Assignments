package product;

/**
 * declares appropriate methods & variables for Electronics
 * @author Saif Ullah
 */
public abstract class Electronics extends Product{
    
    // variable declared
    private String manufacturer;

    // parameterized constructor
    public Electronics(String manufacturer, double regularPrice) {
        
        // calling superclass constructor
        super(regularPrice);
        
        // variable initialized
        this.manufacturer = manufacturer;
    }

    // to get manufacturer name
    public String getManufacturer() {
        
        return manufacturer;
    }

    // to set manufacturer name
    public void setManufacturer(String manufacturer) {
        
        // variable initialized
        this.manufacturer = manufacturer;
    }
    
} // end of class Electronics
