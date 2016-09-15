package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    public IntroJavaCourse(String courseName, String courseNumber, String prereq) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prereq);
    }

}
