/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 * @author Saif Ullah
 */
public class Date {
    
    int date, month, year;
    
    /**
     * Initializing the instance variables
     */
    Date (int dt, int mon, int yr) {
        date = dt;
        month = mon;
        year = yr;
        
    } // end of paramterized constructor
    
    /**
     * Displays the date with format
     */
    public void displayDate() {
        System.out.printf("Date: %d/%d/%d\n", date, month, year);
        
    } // end of displayDate method
    
} // end of Date method
