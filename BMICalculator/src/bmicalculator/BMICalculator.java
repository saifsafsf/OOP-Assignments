/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.Scanner;

/**
 * Uses the capabilities of BMI.java
 * @author Saif Ullah
 */
public class BMICalculator {

    /**
     * Takes required information, Displays BMI results
     */
    public static void main(String[] args) {
        
        // variables used
        double weight, height;
        int age;
        String name, quit = "y";
        
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        while (quit.charAt(0) != 113) {

            // to retrieve name of user
            System.out.print("Enter your first name: ");
            name = input.next();

            // to retrieve age of user
            System.out.print("Enter your age: ");
            age = input.nextInt();

            // to retrieve weight of user
            System.out.print("Enter your weight in pounds: ");
            weight = input.nextDouble();

            // to retrieve height of user
            System.out.print("Enter your height in inches: ");
            height = input.nextDouble();

            // objects of class BMI
            BMI user1 = new BMI(name, age, weight, height);

            // using copy constructor
            BMI user2 = new BMI(user1);

            // displaying output
            System.out.printf("Calculations show %s is %s.\n", user2.getName(), user2.getStatus());
            
            // asking if user wants to continue
            System.out.print("\nEnter Q to quit or any other alphabet to continue: ");
            quit = input.next().toLowerCase();
            System.out.println();
            
        } // end of while loop
        
        // exiting message
        System.out.println("Program exited successfully.");

    } // end of main method
    
} // end of class BMICalculator
