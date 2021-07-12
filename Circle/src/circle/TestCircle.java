/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Dar Computers
 */
public class TestCircle {

// Save as "TestCircle.java"
    public static void main(String[] args) {

        // object c1 of the class Cilcle
        Circle c1 = new Circle();
        
        // Setting the c1's color
        c1.setColor("White");
        
        // retrieving values and displaying them
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and " + c1.getColor() + " color");

        // object c2 of the class Circle
        Circle c2 = new Circle(2.0);
        
        // retrieving values and displaying them
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        
        // object c3 of class Circle
        Circle c3 = new Circle(3.0, "Black");
        
        // setting a different value of radius
        c3.setRadius(9.0);
        
        // retrieving values and displaying them
        System.out.println("The circle has radius of " 
                + c3.getRadius() + " and " + c3.getColor() + " color");
        
        // defining two more objects of class Circle
        Circle c4 = new Circle(4.0, "Gray");
        Circle c5 = new Circle(5.0, "Purple");
        
        // Number of objects displayed
        System.out.printf("Circles made: %d\n", Circle.noOfObjects);
        
    } // end of main method
} // end of class TestCircle
