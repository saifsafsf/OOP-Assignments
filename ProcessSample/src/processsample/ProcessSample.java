package processsample;

import java.io.IOException;
import java.util.Scanner;

/**
 * Uses ProcessFile class to process on Sample.java.txt
 * @author Saif Ullah
 */
public class ProcessSample {

    /**
     * executes required methods for the processing
     */
    public static void main(String[] args) throws IOException {
        
        // ProcessFile object to test all methods
        ProcessFile pf = new ProcessFile();
        
        // Scanner object to take input from user
        Scanner input = new Scanner( System.in );
        
        // input & out put files paths
        String inpPath, outPath, term;
        int i = 0;
        
        // search term
        System.out.print("Enter the term to search in lines: ");
        term = input.nextLine();
        
        // taking input from user
        System.out.print("\nEnter input file path: ");
        inpPath = input.nextLine();
        
        while (!(pf.errorChecks(inpPath))) {
            
            // error message
            System.out.println("Try again with a correct file path.");
            
            // taking input from user
            System.out.print("\nEnter input file path: ");
            inpPath = input.nextLine();
            
        } // end of while body
        
        // taking input from user
        System.out.print("\nEnter output file path: ");
        outPath = input.nextLine();
        
        while (outPath.equals(inpPath)) {
            
            // error message
            System.out.println("Try again with a different file path.");
            
            // taking input from user
            System.out.print("\nEnter output file path: ");
            outPath = input.nextLine();
            
        } // end of while body
        
        System.out.println();
        
        // creating output file if not existed
        pf.createFile(outPath);
        
        System.out.println();
        
        // Reading from input file and writing in output file
        pf.readWrite(inpPath, outPath, term);
        
        // displaying size in KBs
        System.out.printf("\nSize of %s in KBs: %.2f\n", pf.getName(outPath), pf.sizeInKBs(outPath));
        
    } // end of main method
    
} // end of class ProcessSample
