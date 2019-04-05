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

//TODO add another todo

    public void newMethodGitchecks(){
        int target = -5;
        int num = 3;
        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3
//TODO an issue

        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        String clean4 = str.replaceAll("|","_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_


    }

    public void setPriceGitChecks(int price) {
        assert price >= 0 && price <= MAX_PRICE;
        // Set the price
    }






}
