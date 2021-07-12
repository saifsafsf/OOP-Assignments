/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminuser;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class AdminUser {

    /**
     * for administrators & users
     * let's admins add info about new users
     * lets users login to the system
     */
    public static void main(String[] args) {
        // Object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // Variables Used
        String inp, name, pass;
        String[] userName, passwords;
        userName = new String[10];
        passwords = new String[10];
        String exit = "Y";
        int i = 0;
        boolean duplicate = false;
        
        // Using labels
        OUTER:
        while (exit.charAt(0) != 113) {
            // Taking input from main menu
            System.out.println("MAIN MENU:");
            System.out.println("\"A\" for Administrator OR \"E\" as End-User\n"
                    + "\"Q\" to exit the program.");
            System.out.print("Enter here: ");
            
            // to avoid program crashes
            inp = input.next().toLowerCase();
            System.out.println();
            
            // Checking user's input
            switch (inp.charAt(0)) {
                
                // if input = q
                case 113:
                    // exiting the program
                    System.out.println("Program exited successfully.");
                    break OUTER;
                    
                // if input = a
                case 97:
                    String quit = "Y";
                    // Welcome message
                    System.out.println("Welcome Administrator!\nEnter usernames & passwords!");
                    
                    // To enter 10 credentials
                    while (i < 10 && quit.charAt(0) != 113) {
                        
                        // To make sure every username is different
                        while (!duplicate){
                            
                            // Taking input
                            System.out.print("\nUsername: ");
                            name = input.next();
                            
                            // finding in list of usernames
                            for (int a = 0; a < i; a++) {
                                
                                // if found
                                if (userName[a].equals(name)) {
                                    System.out.println("Already exists. Try again.");
                                    duplicate = true;
                                    break;
                                    
                                } // end of if body
                                
                            } // end of for loop
                            
                            // if not found or first entry
                            if (i == 0 || !duplicate) {
                                userName[i] = name;
                                duplicate = true;
                                
                            } // end of if body
                            
                            // for next iteration
                            else
                                duplicate = false;
                            
                        } // end of while loop
                        
                        // for next time to enter usernames
                        duplicate = false;
                        
                        // Taking input
                        System.out.print("Password: ");
                        pass = input.next();
                        passwords[i] = pass;
                        
                        System.out.println();
                        
                        // increment for next iteration
                        i++;
                        
                        // to show entries left
                        if (i != 10) {
                            System.out.printf("%d entries left. Enter \"Q\" to quit "
                                    + "or any other alphabet to continue: ", 10-i);
                            quit = input.next().toLowerCase();
                            
                        } // end of if body
                        
                    } // end of while loop
                    
                    System.out.println();
                    break;
                
                // if input = e
                case 101:
                    
                    // variables used
                    boolean foundUser = false, foundPass = false;
                    int k = 0;
                    
                    // to count three chances of login
                    while (!foundPass && k < 3) {
                        
                        // taking username
                        System.out.print("Enter your username: ");
                        name = input.next();
                        
                        // finding username
                        for (int j = 0; j < i; j++) {
                            
                            // if found
                            if (userName[j].equals(name)) {
                                foundUser = true;
                                
                                // taking password
                                System.out.print("Enter the password: ");
                                pass = input.next();
                                
                                // if password matched
                                if (passwords[j].equals(pass)) {
                                    foundPass = true;
                                    
                                    // successful login message
                                    System.out.println("Logged in successfully!\n");
                                    
                                } // end of if body
                                
                                // if not matched
                                else {
                                    // unsuccessful login message
                                    System.out.println("Invalid Credentials. Try Again.\n");
                                    
                                } // end of else body
                                
                                break;
                                
                            } // end of if body
                            
                        } // end of for loop
                        
                        // if username not found
                        if (!foundUser)
                            System.out.println("Username not found. Try Again.\n");
                        
                        // changing for next iteration
                        else
                            foundUser = false;
                        
                        // increment for next iteration
                        k++;
                        
                    } // end of while loop
                    
                    break;
                    
                // invalid input message
                default:
                    System.out.println("Invalid Input... Try Again.\n");
                    
            } // end of switch case body
            
        } // end of while loop
        
    } // end of main method
    
} // end of class AdminUser
