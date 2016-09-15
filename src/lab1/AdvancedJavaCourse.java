package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{

    public AdvancedJavaCourse(String courseName, String courseNumber, String prereq) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prereq);
    }

    public String getCapitalizedCourseName() {
        if(this.getCourseName() != null && !this.getCourseName().equals("")){
            return this.getCourseName().toUpperCase();
        }
        else{
            return "Course has no name!";
        }
    }
}
