package fileapplication;
import java.util.Scanner;

/**
 * tests the method defined in FileApplication
 * @author Saif Ullah
 */
public class TestFileContents {

    /**
     * uses the defined method with NetBeans Folder
     */
    public static void main(String[] args) {
        
        // FileApplication object to dispaly directory contents
        FileApplication app = new FileApplication();
        
        // Scanner object to take input
        Scanner input = new Scanner( System.in );
        
        // taking path from user
        System.out.print("Enter directory path to be analyzed: ");
        String path = input.nextLine();
        
        System.out.println();
        
        // Analyzing receieved path
        app.directoryContents(path);
        
    } // end of main method
    
} // end of TestFileContents
