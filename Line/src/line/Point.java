package line;

/**
 * defines appropriate methods & attributes for a point
 * @author Saif Ullah
 */
public class Point {

    private double x, y;

    // no-arg constructor
    public Point() {}
    
    // parameterized constructor
    public Point(double x, double y) {
        
        // variables initialized
        this.x = x;
        this.y = y;
    }

    // to retrieve value of x-coordinate
    public double getX() {
    
        return x;
    }

    // to retrieve value of y-coordinate
    public double getY() {
    
        return y;
    }

    @Override
    // string representation of a point
    public String toString() {
        
        return '{' + x + ", " + y + '}';
    }
    
} // end of Point class
