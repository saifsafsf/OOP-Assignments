/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testperson;

/**
 * defines toString method for the superclass Person
 * @author Saif Ullah
 */
class Person {
    
    // variables used
    private String firstName, lastName, phoneNo, emailAddress;
    
    // no-arg constructor
    public Person() {}
    
    // parameterized constructor
    public Person(String firstName, String lastName, String phoneNo, String emailAddress) {
        
        // initializing variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;
        
    } // end of parameterized constructor
    
    // to retrieve first name of student
    public String getFirstName() {
        
        return firstName;
        
    } // end of getFirstName method
    
    // to retrieve last name of student
    public String getLastName() {
        
        return lastName;
        
    } // end of getLastName method
    
    // to retrieve String representation of Person
    @Override
    public String toString() {
        
        return "Person: " + firstName + " " + lastName;
        
    } // end of toString method
    
} // end of class Person

/**
 * defines toString method for a subclass of Person, Student
 * @author Saif Ullah
 */
class Student extends Person {
    
    // variabes used
    private final String classStatus;
    
    // no-arg constructor
    public Student() {
        
        // constants (final variables) need to have some default value
        classStatus = "Unknown";
        
    } // end of no-arg constructor
    
    // paramterized consructor
    public Student(String firstName, String lastName, String classStatus, String phoneNo, String emailAddress) {
        
        // passing paarmeters to superclass constructor
        super(firstName, lastName, phoneNo, emailAddress);
        
        // initializing variable
        this.classStatus = classStatus;
        
    } // end of parameterized constructor
    
    // to retrieve String representation of Student
    @Override
    public String toString() {
        
        return "Student: " + getFirstName() + " " + getLastName();
        
    } // end of toString method
    
} // end of class Student

/**
 * defines toString method for a subclass of Person, Employee
 * @author Saif Ullah
 */
class Employee extends Person {
    
    // variables used
    private int office, salary;
    private String dateHired;
    
    // no arg constructor
    public Employee() {}
    
    // parameterized constructor
    public Employee(String firstName, String lastName, String phoneNo, String emailAddress, 
            int office, int salary, String dateHired) {
        
        // passing paarmeters to superclass constructor
        super(firstName, lastName, phoneNo, emailAddress);
        
        // initializing variables
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
        
    } // end of parameterized constructor
    
    // to retrieve String representation of Employee
    @Override
    public String toString() {
        
        return "Employee: " + getFirstName() + " " + getLastName();
        
    } // end of toString method
    
} // end of class Employee

/**
 * defines toString method for a subclass of Employee, Faculty
 * @author Saif Ullah
 */
class Faculty extends Employee{
    
    // variables used
    private int officeHours, rank;
    
    // no arg constructor
    public Faculty() {}
    
    // parameterized constructor
    public Faculty(String firstName, String lastName, String phoneNo, String emailAddress, 
            int office, int salary, int officeHours, int rank, String dateHired) {
        
        // passing paarmeters to superclass constructor
        super(firstName, lastName, phoneNo, emailAddress, office, salary, dateHired);
        
        // initializing variables
        this.officeHours = officeHours;
        this.rank = rank;
        
    } // end of paramterized constructor
    
    // to retrieve String representation of Faculty
    @Override
    public String toString() {
        
        return "Faculty: " + getFirstName() + " " + getLastName();
        
    } // end of toString method
    
} // end of class Faculty

/**
 * defines toString method for a subclass of Employee, Staff
 * @author Saif Ullah
 */
class Staff extends Employee{
    
    // variables used
    private String title;
    
    // no-arg constructor
    public Staff() {}
    
    // parameterized constructor
    public Staff(String firstName, String lastName, String phoneNo, String emailAddress, 
            int office, int salary, String title, String dateHired) {
        
        // passing paarmeters to superclass constructor
        super(firstName, lastName, phoneNo, emailAddress, office, salary, dateHired);
        
        // initializing variable
        this.title = title;
        
    } // end of parameterized constructor
    
    // to retrieve String representation of Staff
    @Override
    public String toString() {
        
        return "Staff: " + getFirstName() + " " + getLastName();
        
    } // end of toString method
    
} // end of class Staff

/**
 * Creates objects for every class above & tests toString methods
 * @author Saif Ullah
 */
public class TestPerson {
    
    /**
     * testing toString() of all classes
     */
    public static void main(String[] args) {
        
        // person's example
        Person person = new Person("Taylor", "Swift", "00123456789", "taylorswift13@gmail.com");
        
        // student's example
        Student student = new Student("Olivia", "Rodrigo", "Sophomore", "28917372191", "oliviarodrigo@gmail.com");
        
        // employee's example
        Employee employee = new Employee("Tree", "Paine", "182739823741", 
                "treepaine@gmail.com", 420, 1000000, "Aug 11, 2014");
        
        // faculty's example
        Faculty faculty = new Faculty("Joe", "Alwyn", "1283718927", 
                "joealwyn@gmail.com", 412, 5000000, 8, 21, "Sep 26, 2016");
        
        // staff's example
        Staff staff = new Staff("Conan", "Gray", "12830173129", 
                "conangray@gmail.com", 408, 500000, "Apprentice", "Mar 26, 2020");
        
        // toString method of Person
        System.out.println(person.toString());
        
        // toString method of Student
        System.out.println(student.toString());
        
        // toString method of Employee
        System.out.println(employee.toString());
        
        // toString method of Faculty
        System.out.println(faculty.toString());
        
        // toString method of Staff
        System.out.println(staff.toString());
        
    } // end of main method
    
} // end of TestPerson class
