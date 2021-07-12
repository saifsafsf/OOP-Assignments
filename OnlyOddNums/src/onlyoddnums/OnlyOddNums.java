/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlyoddnums;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class OnlyOddNums {

    /**
     * takes integers. returns odd integers only.
     */
    public static void main(String[] args) {
        // Object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // variables used
        int list[];
        list = new int[10];
        int num;
        
        for (int i = 0; i < 10; i++) {
            // Taking input
            System.out.printf("Enter integer %d: ", i+1);
            num = input.nextInt();
            
            list[i] = num;
            
        } // end of for loop
        
        System.out.println("\nOdd numbers input in reverse order:");
        
        for (int i = 9; i >= 0; i--) {
            
            if (list[i] % 2 != 0)
                System.out.printf("%d\n", list[i]);
            
        } // end of for loop
        
    } // end of main method
    
} // end of class OnlyOddNums
