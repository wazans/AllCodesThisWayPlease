package Day5_Oracle_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class7_Batch_Update {
	
	 static Statement stmt=null;
	

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM";
        String pass = "root";

        try {
            // Step 1: Create connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Step 2: Disable auto-commit
            con.setAutoCommit(false);

            // Step 3: Create statement
             stmt = con.createStatement();
            
            
            //
             stmt = con.createStatement();

           
            stmt.execute(
                    "CREATE TABLE emp_jdbc008(" +
                    "id NUMBER PRIMARY KEY, " +
                    "name VARCHAR2(50), " +
                    "salary NUMBER)"
            );

            // Step 4: Add multiple SQL statements to batch
            stmt.addBatch("INSERT INTO emp_jdbc008 VALUES (101,'A',30000)");
            stmt.addBatch("INSERT INTO emp_jdbc008 VALUES (102,'B',40000)");
            stmt.addBatch("INSERT INTO emp_jdbc008 VALUES (103,'C',50000)");

            // Step 5: Execute batch
            stmt.executeBatch();

            // Step 6: Commit transaction
            con.commit();

            // Step 7: Close resources
            stmt.close();
            con.close();

            System.out.println("Batch execution successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}