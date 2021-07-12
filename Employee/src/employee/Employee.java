/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Saif Ullah
 */
public class Employee {
    
    // Variables used
    String firstName, lastName;
    double salary;
    
    /**
     * Initializes the variables declared before
     */
    Employee (String fname, String lname, double salarie) {
        // assigning values
        firstName = fname;
        lastName = lname;
        
        // required condition
        if (salarie >= 0)
            salary = salarie;
        
    } // end of parameterized constructor

    /**
     * Returns yearly salary
     */
    public double yearlySalary() {
        return salary * 12.0;
        
    } // end of yearlySalary method
    
    /**
     * returns 10% raised yearly salary
     */
    public double raisedSalary() {
        return 12 * (salary + (salary / 10.0));
        
    } // end of raisedSalary method
    
} // end of Employee class
