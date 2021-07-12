/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;

/**
 * Uses SavingsAccount class, calculates savings for some months
 * @author Saif Ullah
 */
public class TestSavingsAcc {

    /**
     * calculates & displays required output
     */
    public static void main(String[] args) {
        // objects of class SavingsAccount
        SavingsAccount saver1 = new SavingsAccount(3200.0);
        SavingsAccount saver2 = new SavingsAccount(4500.0);
        
        // setting value to 5%
        SavingsAccount.modifyInterestRate(5);
        
        // displaying header for final result
        System.out.println("Savings Balance with 5% Interest:\n");
        System.out.println("Months\t\tSaver 1\t\tSaver 2\n");
        
        // to display for every month
        for (int i = 1; i < 13; i++) {
            
            // calculating monthly interest for each saver
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            // displaying savings balance with 5% interest
            System.out.printf("Month %d:\t$%.2f\t$%.2f\n", 
                    i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
            
        }
        
        // setting value to 7%
        SavingsAccount.modifyInterestRate(7);
        
        // calculating monthly interest for each saver
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        // displaying savings balance with 7% interest
        System.out.printf("\nSavings after 13 months with 7%% Interest:\n"
                + "Saver 1: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
        
    } // end of main method
    
} // end of TestSavingsAcc class
