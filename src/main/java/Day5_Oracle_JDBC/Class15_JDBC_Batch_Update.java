package Day5_Oracle_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class15_JDBC_Batch_Update {

    public static void main(String[] args) {

        try {
            // Step 1: Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            // Step 2: Disable auto-commit
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            // Step 3: Add SQL statements to batch
            stmt.addBatch("INSERT INTO employee VALUES (101,'A',10000)");
            stmt.addBatch("INSERT INTO employee VALUES (102,'B',20000)");
            stmt.addBatch("INSERT INTO employee VALUES (103,'C',30000)");

            // Step 4: Execute batch
            stmt.executeBatch();

            // Step 5: Commit transaction
            con.commit();

            // Step 6: Close resources
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}