package person;

/**
 * Testing capabilities of classes, Person, Student, Faculty, 
 * JobDescription, HiringDate
 * @author Saif Ullah
 */
public class TestPerson {

    /**
     * makes objects of above mentioned classes and displays their details
     */
    public static void main(String[] args) {
        
        // defining HiringDate
        HiringDate hiringDate = new HiringDate(26, 9, 2016);
        
       // defining job description
       JobDescription jobDescription = new JobDescription("Associate Professor",
               "13 crd-hrs/week", 35000);
       
       // defining a faculty member
       Faculty faculty = new Faculty(420, hiringDate, jobDescription, "Joe Alwyn", 
               "61101-2988713-2", "joealwyn@gmail.com", "0092352873691");
       
       // defining a student
       Student student = new Student("Peter Parker", "7619281-21838128-2", 
               "pete@gmail.com", "005818728127", "2k24", "NUST-336100-BESEA");
       
       // defining a person
       Person person = new Person("Taylor Swift", "612838-1823902-1", 
               "taylorswift13@gmail.com", "0011272971223");
       
       // displaying data
       System.out.println(faculty);
       System.out.println(student);
       System.out.println(person);
        
    } // end of main method
    
} // end of TestPerson
