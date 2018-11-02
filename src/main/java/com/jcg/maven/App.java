package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public void notCovered() {
        System.out.println("notCovered");
    }



    public class Car{

        public DriveTrain drive;

        public void tearDown(){
            System.out.println("Tear Down");
        }

        public void drive() {System.out.println("Drive");}  // Noncompliant; duplicates field name
    }

    public class MyCar extends Car{
        public void teardown(){System.out.println("Tear Down");}  // Noncompliant; not an override. It it really what's intended?

        public void drivefast(){System.out.println("Drive fast");}

        public void driveFast(){System.out.println("I said: drive fast !");} //Huh?
    }

    public class DriveTrain{

    }


}
