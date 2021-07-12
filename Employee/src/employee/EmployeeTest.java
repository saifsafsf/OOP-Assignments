/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 * Creates 2 employees, calculates their yearly salaries & displays them.
 * @author Saif Ullah
 */
public class EmployeeTest {

    /**
     * 
     */
    public static void main(String[] args) {
        // objects emp1, emp2, of class Employee
        Employee emp1 = new Employee("Taylor", "Swift", 80000.0);
        Employee emp2 = new Employee("Joe", "Alwyn", 60000.0);
        
        // Displaying capabilities of class Employee
        
        // Employee 1
        System.out.printf("Name: %s %s\nSalary: %.1f\n\n", emp1.firstName, emp1.lastName, emp1.salary);
        
        // Employee 2
        System.out.printf("Name: %s %s\nSalary: %.1f\n\n", emp2.firstName, emp2.lastName, emp2.salary);
        
        // Yearly Salaries
        System.out.printf("%s's Yearly Salary: %.1f\n", emp1.firstName, emp1.yearlySalary());
        System.out.printf("%s's Yearly Salary: %.1f\n\n", emp2.firstName, emp2.yearlySalary());
        
        // 10% Raised Salaries
        System.out.printf("%s's 10%% Raised Yearly Salary: %.1f\n", emp1.firstName, emp1.raisedSalary());
        System.out.printf("%s's 10%% Raised Yearly Salary: %.1f\n\n", emp2.firstName, emp2.raisedSalary());
        
    } // end of main method
    
} // end of class EmployeeTest
