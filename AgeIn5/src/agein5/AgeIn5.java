/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agein5;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class AgeIn5 {

    /**
     * Asks name & age. Returns Age 5 years ago & later
     */
    public static void main(String[] args) {
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // Variables used
        String name;
        int age, ago, later;
        
        // taking input
        System.out.print("Enter you name: ");
        name = input.next();
        
        System.out.printf("\nHey %s, how old are you: ", name);
        age = input.nextInt();
        
        // Displaying output
        System.out.printf("\n%s, 5 years later, your age will be %d.\n"
                + "You were %d years old 5 years ago!\n", name, age+=5, age-=10);
        
    } // end of main method
    
} // end of class AgeIn5
