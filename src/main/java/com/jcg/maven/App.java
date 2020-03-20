package com.jcg.maven;

import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    public void newMethodGitchecks(){
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3


        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        String clean2 = str.replaceAll("|","_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_


    }

    public class Demo {
        private static final String DRIVER_CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private final Connection connection;

        public Demo(String msSqlServerUri) throws SQLException, ClassNotFoundException {
            Class.forName(DRIVER_CLASS_NAME);
            connection = DriverManager.getConnection(msSqlServerUri);
            Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "AppLogin", "");
            Connection conn2 = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true?user=user&password=");



            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                        "user=steve&password=blue"); // Sensitive
                String uname = "steve";
                String password = "blue";
                conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                        "user=" + uname + "&password=" + password); // Sensitive

                java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive


            String ip = "192.168.12.42"; // Noncompliant
            try {
                Socket socket = new Socket(ip, 6667);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
