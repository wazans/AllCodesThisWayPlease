package Day5_Oracle_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 Demonstrates ResultSet usage in Oracle JDBC

 IMPORTANT DB BEHAVIOR:
 1. SELECT is a DQL (Data Query Language) statement
 2. SELECT does NOT change database state
 3. SELECT does NOT create tables
 4. SELECT does NOT commit or rollback anything
*/
public class Class4_ResultSet {

    public static void main(String[] args) {

        try {
            // Load Oracle JDBC Driver
            // Registers Oracle driver with JVM
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create database connection
            // Opens a session with Oracle DB
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "SYSTEM",
                "root"
            );

            // Create Statement object
            // Used here only for SELECT (read-only operation)
            Statement stmt = con.createStatement();

            // ================= DQL =================
            // SELECT statement:
            // ✅ Reads data from emp_jdbc table
            // ❌ Does NOT create table
            // ❌ Does NOT modify data
            // ❌ Does NOT auto-commit
            // ❌ Does NOT participate in transactions
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM emp_jdbc"
            );

            // Iterate over ResultSet
            // rs.next() moves cursor row-by-row
            // Data is fetched from DB into 
            //JVM memory
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("salary")
                );
            }

            // Close connection
            // Ends DB session
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
