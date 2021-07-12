/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 * Uses Rectangle.java to create rectangles
 * @author Saif Ullah
 */
public class TestRectangle {

    /**
     * Creates rectangles, displays their dimensions
     */
    public static void main(String[] args) {
        // objects rec1, rec2 of class Rectangle
        Rectangle rec1 = new Rectangle(4.0, 40.0), rec2 = new Rectangle(3.5, 35.9);
        
        // Rectangle 1 Dimensions
        System.out.printf("Rectangle 1:\nWidth: %.2f\nHeight: %.2f\n", rec1.width, rec1.height);
        
        // Rectangle 1 Area & Perimeter
        System.out.printf("Area: %.2f\n", rec1.getArea());
        System.out.printf("Perimeter: %.2f\n\n", rec1.getPerimeter());
        
        // Rectangle 2 Dimensions
        System.out.printf("Rectangle 2:\nWidth: %.2f\nHeight: %.2f\n", rec2.width, rec2.height);
        
        // Rectangle 2 Area & Perimeter
        System.out.printf("Area: %.2f\n", rec2.getArea());
        System.out.printf("Perimeter: %.2f\n\n", rec2.getPerimeter());
        
    } // end of mein method
    
} // end of TestRectangle class
