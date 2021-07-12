/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // Variables used
        double num, max, min;
        
        // Taking number 1 input
        System.out.print("Enter number 1: ");
        num = input.nextDouble();
        
        // Defining max min variables
        max = num;
        min = num;
        
        for (int i = 0; i < 3; i++) {
            
            // taking remaining numbers
            System.out.printf("Enter number %d: ", i+2);
            num = input.nextDouble();
            
            // if bigger number found
            if (num > max)
                max = num;
            
            // if smaller number found
            if (num < min)
                min = num;
            
        } // end of for loop
        
        // Displaying output
        System.out.printf("\nMinimum Number: %.1f\nMaximum Number: %.1f\n", min, max);
        
    } // end of main method
    
} // end of class MaxMin
