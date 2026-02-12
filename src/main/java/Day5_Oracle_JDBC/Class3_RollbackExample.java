package Day5_Oracle_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 Demonstrates Oracle JDBC transaction behavior:

 1. DDL (CREATE / DROP / ALTER)
    ❌ NOT controlled by setAutoCommit(false)
    ❌ NOT rollback-able
    ✅ Oracle performs IMPLICIT COMMIT

 2. DML (INSERT / UPDATE / DELETE)
    ✅ Controlled by setAutoCommit(false)
    ✅ Can be COMMIT or ROLLBACK manually
*/
public class Class3_RollbackExample {

    public static void main(String[] args) throws SQLException {
    			Connection con = null;

        try {
            // Load Oracle JDBC driver
        	  con = DriverManager.getConnection(
                     "jdbc:oracle:thin:@localhost:1521/XE",
                     "SYSTEM",
                     "root");
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create database connection
             con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XE",
                    "SYSTEM",
                    "root"
            );

            // Disable auto-commit for DML statements
            // ⚠️ Applies ONLY to INSERT 
            // UPDATE / DELETE
            con.setAutoCommit(false);

            // Statement is generally used for DDL
            Statement stmt = con.createStatement();

            // ================= DDL =================
            // CREATE TABLE is a DDL statement
            // ❌ Oracle IMPLICITLY COMMITS before and after this
            // ❌ This change CANNOT be rolled back
            stmt.execute(
                    "CREATE TABLE emp_jdbc7 (" +
                    "id NUMBER PRIMARY KEY, " +
                    "name VARCHAR2(50), " +
                    "salary NUMBER)"
            );

            // ================= DML =================
            // PreparedStatement used for DML
            PreparedStatement ps =
                    con.prepareStatement(
                            "INSERT INTO emp_jdbc7 VALUES (?, ?, ?)"
                    );

            ps.setInt(1, 2);
            ps.setString(2, "D");
            ps.setInt(3, 60000);

            // INSERT executed
            // ✅ Data is NOT committed yet
            // ✅ Can still be rolled back
            ps.executeUpdate();

            // Force runtime error
            int x = 10 / 0;   // ArithmeticException

            // This line is never reached
            con.commit();

        } catch (Exception e) {
            
                // ================= ROLLBACK =================
                // ❌ INSERT is undone (DML rollback works)
                // ✅ TABLE still exists (DDL auto-commit in Oracle)
                con.rollback();
                System.out.println("Transaction rolled back");
            } 
        }
    }

