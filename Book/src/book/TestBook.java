package book;

/**
 * Testing the capabilities of classes Book & Author
 * @author Saif Ullah
 */
public class TestBook {

    /**
     * makes objects of Authors, assigns them to Books, 
     * then displays their details
     */
    public static void main(String[] args) {
        
        // defining Authors
        Author jKRowling = new Author("J. K. Rowling", 'F', "jkrowing@gmail.com");
        Author robertKiyosaki = new Author("Robert Kiyosaki", 'M', "robertkiyo@gmail.com");
        Author charlesDickens = new Author("Charles Dikens", 'M', "charlesdickens@gmail.com");
        
        // Defining Books
        Book harryPotter = new Book("Harry Potter", jKRowling, 23.99, 457);
        Book richDadPoorDad = new Book("Rich Dad, Poor Dad", robertKiyosaki, 16.89, 118);
        Book oliverTwist = new Book("Oliver Twist", charlesDickens, 19.55);
        
        // Displaying details of books
        System.out.println(harryPotter);
        System.out.println(richDadPoorDad);
        System.out.println(oliverTwist);
        
    } // end of main method
    
} // end of TestBook Class
