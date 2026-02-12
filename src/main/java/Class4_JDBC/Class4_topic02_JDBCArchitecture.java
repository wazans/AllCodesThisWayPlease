
package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Class4_topic02_JDBCArchitecture {

    public static void main(String[] args) {

        // JDBC Architecture components:
        // 1. Java Application
        // 2. JDBC API
        // 3. JDBC Driver
        // 4. Database

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager selects suitable driver internally
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db","root","root");

            System.out.println("JDBC architecture working");

            con.close();

        } catch (Exception e) {
            System.out.println("Architecture error");
        }
    }

    /*
     OUTPUT:
     JDBC architecture working

     OUTPUT EXPLANATION:
     Java → JDBC API → Driver → Database flow executed.
    */
}
