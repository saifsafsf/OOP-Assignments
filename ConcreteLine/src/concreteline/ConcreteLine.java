package concreteline;

/**
 * extends AbstractLine, overrides methods defining properties of a line
 * @author Saif Ullah
 */
public class ConcreteLine extends AbstractLine{

    private double x1, y1, x2, y2;

    // no-arg constructor
    public ConcreteLine() {}

    // parameterized constructor
    public ConcreteLine(double x1, double y1, double x2, double y2) {
        // variables initialized
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    // string representation of line
    public String toString() {
        
        return '{' + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")\n";
    }

    // to retrieve x-coordinate of point 1
    public double getX1() {

        return x1;
    }

    // to retrieve y-coordinate of point 1
    public double getY1() {
        
        return y1;
    }

    // to retrieve x-coordinate of point 2
    public double getX2() {
        
        return x2;
    }

    // to retrieve y-coordinate of point 2
    public double getY2() {
        
        return y2;
    }
    
    @Override
    // to retrieve length of line
    public double getLength() {
        
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2.0));
    }
    
    // overriding method in AbstractLine
    @Override
    public boolean isEqual(Object a, Object b) {
        
        // objects downcasted to ConcreteLine
        ConcreteLine l1 = (ConcreteLine) a;
        ConcreteLine l2 = (ConcreteLine) b;
        
        // comparing lengths of both lines
        return l1.getLength() == l2.getLength();
    }
    
    // overriding method in AbstractLine
    @Override
    public boolean isGreater(Object a, Object b) {
        
        // objects downcasted to ConcreteLine
        ConcreteLine l1 = (ConcreteLine) a;
        ConcreteLine l2 = (ConcreteLine) b;
        
        // comapring lengths of both lines
        return l1.getLength() > l2.getLength();
    }
    
    // overriding method in AbstractLine
    @Override
    public boolean isLess(Object a, Object b) {
        
        // objects downcasted to ConcreteLine
        ConcreteLine l1 = (ConcreteLine) a;
        ConcreteLine l2 = (ConcreteLine) b;
        
        // comparing lengths of both lines
        return l1.getLength() < l2.getLength();
    }
    
} // end of class ConcreteLine
