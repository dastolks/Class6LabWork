/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Alec
 */
public class StartUp {
    
    public static void main(String [] args){
        ProgrammingCourse intro = new IntroToProgrammingCourse("Intro To Programming","103");
        System.out.println("Intro To Programming these has for requirements: " + intro.getPrerequisites());
        intro.setCredits(3);
        System.out.println("Intro To Programming is worth " + intro.getCredits() + " credits.");
        
        ProgrammingCourse javaIntro = new IntroJavaCourse("Intro To Java","105",intro.getCourseNumber());
        System.out.println("Intro To Java has these for requirements: " + javaIntro.getPrerequisites());
        javaIntro.setCredits(4);
        System.out.println("Intro To Java is worth " + javaIntro.getCredits() + " credits.");
        
        ProgrammingCourse javaAdvanced = new AdvancedJavaCourse("Intro To Programming","107",intro.getCourseNumber() + " " + javaIntro.getCourseNumber());
        System.out.println("Advanced Java has these for requirements: " + javaAdvanced .getPrerequisites());
        javaAdvanced .setCredits(4);
        System.out.println("Advanced Java is worth " + javaAdvanced .getCredits() + " credits.");
        
    }
}
