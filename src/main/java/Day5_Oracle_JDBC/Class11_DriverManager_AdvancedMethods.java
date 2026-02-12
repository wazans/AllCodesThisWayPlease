package Day5_Oracle_JDBC;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Class11_DriverManager_AdvancedMethods {

    public static void main(String[] args) {

        try {
            // Step 1: Get all registered JDBC drivers
            Enumeration<Driver> drivers = DriverManager.getDrivers();

            // Step 2: Loop through drivers and print driver class names
            while (drivers.hasMoreElements()) {
                Driver d = drivers.nextElement();
                System.out.println("Registered Driver: " + d.getClass().getName());
            }

            // Step 3: Get specific driver using URL
            Driver driver = DriverManager.getDriver("jdbc:oracle:thin:@localhost:1521:xe");
            System.out.println("Driver for URL: " + driver.getClass().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}