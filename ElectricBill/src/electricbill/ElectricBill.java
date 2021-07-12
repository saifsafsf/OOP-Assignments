/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricbill;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class ElectricBill {

    /**
     * Calculates electricity bill 
     */
    public static void main(String[] args) {
        // Object inout of Class Scanner
        Scanner input = new Scanner( System.in );
        
        // variabes used
        double units, bill, fuelSurcharge, govtTax;
        
        // taking units
        System.out.print("Enter number of units used: ");
        units = input.nextDouble();
        
        // in case of 100 or lower units
        if (units <= 100)
            bill = 4.0 * units;
        
        // in case of between 100 & 300 units
        else if (units <= 300)
            bill = 4.5 * units;
        
        // in case of between 300 and 500 units
        else if (units <= 500)
            bill = 4.75 * units;
        
        // in case of greater than 500 units
        else
            bill = 5 * units;
        
        // 20% fuel surcharge
        fuelSurcharge = bill / 5.0;
        
        // 10% govt. tax
        govtTax = bill / 10.0;
        
        // Calculating total bill
        bill += (fuelSurcharge + govtTax);
        
        // displaying output
        System.out.printf("Total Electricity Bill: %.2f\n", bill);
        
    } // end of main method
    
} // end of class ElectricBill
