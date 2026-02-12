
package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Class4_topic01_IntroductionToJDBC {

    public static void main(String[] args) {

        // JDBC stands for Java Database Connectivity
        // JDBC is an API provided by Java to interact with databases
        // JDBC allows Java code to send SQL commands to database
    	/*
    	 * Add the JAR to your project

			In Eclipse:
			
			Right-click your project
			
			Properties
			
			Java Build Path
			
			Libraries tab
			
			Add External JARs
			
			Select mysql-connector-j-8.0.xx.jar
			
			Apply and Close
    	 */

        try {
            // Step 1: Load JDBC Driver class
            // This registers the driver with DriverManager
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection with database
            // URL contains protocol, database type, host, port 
            //and DB name
            //Connect to MySQL running on localhost at port 3306 
            //and open the database named training_db
            //root → MySQL username
            //root → password for that user
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db",
                    "root",
                    "root"
            );

            // If connection is successful, below line executes
            System.out.println("JDBC connection established");

            // Step 3: Close connection after use
            con.close();

        } 
        catch (Exception e) {
            System.out.println("JDBC connection failed");
            e.printStackTrace();   // THIS IS NON-NEGOTIABLE
        }

    }

    /*
     OUTPUT:
     JDBC connection established

     OUTPUT EXPLANATION:
     Java program connected to database using JDBC API.
    */
}
