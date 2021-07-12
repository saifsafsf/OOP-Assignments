package readdisplay;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Saif Ullah
 */
public class ReadDisplay {

    /**
     * 
     */
    public static void main(String[] args) throws IOException {
        
        // variables declared & initialzed
        String line;
        int tokenCount, lineCount = 0, wordCount = 0;
           
        // file object to deal with file handling
        File file = new File("C:\\NUST\\BESE 2nd Semester\\Object Oriented Programming\\Labs\\Lab 12\\Task2.txt");
        
        // File Reader wrap on file object
        FileReader fileReader = new FileReader(file);
            
        // Buffered Reader wrap on fileReader
        BufferedReader bufferedReader = new BufferedReader(fileReader);
         
        // stop when no line is read
        while ((line = bufferedReader.readLine()) != null) {
            // counting lines
            lineCount++;
            
            // tokenizing each line into separate words
            StringTokenizer st = new StringTokenizer(line);
            
            // counting words
            tokenCount = st.countTokens();
            
            // total no. of words
            wordCount += tokenCount;
            
        } // end of while method
        
        //displaying required results
        System.out.printf("Total number of lines in %s: %d\n", file.getName(), lineCount);
        
        System.out.printf("Total number of words in %s: %d\n", file.getName(), wordCount);
        
        // closing streams
        fileReader.close();
        bufferedReader.close();
        
    } // end of main method
    
} // end of ReadDisplay
