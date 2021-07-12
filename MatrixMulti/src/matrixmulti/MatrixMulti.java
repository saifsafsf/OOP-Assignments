/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmulti;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class MatrixMulti {
    
    /**
     * Takes matrix input
     */
    public static int[][] inputMatrix(int[][] matrix) {
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // row counter
        for (int i = 0; i < 3; i++) {
            
            // colomn counter
            for (int j = 0; j < 3; j++) {
                
                // taking input
                System.out.printf("Enter entry A%d%d: ", i+1, j+1);
                matrix[i][j] = input.nextInt();

            } // end of each row input

        } // end of for loop
        
        System.out.println();
        
        // returning final input
        return matrix;
        
    } // end of inputMatrix method
    
    /**
     * Takes 2 matrices, returns their product 
     */
    public static int[][] productMatrix(int[][] m1, int[][] m2) {
        
        // Product Matrix initialized
        int[][] prodM = new int[3][3];
        
        // fow counter
        for (int i = 0; i < 3; i++) {
            
            // colomn counter
            for (int j = 0; j < 3; j++) {
                
                // product calculation
                prodM[i][j] = (m1[i][0] * m2[0][j]) +
                        (m1[i][1] * m2[1][j]) +
                        (m1[i][2] * m2[2][j]);
                
            } // end of for loop
            
        } // end of for loop
        
        // returning Product Matrix
        return prodM;
        
    } // end of productMatrix method

    /**
     * Takes 2 matrices, displays their product matrix
     */
    public static void main(String[] args) {
        
        // arrays used as matrices
        int[][] matrix1 = new int[3][3], matrix2 = new int[3][3], prodMatrix = new int[3][3];
        
        // taking matrix 1 input
        System.out.println("For matrix 1");
        matrix1 = inputMatrix(matrix1);
        
        // taking matrix 2 input
        System.out.println("For matrix 2");
        matrix2 = inputMatrix(matrix2);
        
        // Calculating product
        prodMatrix = productMatrix(matrix1, matrix2);
        
        // displaying output
        System.out.println("Product of the two matrices:");
        
        // row counter
        for (int i = 0; i < 3; i++) {
            
            // colomn counter
            for (int j = 0; j < 3; j++) {
                
                // each element dsiplayed
                System.out.printf("%5d", prodMatrix[i][j]);
            
            } // end of for loop
            
            // for matrix-like representation
            System.out.println();
            
        } // end of for loop
        
    } // end of mein method
    
} // end of MatrixMulti class
