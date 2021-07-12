package concreteline;

/**
 * Tests the capabilities of class ConcreteLine
 * @author Saif Ullah
 */
public class TestLine {

    /**
     * creates objects of ConcreteLine, displays its methods' results.
     */
    public static void main(String[] args) {
        
        // objects of ConcreteLine
        ConcreteLine line1 = new ConcreteLine(0, 0, 5, 5);
        ConcreteLine line2 = new ConcreteLine(2, 2, 8, 8);
        
        // testing isEqual method
        System.out.printf("Equal: %b\n", line1.isEqual(line1, line2));
        
        // testing isGreater method
        System.out.printf("Greater: %b\n", line1.isGreater(line2, line1));
        
        // testing isLess method
        System.out.printf("Lesser: %b\n", line1.isLess(line2, line1));
        
        // testing getLength method
        System.out.printf("Line 1 length: %.2f\n", line1.getLength());
        
    } // end of main method
    
} // end of class TestLine
