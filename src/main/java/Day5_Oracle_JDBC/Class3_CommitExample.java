package Day5_Oracle_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 Demonstrates:
 1. Statement  -> Used for DDL (CREATE TABLE)
 2. PreparedStatement -> Used for DML (INSERT)
 3. setAutoCommit(false) -> Manual transaction control
 4. COMMIT -> Makes changes permanent in database
*/
public class Class3_CommitExample {

    public static void main(String[] args) {

        try {
            // 1️⃣ Load Oracle JDBC Driver
            // This registers Oracle driver with DriverManager
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2️⃣ Create DB connection
            // A physical connection is opened with Oracle DB
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XE",
                    "SYSTEM",
                    "root"
            );

            // 3️ Disable auto-commit
            // Now DB will NOT save changes automatically
            // You must explicitly COMMIT or ROLLBACK
            con.setAutoCommit(false);

            // 4️⃣ Create Statement object
            // Used mainly for DDL statements (CREATE, DROP, ALTER)
            Statement stmt = con.createStatement();

            // 5️⃣ Execute CREATE TABLE
            // 🔹 Table structure is created
            // 🔹 NOT permanently saved yet (because auto-commit = false)
            stmt.execute(
                    "CREATE TABLE emp_jdbc3 (" +
                    "id NUMBER PRIMARY KEY, " +
                    "name VARCHAR2(50), " +
                    "salary NUMBER)"
            );

            // 6️. Prepare SQL INSERT statement
            // PreparedStatement prevents SQL Injection
            // SQL is precompiled by Oracle
            PreparedStatement ps =
                    con.prepareStatement(
                            "INSERT INTO emp_jdbc3 VALUES (?, ?, ?)"
                    );

            // 7️⃣ Set values for placeholders (?)
            ps.setInt(1, 1);            // id = 1
            ps.setString(2, "Aman");    // name = Aman
            ps.setInt(3, 50000);        // salary = 50000

            // 8️. Execute INSERT
            // 🔹 Row is inserted
            // 🔹 Still NOT permanent
            ps.executeUpdate();

            // 9️ COMMIT transaction
            // ✅ TABLE creation + INSERT are saved permanently
            con.commit();

            System.out.println("Table created and data committed successfully");

            // 🔟 Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
