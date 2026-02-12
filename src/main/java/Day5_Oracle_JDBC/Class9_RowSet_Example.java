package Day5_Oracle_JDBC;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Class9_RowSet_Example {

    public static void main(String[] args) {

        try {
            // Step 1: Create CachedRowSet object
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();

            // Step 2: Set database connection details
            crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
            crs.setUsername("SYSTEM");
            crs.setPassword("root");

            // Step 3: Set SQL command
            crs.setCommand("SELECT * FROM emp_jdbc2");

            // Step 4: Execute query (disconnected ResultSet)
            crs.execute();

            // Step 5: Move to first row
            crs.first();
            System.out.println("First employee: " + crs.getString("NAME"));

            // Step 6: Close RowSet
            crs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}