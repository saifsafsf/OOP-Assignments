package line;

/**
 * Tests the capabilities of class Line
 * @author Saif Ullah
 */
public class TestLine {

    /**
     * creates objects of Line, tests its methods
     */
    public static void main(String[] args) {
        
        // objects of Points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(8, 8);
        
        // objects of Line
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        
        // testing getLength method
        System.out.printf("Line 2 length: %.2f\n", line2.getLength());
        
        // testing isLess method
        System.out.printf("Lesser: %b\n", line1.isLess(line2));
        
        // testing isGreater method
        System.out.printf("Greater: %b\n", line2.isGreater(line1));
        
        // testing equals method
        System.out.printf("Equal: %b\n", line1.equals(line2));
        
    } // end of main method
    
} // end of TestLine
