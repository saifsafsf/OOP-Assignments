/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Saif Ullah
 */
public class Calculator {

    /**
     * calculates basic arithmetic operations
     */
    public static void main(String[] args) {
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // variables used
        double num1, num2;
        String operator;
        
        // taking number 1
        System.out.print("Enter 1st operand: ");
        num1 = input.nextDouble();
        
        // taking number 2
        System.out.print("Enter 2nd operand: ");
        num2 = input.nextDouble();
        
        // taking operator
        System.out.print("Enter operator: ");
        operator = input.next();
        
        // evaluating value of operator
        switch (operator) {
            
            // in case of addition
            case "+":
                System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1 + num2);
                break;
            
            // in case of subtraction
            case "-":
                System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, num1 - num2);
                break;
                
            // in case of multiplication
            case "*":
                System.out.printf("%.1f * %.1f = %.1f\n", num1, num2, num1 * num2);
                break;
                
            // in case of division
            case "/":
                System.out.printf("%.1f / %.1f = %.1f\n", num1, num2, num1 / num2);
                break;
            
            // none of above operators
            default:
                System.out.println("Invalid Operator...\n");
                
        } // end of switch case body
        
    } // end of main method
    
} // end of class Calculator