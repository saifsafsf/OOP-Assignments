/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 * defines students marks & necessary methods
 * @author Saif Ullah
 */
public class Student {

    // variables used
    private final int student_id;
    private final int marks;

    /**
     * Initializes the variables declared above
     */
    public Student(int student_id, int marks) {
        this.student_id = student_id;
        this.marks = marks;

    } // end of Student constructor

    /**
     * to retrieve student ID
     */
    public int getStudentID() {
        return student_id;

    } // end of getStudentID

    /**
     * to retrieve student's marks
     */
    public int getMarks() {
        return marks;

    } // end of getMarks

} // end of class Student

/**
 * To enter info of 7 students, then display average of these 7 students
 */
class StudentTest {

    /**
     * uses the capabilities of class Student
     */
    public static void main(String[] args) {
        // array of objects of class Student
        Student[] studentArray = new Student[7];

        // to calculate average
        int total = 0;
        double average;

        // initializing each element of the array
        studentArray[0] = new Student(336100, 86);
        studentArray[1] = new Student(347289, 57);
        studentArray[2] = new Student(398272, 65);
        studentArray[3] = new Student(237623, 70);
        studentArray[4] = new Student(356291, 61);
        studentArray[5] = new Student(383629, 76);
        studentArray[6] = new Student(327836, 72);

        // header to display inputs
        System.out.println("Student ID\tMarks\n");

        // displaying inputs for each object
        for (int i = 0; i < 7; i++) {
            System.out.printf("%d\t\t%d\n", studentArray[i].getStudentID(), studentArray[i].getMarks());
            
            // adding into total to calculate average
            total += studentArray[i].getMarks();

        } // end of for loop body

        // using average formula
        average = total / 7.0;

        // dsiplaying output
        System.out.printf("\nAverage of these students: %.2f\n", average);

    } // end of main method

} // end of StudentTest class
