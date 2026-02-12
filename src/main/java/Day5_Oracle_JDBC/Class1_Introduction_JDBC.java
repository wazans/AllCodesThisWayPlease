
package Day5_Oracle_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 This class demonstrates:
 1. What JDBC is
 2. How to load Oracle JDBC driver
 3. How to create a database connection
*/
public class Class1_Introduction_JDBC {

    public static void main(String[] args) {

        try {
            // Step 1: Load Oracle JDBC Driver into JVM
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Step 2: Create connection using DriverManager
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE", // Oracle URL
                "SYSTEM",                              // DB username
                "root"                                 // DB password
            );

            // If connection is successful
            System.out.println("Oracle JDBC Connection Established");

            // Step 3: Close connection
            con.close();

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
