package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class4_topic07_TransactionManagement {

    public static void main(String[] args) {

        /*
         TRANSACTION MANAGEMENT IN JDBC

         - A transaction is a group of SQL statements executed as ONE unit.
         - commit()  → saves all changes permanently
         - rollback() → cancels all changes if any error occurs
        */

        Connection con = null;

        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish database connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db",
                    "root",
                    "root"
            );

            // Step 3: Disable auto-commit (start transaction)
            con.setAutoCommit(false);

            // Step 4: Create table using Statement
            Statement stmt = con.createStatement();
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS demo (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "course VARCHAR(50))"
            );

            // Step 5: Use PreparedStatement with COLUMN NAMES (IMPORTANT)
            PreparedStatement insertPs =
                    con.prepareStatement(
                            "INSERT INTO demo (id, name, course) VALUES (?, ?, ?)"
                    );

            // -------- First row --------
            insertPs.setInt(1, 10);
            insertPs.setString(2, "Aman new");
            insertPs.setString(3, "Java new");
            insertPs.executeUpdate();

            // -------- Second row --------
            insertPs.setInt(1, 20);
            insertPs.setString(2, "Neha");
            insertPs.setString(3, "Selenium");
            insertPs.executeUpdate();

            // Step 6: Commit transaction if all inserts succeed
            con.commit();

            System.out.println("Transaction committed successfully");

            // Step 7: Close connection
            con.close();

        } catch (Exception e) {

            // If any error occurs, rollback the transaction
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("Transaction rolled back");
            e.printStackTrace();
        }
    }

    /*
     OUTPUT:
     Transaction committed successfully

     TABLE demo AFTER EXECUTION:

     id | name      | course
     --------------------------
     10 | Aman new  | Java new
     20 | Neha      | Selenium

     OUTPUT EXPLANATION:
     - Auto-commit was disabled.
     - Both INSERT statements executed successfully.
     - commit() saved all rows permanently.
     - If any INSERT failed, rollback() would undo ALL changes.
    */
}
