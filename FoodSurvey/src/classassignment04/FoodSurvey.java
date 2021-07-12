/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classassignment04;

import java.util.Random;

/**
 *
 * @author Saif Ullah
 */
public class FoodSurvey {

    /**
     * Displays the result of survey
     */
    public static void main(String[] args) {
        // Object rand of Class Random
        Random rand = new Random();
        
        // Variables used
        int result[] = new int[10];
        int feedback;
        double percent;
        
        // Storing results of survey
        for (int i = 1; i <= 40; i++){
            feedback = rand.nextInt(10) + 1;
            result[feedback - 1]++;
            
        } // end of for loop
        
        // Displaying results of survey
        for (int index = 0; index < 10; index++) {
            // If no student gave this rating
            if (result[index] == 0)
                continue;
            
            // Caculating percentages of each rating
            percent = (result[index] / 40.0) * 100.0;
            
            // Displaying results
            switch (index + 1) {
                case 1:
                    System.out.printf("%.1f%% students rated food as \"Awful\".\n", percent);
                    break;
                    
                case 10:
                    System.out.printf("%.1f%% students rated food as \"Excellent\".\n", percent);
                    break;
                    
                default:
                    System.out.printf("%.1f%% students rated %d/10 on the food.\n", percent, index+1);
                    break;
                    
            } // end of switch case 
            
        } // end of for loop
        
    } // end of main method
    
} // end of class FoodSurvey
