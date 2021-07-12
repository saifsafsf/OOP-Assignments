package processsample;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Defines appropriate methods for File Processing
 * @author Saif Ullah
 */
public class ProcessFile {

    public boolean errorChecks(String path) {
        
        // file object to deal with file handling
        File name = new File( path );
        
        return name.exists() && !(name.isDirectory()) && name.isFile() && name.canRead();
        
    } // end of errorChecks method
    
    public void createFile( String path ) throws IOException{
        
        // file object to deal with file handling
        File name = new File( path );
        
        // creating new file
        if (name.createNewFile())
            System.out.println("File created successfully!");
        
        // if not created
        else
            System.out.println("File exists already!");
        
    } // end of createFile method
    
    public void readWrite( String inpPath, String outPath, String term ) throws FileNotFoundException, IOException {
        
        // variable declared
        String i;
        int index, noOfTerms;
        
        // file object to deal with file handling
        File inpName = new File( inpPath );
        File outName = new File( outPath );
        
        // File Reader & Writer wrap on file object
        FileReader fileReader = new FileReader( inpName );
        FileWriter fileWriter = new FileWriter( outName );
        
        // BufferedReader wrap on fileReader object
        BufferedReader bufferedReader = new BufferedReader( fileReader );
        BufferedWriter bufferedWriter = new BufferedWriter( fileWriter );
        
        // reading line by line
        while ( (i = bufferedReader.readLine()) != null ) {
            
            // no of terms found in line
            noOfTerms = countTerm( i, term );
                
            // wirting that line
            bufferedWriter.write(i + " [" + noOfTerms + "]\n");
            
        } // end of while body
        
        bufferedWriter.flush();
        
        // success message
        System.out.println("Output written successfully!");
        
        //closing streams
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
        
    } // end of readWrite method
    
    public int countTerm( String line, String term ) {
        
        // variables initialized
        int index, wordCount = 0, tokenCount;
        String words[] = new String[35];
        
        // Tokenizing the line
        StringTokenizer st = new StringTokenizer(line);
        
        // counting total words in line
        tokenCount = st.countTokens();
        
        // storing the words in a list
        for (index = 0; index < tokenCount; index++) {
            
            words[index] = st.nextToken();
            
            // counting the term
            if (words[index].toLowerCase().equals(term.toLowerCase()))
                wordCount++;
                        
        } // end of for body
        
        return wordCount;
        
    } // end of countTerm method
    
    public double sizeInKBs( String path ) {
        
        // file object to deal with file handling
        File name = new File(path);
        
        long size;
        
        // size in Bytes
        size = name.length();
        
        //conversion into KBs
        return ( size / 1000.0 );
        
    } // end of sizeInKBs
    
    public String getName(String path) {
        
        File name = new File(path);
        
        // returning name of file
        return name.getName();
        
    } // end of getName method
    
} // end of class ProcessFile