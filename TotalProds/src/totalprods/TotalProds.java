/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalprods;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class TotalProds {

    /**
     * Calculates total products by factories
     */
    public static void main(String[] args) {
                
        // variables used
        int fact[][] = new int[4][3]; // 4 factories array, each with 3 types of items
        int[] totalProds;
        
        // calculating products
        totalProds = products(fact);
        
        // displaying output
        System.out.printf("Bio-degradable Products: %d\n", totalProds[0]);
        System.out.printf("Non-bio-degradable Products: %d\n", totalProds[1]);
        System.out.printf("Recyclable Products: %d\n", totalProds[2]);
        
    } // end of main method
    
    public static int[] products( int[][] fact ) {
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // variables used
        int bioProds = 0, nonBioProds = 0, recycProds = 0;
        int[] prods = new int[3];
        
        // taking input
        for (int i = 0; i < 4; i++) {
            System.out.printf("Factory %d:\n", i+1);
            
            // for bio-degradable items
            System.out.print("Enter no. of bio-degradable items: ");
            fact[i][0] = input.nextInt();
            
            // for non-bio-degradable items
            System.out.print("Enter no. of non-bio-degradable items: ");
            fact[i][1] = input.nextInt();
            
            // for recyclable items
            System.out.print("Enter no. of recyclable items: ");
            fact[i][2] = input.nextInt();
            
            // for necessary spacing
            System.out.println();
            
            // calculating products category-wise
            bioProds += fact[i][0];
            nonBioProds += fact[i][1];
            recycProds += fact[i][2];
            
        } // end of for loop
        
        // combining results into one array
        prods[0] = bioProds;
        prods[1] = nonBioProds;
        prods[2] = recycProds;
        
        // returning final array
        return prods;
        
    } // end of products method
    
} // end of class TotalProds
