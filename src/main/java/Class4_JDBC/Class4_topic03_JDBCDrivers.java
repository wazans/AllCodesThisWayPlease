
package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Class4_topic03_JDBCDrivers {

    public static void main(String[] args) {

        // JDBC Driver Types:
        // Type 1: JDBC-ODBC Bridge (Deprecated)
        // Type 2: Native API Driver
        // Type 3: Network Protocol Driver
        // Type 4: Thin Driver (Pure Java)

        try {
            // MySQL uses Type 4 JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db","root","root");

            System.out.println("Type 4 JDBC Driver executed");

            con.close();

        } catch (Exception e) {
            System.out.println("Driver execution failed");
        }
    }

    /*
     OUTPUT:
     Type 4 JDBC Driver executed

     OUTPUT EXPLANATION:
     Type 4 driver works without native libraries.
    */
}
