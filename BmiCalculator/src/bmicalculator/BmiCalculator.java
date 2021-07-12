/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author Saif Ullah
 */
public class BmiCalculator {

    /**
     * Calculates BMI from user's height & weight
     */
    public static void main(String[] args) {
        // Object "input" of the class "Scanner"
        Scanner input = new Scanner( System.in );
        
        // Variables used
        float weight, height;
        double bmi;
        
        // Taking weight
        System.out.print("Enter weight in kilograms: ");
        weight = input.nextFloat();
        
        // Taking height
        System.out.print("Enter height in metres: ");
        height = input.nextFloat();
        
        // Calculating BMI
        bmi = weight/Math.pow(height, 2.0);
        
        // Displaying BMI, precision: 3
        System.out.printf("BMI: %.3f\n", bmi);
        
        // Evauating BMI
        if (bmi < 18.5)
            System.out.println("You are underweight.");
        
        else if (bmi <= 24.9)
            System.out.println("Your BMi shows you are normal.");
        
        else if (bmi <= 29.9)
            System.out.println("You are overweight as your BMI depicts.");
        
        else
            System.out.println("According to your BMI, you are obese.");
        
    } // end of main method
    
} // end of class BmiCalculator
