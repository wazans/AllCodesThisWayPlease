
package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class4_topic05_ResultSetRowSet {

    public static void main(String[] args) {

        // ResultSet holds data returned from SELECT query
        // Cursor moves using next() method

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db","root","root");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM my_eclipse");

            while (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("ID = " + id);
            }

            con.close();

        } catch (Exception e) {
            System.out.println("ResultSet error");
        }
    }

    /*
     OUTPUT:
     ID = 1

     OUTPUT EXPLANATION:
     ResultSet reads records one row at a time.
    */
}
