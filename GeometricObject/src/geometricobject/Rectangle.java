/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject;

/**
 * defines the variables & methods for Rectangle class
 * @author Saif Ullah
 */
public class Rectangle extends GeometricObject {
    
    // variables used
    private double width, height;
    
    /**
     * no-arg constructor
     */
    public Rectangle() {
        
        // Initializing variables
        width = 1.0;
        height = 1.0;
        
    } // end of no-arg constructor
    
    /**
     * 2-arg constructor
     */
    public Rectangle(double width, double height) {
        
        // initializing variables
        this.width = width;
        this.height = height;
        
    } // end of 2-arg constructor
    
    /**
     * 4-arg constructor
     */
    public Rectangle(double width, double height, String color, boolean filled) {
        
        // passing paarmeters to superclass constructor
        super(color, filled);
        
        // initializing variabes
        this.width = width;
        this.height = height;
        
    } // end of 4-arg constructor
    
    /**
     * to set width of Rectangle
     */
    public void setWidth(double width) {
        
        // initializing variabe
        this.width = width;
        
    } // end of setWidth method
    
    /**
     * to retrieve width of Rectangle
     */
    public double getWidth() {
        
        return width;
        
    } // end of getWidth method
    
    /**
     * to set height of Rectangle
     */
    public void setHeight(double height) {
        
        // initializing variabe
        this.height = height;
        
    } // end of setHeight method
    
    /**
     * to retrieve height of Rectangle
     */
    public double getHeight() {
        
        return height;
        
    } // end of getHeight method
    
    /**
     * to retrieve area of Rectangle
     */
    public double getArea() {
        
        return width * height;
        
    } // end of getArea method
    
    /**
     * to retrieve perimeter of Rectangle
     */
    public double getPerimeter() {
        
        return 2.0 * ( width + height );
        
    } // end of getPerimeter method
    
    /**
     * to retrieve string representation of Rectangle
     */
    @Override
    public String toString() {
        
        return "Rectangle: width = " + width + " height = " + height;
        
    } // end of toString method
    
} // end of Rectangle class
