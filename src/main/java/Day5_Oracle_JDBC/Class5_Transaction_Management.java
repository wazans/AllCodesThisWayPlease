package Day5_Oracle_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 Demonstrates TRANSACTION MANAGEMENT in Oracle JDBC

 IMPORTANT DB BEHAVIOR:
 1. INSERT is DML → controlled by setAutoCommit(false)
 2. COMMIT makes data permanent in DB for DML
 3. ROLLBACK undoes uncommitted DML only
 4. No DDL (table creation) happens in this program
*/
public class Class5_Transaction_Management {

    public static void main(String[] args) {

        Connection con = null;

        try {
            // Load Oracle JDBC Driver
            // Registers driver with JVM
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create DB connection
            // Opens a session with Oracle database
            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "SYSTEM",
                "root"
            );

            // Disable auto-commit
            // ✅ Applies ONLY to DML (INSERT / UPDATE / DELETE)
            // ❌ Does NOT affect DDL (CREATE / DROP / ALTER)
            con.setAutoCommit(false);

            // Prepare INSERT statement (DML)
            PreparedStatement ps =
                con.prepareStatement(
                    "INSERT INTO emp_jdbc VALUES (?, ?, ?)"
                );

            // Set values for INSERT
            ps.setInt(1, 3);          // id = 2
            ps.setString(2, "Nehal");  // name = Neha
            ps.setInt(3, 71000);      // salary = 60000

            // Execute INSERT
            // ✅ Row is added but NOT yet permanent
            // ✅ Can still be rolled back
            ps.executeUpdate();

            // ================= COMMIT =================
            // ✅ Makes INSERT permanent in database
            // ❌ Cannot be rolled back after this
            con.commit();

            System.out.println("Transaction committed");

            // Close connection
            // Ends DB session
            con.close();

        } catch (Exception e) {
            try {
                // ================= ROLLBACK =================
                // ❌ Undoes INSERT if COMMIT was NOT executed
                // ❌ Does nothing if COMMIT already happened
                con.rollback();
                System.out.println("Transaction rolled back");
            } catch (Exception ex) {}
        }
    }
}
