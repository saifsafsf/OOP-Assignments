/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileage;

import java.util.Scanner;

/**
 *
 * @author Saif Ullah
 */
public class Mileage {

    /**
     * Calculates individual & total mileage of trips
     */
    public static void main(String[] args) {
        // Object 'input' of class 'Scanner'
        Scanner input = new Scanner(System.in);
        
        // Variables used
        int totalKilom, totalLitres, i;
        double kilometres, litres, mileage, total;
        
        // Assignment of values to variables
        totalLitres = 0;
        totalKilom = 0;
        i = 1;

        // To enter the while loop
        String quit;
        quit = "a";

        while (!(quit.equals("q"))) {
            // Taking kilometres
            System.out.printf("Enter number of kilometres driven in Trip %d: ", i);
            kilometres = input.nextDouble();

            // Taking litres
            System.out.printf("Enter quantity of fuel in litres used in Trip %d: ", i);
            litres = input.nextDouble();

            // Required in question
            kilometres = (int) kilometres;
            litres = (int) litres;

            // Calculating & displaying mileage
            mileage = (double) kilometres / litres;
            System.out.printf("Trip %d mileage: %.3f\n", i, mileage);

            // Total Kilometres & Litres
            totalKilom += kilometres;
            totalLitres += litres;

            // Calculating & displaying total mileage
            total = (double) totalKilom / totalLitres;
            System.out.printf("Total mileage: %.3f\n", total);

            // Sentinel Value Input
            System.out.printf("\nEnter any alphabet to continue or 'q' to quit: ");
            quit = input.next();
            quit = quit.toLowerCase();
            System.out.println();

            // Incrementing for next iteration
            i++;

        } // end of while loop body
        System.out.println("Program exited successfully.");

    } // end of main method

} // end of class Mileage
