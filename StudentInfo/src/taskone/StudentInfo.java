/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskone;

import java.util.Scanner;

/**
 *
 * @author Saif Ullah
 */
public class StudentInfo {

    /**
     * Takes information and displays it
     */
    public static void main(String args[]) {
        // Object of the class "Scanner"
        Scanner input = new Scanner( System.in );
        
        // Variables used
        String year;
        int noOfCourses;
        double gpa;
        
        // Taking required information
        System.out.print("Enter your year in college: ");
        year = input.next();
        
        System.out.print("Enter number of courses: ");
        noOfCourses = input.nextInt();
        
        System.out.print("Enter your GPA on scale of 4.0: ");
        gpa = input.nextDouble();
        
        // Displaying Output
        System.out.printf("\nYear in College: %s\n", year);
        System.out.printf("Number of courses: %d\n", noOfCourses);
        System.out.printf("GPA: %.2f\n", gpa);
        
    }// end of main method
    
}// end of class StudentInfo
