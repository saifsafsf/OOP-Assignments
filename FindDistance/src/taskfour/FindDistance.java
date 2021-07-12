/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfour;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Saif Ullah
 */
public class FindDistance {

    /**
     * Solves a certain equation
     */
    public static void main(String[] args) {
        // Object of the class "Scanner"
        Scanner input = new Scanner( System.in );
        
        // Variables used
        double s, t, tSqr, acc, sInitial, vInitial;
        
        // Taking input
        System.out.print("Enter values of:\nInitial Position: ");
        sInitial = input.nextDouble();
        
        System.out.print("Time Taken: ");
        t = input.nextDouble();
        
        System.out.print("Acceleration: ");
        acc = input.nextDouble();
        
        System.out.print("Initial Velocity: ");
        vInitial = input.nextDouble();
        
        // Storing powers of input number
        tSqr = Math.pow(t, 2.0);
        
        // final result
        s = sInitial + (vInitial * t) + (0.5 * acc * tSqr);
        
        //Displaying output
        System.out.printf("S = So + Vo*t + (1/2)*a*t^2 = %.3f units\n", Math.abs(s));
        
    } // end of main method
    
} // end of class "FindDistance"