package Day5_Oracle_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class14_ResultSet_Update_Delete_Insert {

    public static void main(String[] args) {

        try {
            // 1️⃣ Create DB connection
            // Auto-commit is ON by default, so we turn it OFF
            // This allows us to control commit / rollback manually
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "SYSTEM",
                "root"
            );
            con.setAutoCommit(false);

            // 2️⃣ Create Statement with scrollable + updatable ResultSet
            // TYPE_SCROLL_INSENSITIVE -> cursor can move first/last/previous
            // CONCUR_UPDATABLE       -> allows update, insert, delete via ResultSet
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            // 3️⃣ Execute SELECT query
            // Table MUST have a PRIMARY KEY for updatable ResultSet
            ResultSet rs = stmt.executeQuery(
                "SELECT id, NAME, SALARY FROM emp_jdbc_demo"
            );

            /* ================= UPDATE ================= */

            // Move cursor to first row and check if row exists
            // If table is empty, rs.first() returns false
            if (rs.first()) {
                // Update salary column of current row
                rs.updateInt("salary", 89000);

                // Push the update to the database
                rs.updateRow();
            } else {
                System.out.println("No rows found to update");
            }

            /* ================= INSERT ================= */

            // Move cursor to special insert row (not a real DB row)
            rs.moveToInsertRow();

            // Set values for new row
            rs.updateInt("ID", 99);
            rs.updateString("NAME", "RowSetUser");
            rs.updateInt("SALARY", 70000);

            // Insert the new row into database
            rs.insertRow();

            // VERY IMPORTANT:
            // Move cursor back to the previous current row
            // Otherwise future operations may fail
            rs.moveToCurrentRow();

            /* ================= DELETE ================= */

            // Move cursor to last row and check if it exists
            if (rs.last()) {
                // Delete the current row from database
                rs.deleteRow();
            } else {
                System.out.println("No rows found to delete");
            }

            /* ================= COMMIT ================= */

            // Commit all changes (update + insert + delete)
            con.commit();

            // 4️⃣ Close resources (always in reverse order of creation)
            rs.close();
            stmt.close();
            con.close();

            System.out.println("Update, Insert, Delete completed successfully");

        } catch (Exception e) {
            // Rollback in case of any failure
            // Prevents partial updates
            e.printStackTrace();
        }
    }
}
