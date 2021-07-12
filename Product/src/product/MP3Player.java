package product;

/**
 * defines appropriate methods & variables for MP3Player
 * @author Saif Ullah
 */
public class MP3Player extends Electronics{
    
    // variables declared
    private String color;

    // parameterized constructor
    public MP3Player(double regularPrice, String manufacturer, String color) {
        
        // calling superclass conctructor
        super(manufacturer, regularPrice);
        
        // variable initialized
        this.color = color;
    }

    // to get color of MP3Player
    public String getColor() {
        
        return color;
    }

    // to set color of MP3Player
    public void setColor(String color) {
        
        // variable initialized
        this.color = color;
    }

    @Override
    // defined abstract method to compute sale price of MP3Player
    public double computeSalePrice() {
        
        return this.getRegularPrice() * 0.9;
    }
    
} // end of class MP3Player
