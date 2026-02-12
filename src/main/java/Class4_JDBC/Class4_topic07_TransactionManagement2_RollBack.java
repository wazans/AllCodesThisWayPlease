package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class4_topic07_TransactionManagement2_RollBack {

    public static void main(String[] args) {

        /*
         TRANSACTION MANAGEMENT IN JDBC

         - Transaction = group of SQL statements executed as ONE unit
         - commit()   → saves ALL changes permanently
         - rollback() → cancels ALL changes if any error occurs

         In this example:
         - First INSERT will succeed
         - Second INSERT will FAIL (duplicate primary key)
         - rollback() will undo the first INSERT
        */

        Connection con = null;

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db",
                    "root",
                    "root"
            );

            // Step 3: Disable auto-commit mode
            // Now all SQL statements belong to ONE transaction
            con.setAutoCommit(false);

            // Step 4: Create table
            Statement stmt = con.createStatement();
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS demo (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "course VARCHAR(50))"
            );

            // Step 5: Prepare INSERT statement
            PreparedStatement insertPs =
                    con.prepareStatement(
                            "INSERT INTO demo (id, name, course) VALUES (?, ?, ?)"
                    );

            // ---------- INSERT 1 (will succeed) ----------
            insertPs.setInt(1, 10);
            insertPs.setString(2, "Aman");
            insertPs.setString(3, "Java");
            insertPs.executeUpdate();

            // ---------- INSERT 2 (FORCED ERROR) ----------
            // Same primary key (10) → causes SQL exception
            insertPs.setInt(1, 10);
            insertPs.setString(2, "Neha");
            insertPs.setString(3, "Selenium");
            insertPs.executeUpdate();

            // Step 6: If ALL statements succeed, commit transaction
            // (This line will NOT execute because of the error above)
            con.commit();

            System.out.println("Transaction committed successfully");

        } catch (Exception e) {

            /*
             If ANY exception occurs:
             - rollback() is called
             - ALL changes made in this transaction are undone
             */
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction rolled back");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {

            // Step 7: Close connection (always)
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
     EXPECTED OUTPUT:
     Transaction rolled back

     TABLE demo AFTER EXECUTION:
     (NO ROWS)

     OUTPUT EXPLANATION:
     - First INSERT succeeded
     - Second INSERT failed (duplicate primary key)
     - rollback() removed the first INSERT
     - Database remains unchanged
    */
}
