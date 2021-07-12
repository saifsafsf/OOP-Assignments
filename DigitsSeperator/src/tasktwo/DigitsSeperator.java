/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktwo;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Saif Ullah
 */
public class DigitsSeperator {

    /**
     * Returns digits of a number with spaces
     */
    public static void main(String[] args) {
        
        // Object of the class "Scanner"
        Scanner input;
        input = new Scanner( System.in );
        
        // Variables used
        String strNum;
        int intNum, counter;
        char digit;
        
        // Taking input
        System.out.print("Enter a 5 digit number: ");
        intNum = input.nextInt();
        
        // In case of negative input
        intNum = Math.abs(intNum);
        
        // for further process
        strNum = String.valueOf(intNum);
        
        // Invalid Case
        if ( strNum.length() != 5 )
            System.out.printf("\nInvalid Input... Only 5 digit numbers allowed.\n");
        
        // Displaying output
        else {
            for (counter = 0 ; counter < 5 ; counter++) {
                // Each digit stored in "digit"
                digit = strNum.charAt(counter);
                System.out.printf("%-4c", digit);
                
            } // end of for loop body
            System.out.println();
            
        } // end of else body
        input.close();
        
    } // end of main method
    
} // end of class "DigitsSeperator"
