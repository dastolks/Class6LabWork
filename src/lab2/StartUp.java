/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Alec
 */
public class StartUp {
    
    public static void main(String [] args){
        ProgrammingCourse intro = new IntroToProgrammingCourse("Intro To Programming", "103");
        ProgrammingCourse java = new IntroJavaCourse("Intro To Java", "105");
        ProgrammingCourse advjava = new AdvancedJavaCourse("Advanced Java", "107");
        //it can be used only for methods that are also included with the current interface.
         
        java.setPrerequisites(intro.getCourseNumber());
        advjava.setPrerequisites(intro.getCourseNumber() + " " + java.getCourseNumber());
        
        System.out.println("You are looking at the courses: " + intro.getCourseName() 
                + ", " + java.getCourseName() + ", " + advjava.getCourseName());
        
        System.out.println("The Prerequisites for Intro To Programming are: " + intro.getPrerequisites());
        System.out.println("The Prerequisites for Intro To Java are: " + java.getPrerequisites());
        System.out.println("The Prerequisites for Advanced Java are: " + advjava.getPrerequisites());
    }
}
