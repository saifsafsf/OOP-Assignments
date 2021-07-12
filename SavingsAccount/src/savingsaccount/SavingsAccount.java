/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;

/**
 * Calculates Savings with INterest of a Saving Bank Account
 * @author Saif Ullah
 */
public class SavingsAccount {
    // Variables used
    static double annualInterestRate;
    private double savingsBalance;
    
    /**
     * initializing variable with user's given value
     */
    public SavingsAccount(double savingsBalance) {
        // assigning given value 
        this.savingsBalance = savingsBalance;
        
    } // end of parameterized constructor
    
    /**
     * A getter to retrieve value of savingsBalance
     */
    public double getSavingsBalance() {
        // to get the private variable's value
        return savingsBalance;
    }
    
    /**
     * to calculate & add the monthly interest
     */
    public void calculateMonthlyInterest() {
        // calculating Monthly Interest
        savingsBalance += ((savingsBalance * (annualInterestRate / 100.0)) / 12.0);
        
    } // end of calculateMonthlyInterest method
    
    /**
     * Initializing with user given input
     */
    public static void modifyInterestRate(double intRate) {
        // modifying interest rate to user-given value
        annualInterestRate = intRate;
        
    } // end of modifyInterestRste

} // end of class SavingsAccount
