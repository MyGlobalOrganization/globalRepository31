package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{


    private static final int MAX_PRICE = 10;

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }



    public void newMethodGitchecks(){
        int target = -5;
        int num = 3;


    }

    public void setPriceGitChecks(int price) {
        assert price >= 0 && price <= MAX_PRICE;
        // Set the price
    }


    public class CarGitChecks{

        public DriveTrain drive;

        public void tearDown(){
            System.out.println("Tear Down");
        }


    }


    public void aMethod() {
        int i = 0;
        while (i < 10) {
            i++;
        }
    }



}
