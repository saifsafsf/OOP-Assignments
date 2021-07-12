/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentnums;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class DifferentNums {

    /**
     * Only takes different 10 integers
     */
    public static void main(String[] args) {
        // Object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // Variables used
        int list[];
        list = new int[10];
        int num;
        boolean duplicate = false;
        
        // Checking for duplicates & storing in list
        for (int i = 0; i < 10; i++) {
            
            //Taking input
            System.out.printf("Enter integer %d: ", i+1);
            num = input.nextInt();
            
            // Checking for duplicates
            for (int j = 0; j < i; j++) {
                if (list[j] == num) {
                    // to keep loop on same iteration
                    i--;
                    duplicate = true;
                    break;
                
                } // end of if body
                
            } // end of for loop
            
            // using flag variable
            if (duplicate)
                duplicate = false;
            else
                // adding in the array
                list[i] = num;
            
        } // end of for loop
        
        // Displaying output
        System.out.print("Output:");
        
        for (int i: list)
            System.out.printf("%5d", i);
        
        System.out.println();
        
    } // end of main method
    
} // end of class DifferentNums
