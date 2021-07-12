/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 * Creates Rectangles
 * @author Saif Ullah
 */
public class Rectangle {
    
    double width, height;
    
    /**
     * No Argument constructor to give default values
     */
    Rectangle () {
        width = 1.0;
        height = 1.0;
        
    } // end of no-arg constructor
    
    /**
     * Parameterized constructor to define the rectangle
     */
    Rectangle (double wid, double hei) {
        width = wid;
        height = hei;
        
    } // end of parameterized constructor
    
    /**
     * Takes width & height, returns area of rectangle
     */
    public double getArea() {
        return width * height;
        
    } // end of getArea method
    
    /**
     * Takes width & height, returns perimeter of rectangle
     */
    public double getPerimeter() {
        return 2.0 * ( width + height );
        
    } // end of getPerimeter
    
} // end of Rectangle class
