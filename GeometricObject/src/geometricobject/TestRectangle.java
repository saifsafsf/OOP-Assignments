/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject;
import java.util.Scanner;

/**
 * creates objects of rectangle & tests methods
 * @author Saif Ullah
 */
public class TestRectangle {

    /**
     * tests the capabilities of Rectangle subclass of Geometric superclass
     */
    public static void main(String[] args) {
        
        // variables used
        double width, height;
        String color, quit = "y";
        boolean filled;
        
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        while (quit.charAt(0) != 113) {

            // to retrieve width of rectangle
            System.out.print("Enter rectangle's width: ");
            width = input.nextDouble();

            // to retrieve height of rectangle
            System.out.print("Enter rectangle's height: ");
            height = input.nextDouble();

            // to retrieve color of rectangle
            System.out.print("Enter rectangle's color: ");
            color = input.next();

            // to retrieve color filling status
            System.out.print("Enter \"true/fasle\" whether rectangle is filled with color or not: ");
            filled = input.nextBoolean();

            // objects of class Rectangle
            Rectangle rect = new Rectangle(width, height, color, filled);

            // displaying output
            System.out.println("\nRecatngle created on " + rect.getDateCreated());
            System.out.printf("Rectangle's Area: %.2f\n", rect.getArea());
            System.out.printf("Rectangle's Perimeter: %.2f\n", rect.getPerimeter());
            System.out.printf("Rectangle's Color: %s\n", rect.getColor());
            System.out.printf("Rectangle filled with color: %b\n", rect.isFilled());
            
            // asking if user wants to continue
            System.out.print("\nEnter Q to quit or any other alphabet to continue: ");
            quit = input.next().toLowerCase();
            System.out.println();
            
        } // end of while loop
        
        // exiting message
        System.out.println("Program exited successfully.");

    } // end of main method
    
} // end of TestRectangle class
