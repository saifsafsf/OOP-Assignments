package fileapplication;
import java.io.File;

/**
 * Takes a directory's path and displays its contents
 * @author Saif Ullah
 */
public class FileApplication {

    // method to do the required task
    public void directoryContents( String path ) {
        
        // file object to deal with file handing
        File name = new File( path );
        
        // if file exists
        if (name.exists()) {
            
            // if path doesnt lead to a file
            if (name.isDirectory()) {
                
                // names of directories/files in the path
                String contents[] = name.list();
                
                System.out.println("This directory consists:");
                
                // iterating through the received list
                for ( var directoryName : contents )
                    
                    // displaying names
                    System.out.printf("%s\n", directoryName);
                
            } // end of if body
            
            // if path isnt a directory
            else {
                System.out.println("Try again with a directory path.");
                
            } // end of else body
            
        } // end of if body
        
        // if path doesnt exist
        else {
            System.out.printf("%s does not exist.", path);
            
        } // end of else body
        
    } // end of method directoryContents
    
} // end of class File Application
