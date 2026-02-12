package Day5_Oracle_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class8_Updatable_ResultSet {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM";
        String pass = "root";

        try {
            // Step 1: Create connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Step 2: Create updatable ResultSet
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );

            // Step 3: Execute query
            ResultSet rs = stmt.executeQuery("SELECT ID, NAME, SALARY FROM emp_jdbc2");

            // Step 4: Move to first row
            rs.first();

            // Step 5: Update salary column
            rs.updateInt("salary", 77777);

            // Step 6: Apply update to database
            rs.updateRow();

            // Step 7: Close resources
            rs.close();
            stmt.close();
            con.close();

            System.out.println("Row updated using ResultSet");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}