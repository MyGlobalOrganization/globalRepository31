package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{




    public class CarGitChecks{

        public DriveTrain drive;

        public void tearDown(){
            System.out.println("Tear Down");
        }

        public void drive() {System.out.println("Drive");}  // Noncompliant; duplicates field name
    }


    public void aMethod(){
        int i=0;
        while (i<10){
            i++;
        }
}




}
