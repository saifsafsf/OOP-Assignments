package line;

/**
 * defines appropriate methods & attributes for a Line
 * @author Saif Ullah
 */
public class Line {

    private Point p1, p2;

    // no-arg constructor
    public Line() {}

    // paramterized constructor
    public Line(Point p1, Point p2) {
        
        // variables initialized
        this.p1 = p1;
        this.p2 = p2;
    }

    // to retrieve point 1
    public Point getP1() {
        
        return p1;
    }

    // to retrieve point 2
    public Point getP2() {
        
        return p2;
    }

    @Override
    // string representation of a line
    public String toString() {
        
        return p1 + " to " + p2 + '\n';
    }
    
    // to retrieve length of line
    public double getLength() {
        
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + 
                Math.pow((p1.getY() - p2.getY()), 2.0));
    }
    
    // to find if lines are equal
    public boolean equals(Line l) {
        
        // comparing lengths of both lines
        return this.getLength() == l.getLength();
    }
    
    // returns true if invoking lne is greater than argument line
    public boolean isGreater(Line l) {
        
        // comapring lengths of both lines
        return this.getLength() > l.getLength();
    }
    
    // returns true if invoking lne is lesser than argument line
    public boolean isLess(Line l) {
        
        // comparing lengths of both lines
        return this.getLength() < l.getLength();
    }
    
    // to find if lines 
    
} // end of Line class
