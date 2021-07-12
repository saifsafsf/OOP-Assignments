/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject;
import java.util.Date;

/**
 * provides appropriate variables & methods for geometric objects
 * @author Saif Ullah
 */
public class GeometricObject {
    
    // variables used
    private String color;
    private boolean filled;
    private final Date dateCreated;
    
    /**
     * no-arg constructor
     */
    public GeometricObject() {
        color = "White";
        filled = false;
        dateCreated = new Date();
        
    } // end of no-arg constructor
    
    /**
     * 2 arg constructor
     */
    public GeometricObject(String color, boolean filled) {
        
        // Initializing the variables
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
        
    } // end of 2 arg constructor
    
    /**
     * to set color of object
     */
    public void setColor(String color) {
        
        // variable initialized
        this.color = color;
        
    } // end of setColor method
    
    /**
     * to retrieve color of object
     */
    public String getColor() {
        
        return color;
        
    } // end of getColor method
    
    /**
     * to set color filling status
     */
    public void setFilled(boolean filled) {
        
        // initializing variable
        this.filled = filled;
        
    } // end of setFilled method
    
    /**
     * to retrieve color filling status
     */
    public boolean isFilled() {
        
        return filled;
        
    } // end of isFilled method
    
    /**
     * to retrieve date when object was created
     */
    public Date getDateCreated() {
        
        return dateCreated;
        
    } // end of getDateCreated method
    
} // end of GeometricObject class
