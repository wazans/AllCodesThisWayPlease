
package Class4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class4_topic06_DMLOperations {

    public static void main(String[] args) {

        // DML operations modify database data
        // INSERT, UPDATE and DELETE are DML commands

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training_db","root","root");

            Statement stmt = con.createStatement();

            //stmt.executeUpdate("INSERT INTO demo VALUES (2)");
            stmt.executeUpdate("UPDATE my_eclipse SET id=31 WHERE id=2");
            
            //stmt.executeUpdate("DELETE my_eclipse WHERE id=3");

            System.out.println("DML operations executed");

            con.close();

        } catch (Exception e) {
            System.out.println("DML failed");
            e.printStackTrace();
        }
    }

    /*
     OUTPUT:
     DML operations executed

     OUTPUT EXPLANATION:
     Database records inserted, updated and deleted.
    */
}
