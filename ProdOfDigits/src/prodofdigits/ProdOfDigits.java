/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodofdigits;

import java.util.Scanner;

/**
 *
 * @author Saif Ullah
 */
public class ProdOfDigits {

    /**
     * Takes 3 digit integer.
     * Returns product of its digits
     */
    public static void main(String[] args) {
        // Object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // Variables used
        int num, copy, rem, prod = 1;
        
        // to enter while loop
        num = 0;
        
        // to get 3 digit input
        while (!(99 < num && num < 1000)) {
            
            // Taking input
            System.out.print("Enter a 3-digit integer: ");
            num = input.nextInt();
            
        } // end of while loop
        
        // to avoid changing value of num
        copy = num;
        
        while (copy != 0) {
            // last digit of integer
            rem = copy % 10;
            
            // total product
            prod *= rem;
            
            // for next iteration
            copy /= 10;
            
        } // end of while loop
        
        // Displaying output
        System.out.printf("\nProduct of digits of %d: %d\n", num, prod);
        
    } // end of main method
    
} // end of class ProdOfDigits
