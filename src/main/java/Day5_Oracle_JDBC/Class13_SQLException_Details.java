package Day5_Oracle_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Class13_SQLException_Details {

    public static void main(String[] args) {

        try {
            // Step 1: Create connection with wrong table name
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            Statement stmt = con.createStatement();

            // Step 2: Execute wrong SQL to force exception
            stmt.executeUpdate("INSERT INTO wrong_table VALUES (1)");

        } catch (SQLException e) {

            // Step 3: Print detailed exception information
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Message: " + e.getMessage());

            // Step 4: Handle chained exceptions
            SQLException next = e.getNextException();
            if (next != null) {
                System.out.println("Next Exception: " + next.getMessage());
            }
        }
    }
}