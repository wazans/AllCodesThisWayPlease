
package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class4_topic04_StatementPreparedStatement {

    public static void main(String[] args) {

        // Statement is used for simple SQL queries
        // PreparedStatement is used for parameterized queries
        // PreparedStatement prevents SQL Injection

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db","root","root");

            // Statement example
            Statement stmt = con.createStatement();
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS my_eclipse (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "course VARCHAR(50), " +
                    "fees INT)"
            );
            // PreparedStatement example
            PreparedStatement insertPs = con.prepareStatement(
                    "INSERT INTO my_eclipse (id, name, course, fees) VALUES (?, ?, ?, ?)"
            );

            // ---- Row 1 ----
            insertPs.setInt(1, 1);
            insertPs.setString(2, "Wasim");
            insertPs.setString(3, "Java");
            insertPs.setInt(4, 5000);
            insertPs.executeUpdate();

            // ---- Row 2 ----
            insertPs.setInt(1, 2);
            insertPs.setString(2, "Aman");
            insertPs.setString(3, "Selenium");
            insertPs.setInt(4, 6000);
            insertPs.executeUpdate();

            // ---- Row 3 ----
            insertPs.setInt(1, 3);
            insertPs.setString(2, "Neha");
            insertPs.setString(3, "API Testing");
            insertPs.setInt(4, 7000);
            insertPs.executeUpdate();

            // =======================
            // PREPAREDSTATEMENT – UPDATE
            // =======================

            PreparedStatement updatePs = con.prepareStatement(
                    "UPDATE my_eclipse SET fees = ? WHERE id = ?"
            );

            updatePs.setInt(1, 8000); // new fees
            updatePs.setInt(2, 1);    // update for id = 1
            updatePs.executeUpdate();

            System.out.println("Table created, multiple rows inserted, and data updated successfully");

            // Step 3: Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Statement / PreparedStatement error");
            e.printStackTrace();
        }
    }

    /*
     OUTPUT:
     Table created, multiple rows inserted, and data updated successfully

     TABLE DATA AFTER EXECUTION:
     id | name  | course        | fees
     -----------------------------------
     1  | Wasim | Java          | 8000
     2  | Aman  | Selenium      | 6000
     3  | Neha  | API Testing   | 7000

     OUTPUT EXPLANATION:
     - Statement created the table.
     - PreparedStatement inserted multiple rows safely.
     - PreparedStatement updated one row using parameters.
    */
}
