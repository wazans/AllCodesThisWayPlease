package Day5_Oracle_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Class6_SQLException_Details {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM";
        String pass = "root";

        try {
            // Step 1: Create connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Step 2: Create statement
            Statement stmt = con.createStatement();

            // Step 3: Execute WRONG SQL to force exception
            stmt.executeUpdate("INSERT INTO wrong_table VALUES (1)");

        } catch (SQLException e) {

            // Step 4: Print SQL error code
            System.out.println("Error Code: " + e.getErrorCode());

            // Step 5: Print SQL state
            System.out.println("SQL State: " + e.getSQLState());

            // Step 6: Print error message
            System.out.println("Message: " + e.getMessage());

            // Step 7: Handle chained exceptions
            SQLException next = e.getNextException();
            if (next != null) {
                System.out.println("Next Exception Message: " + next.getMessage());
            }
        }
    }
}