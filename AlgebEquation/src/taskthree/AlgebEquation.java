/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskthree;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Saif Ullah
 */
public class AlgebEquation {

    /**
     * Solves a certain equation
     */
    public static void main(String[] args) {
        // Object of the class "Scanner"
        Scanner input = new Scanner( System.in );
        
        // Variables used
        double num, result, powFour, powThree, powTwo;
        
        // Taking input
        System.out.print("Enter value of x: ");
        num = input.nextDouble();
        
        // Storing powers of input number
        powFour = Math.pow(num, 4.0);
        powThree = Math.pow(num, 3.0);
        powTwo = Math.pow(num, 2.0);
        
        // final result
        result = (powFour*12.3) - (9.1*powThree) + (19.3*powTwo) - (4.6*num) + 34.2;
        
        //Displaying output
        System.out.printf("12.3*x^4 - 9.1*x^3 + 19.3*x^2 - 4.6*x + 34.2 = %.3f\n", result);
        
    } // end of main method
    
} // end of class "AlgebEquation"
