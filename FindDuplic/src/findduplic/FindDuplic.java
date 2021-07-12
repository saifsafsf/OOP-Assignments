/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findduplic;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class FindDuplic {

    /**
     * Displays duplicates from an array
     */
    public static void main(String[] args) {
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // length of the array
        System.out.print("Enter number of elements you want to add: ");
        int len;
        len = input.nextInt();
        
        // variables used
        int[] array = new int[len];
        boolean found = false;
        
        for (int i = 0; i < len; i++) {
            
            // taking input
            System.out.printf("Enter element %d: ", i+1);
            array[i] = input.nextInt();
            
        } // end of for loop
        
        System.out.println("\nThe duplicates are: ");
        
        // iterating through given array
        for (int j = 0; j < len; j++) {
            
            // iterating similarly to find duplicates
            for (int k = j+1; k < len; k++) {
                
                // if found
                if (array[j] == array[k]) {
                    
                    // displaying output
                    System.out.printf("%d\n", array[k]);
                    found = true;
                    
                } // end of if body
                
            } // end of for loop
            
        } // end of for loop
        
        // in case of distinct integers
        if (!found)
            System.out.println("NO Duplicate Integers Found!");
        
    } // end of main method
    
} // end of class FindDuplic
