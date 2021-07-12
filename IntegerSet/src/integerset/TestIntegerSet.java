/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerset;
import java.util.Scanner;

/**
 * Tests the capabilities of class IntegerSet
 * @author Saif Ullah
 */
public class TestIntegerSet {

    /**
     * Creates 3 objects, tests different methods on them
     */
    public static void main(String[] args) {
        // object to get user-input
        Scanner input = new Scanner( System.in );
        
        // user-input variable
        double num;
        
        // union & intersection set variables
        boolean[] union;
        boolean[] intersection;
        
        // sets created by IntegerSet
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        
        // giving input to set1
        set1.insertElement(3);
        set1.insertElement(6);
        set1.insertElement(9);
        set1.insertElement(15);
        set1.insertElement(22);
        
        // creating a set to assign to set2
        boolean[] set11 = new boolean[101];
        set11[9] = true;
        set11[15] = true;
        set11[20] = true;
        set11[25] = true;
        
        // testing setter method for set2
        set2.setSet(set11);
        
        // display message
        System.out.println("Enter 4 elements of set C (between 0-100):\n");
        
        // taking input from user for set3
        for (int i = 0; i < 4; i++) {
            
            // taking user input
            System.out.printf("Enter element %d: ", i+1);
            num = input.nextDouble();
            
            // Integer Validation
            if( num % 1 == 0)
                // giving input to set3
                set3.insertElement((int) num);
            
            else {
                // asking again for input
                System.out.println("Invalid input... Integers only.");
                i--;
            
            } // end of else body
            
        } // end of for loop
        
        // displaying set A
        System.out.print("\nA = ");
        displaySet(set1.getSet());
        
        // displaying set B
        System.out.print("B = ");
        displaySet(set2.getSet());
        
        // displaying set C
        System.out.print("C = ");
        displaySet(set3.getSet());
        
        // deleting elements
        set1.deleteElement(3);
        set2.deleteElement(20);
        
        // dsiplaying after deletion
        System.out.println("\nAfter deleting 3 & 20 from Set A & Set B: ");
        
        // displaying set A
        System.out.print("A = ");
        displaySet(set1.getSet());
        
        // displaying set B
        System.out.print("B = ");
        displaySet(set2.getSet());
        
        // Testing union method
        union = IntegerSet.union(set1.getSet(), set2.getSet());
        
        // displaying set A U B
        System.out.print("\nA U B = ");
        displaySet(union);
        
        // Testing intersection method
        intersection = IntegerSet.intersection(set2.getSet(), set3.getSet());
        
        // displaying set B N C
        System.out.print("\nB N C = ");
        displaySet(intersection);
        
        // testing Equals method
        System.out.println("\nSet A equals Set C: " + set1.isEqualTo(set3.getSet()));
        
    } // end of main method
    
    /**
     * Displays boolean arrays in set form
     */
    public static void displaySet(boolean[] set) {
        
        // opening brace
        System.out.print("{ ");
        
        // finding the true values
        for (int i = 0; i < 101; i++) {
            
            if (set[i]) {
                // displaying if found
                System.out.printf("%d ", i);
            
            } // end of if body
            
        } // end of for loop
        
        // closing braces
        System.out.print("}\n");
        
    } // end of diaplaySet method
    
} // end of TestIntegerSet

