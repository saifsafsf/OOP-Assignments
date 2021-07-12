/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
// Save as "Circle.java"
    // private instance variable, not accessible from outside this //class

    private double radius;
    private String color;
    static int noOfObjects;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        radius = 1.0;
        color = "red";
        noOfObjects++;
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        radius = r;
        color = "red";
        noOfObjects++;
    }
    
    // 3rd constructor with given radius & color
    public Circle (double r, String col) {
        radius = r;
        color = col;
        noOfObjects++;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }
    
    // A public method for retrieving the colors
    public String getColor() {
        return color;
    }
    
    // A public method for setting the radius
    public void setRadius(double rad) {
        radius = rad;
    }
    
    // a public method for setting color
    public void setColor(String col) {
        color = col;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
