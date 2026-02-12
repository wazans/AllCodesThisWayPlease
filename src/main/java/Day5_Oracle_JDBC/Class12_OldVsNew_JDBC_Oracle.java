package Day5_Oracle_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;

public class Class12_OldVsNew_JDBC_Oracle {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM";
        String pass = "root";

        try {
            // -------- OLD JDBC WAY --------
            // Step 1: Load driver manually
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Step 2: Create connection
            Connection con1 = DriverManager.getConnection(url, user, pass);
            System.out.println("Old JDBC connection successful");
            con1.close();

            // -------- JDBC 4.0 WAY --------
            // Step 3: No driver loading required
            Connection con2 = DriverManager.getConnection(url, user, pass);
            System.out.println("JDBC 4.0 connection successful");
            con2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}