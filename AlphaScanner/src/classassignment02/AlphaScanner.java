/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classassignment02;

import java.util.Scanner;

/**
 *
 * @author Saif Ullah
 */
public class AlphaScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        String charac, inp;
        boolean upper, lower, vowel, len;
        
        System.out.print("Enter a single alphabet: ");
        charac = input.next();
        
        inp = charac.toLowerCase();
        upper = charac.charAt(0) >= 65 && charac.charAt(0) <= 90;
        lower = charac.charAt(0) >= 97 && charac.charAt(0) <= 122;
        vowel = inp.equals("a") || inp.equals("e") || inp.equals("i")
                || inp.equals("o") || inp.equals("u");
        len = charac.length() > 1;
        
        if (len)
            System.out.println("Not a single alphabet! Try that next time!");
        else if (!(upper || lower))
            System.out.println("Not a character. Enter alphabet next time.");
        else if (vowel && upper)
            System.out.println("It's uppercased vowel.");
        else if (vowel && lower)
            System.out.println("It's lowercased vowel.");
        else if (upper && !(vowel))
            System.out.println("It's uppercased consonant.");
        else
            System.out.println("It's lowercased consonant.");
                
    } // end of main method
    
} // end of class "AlphaScanner"
