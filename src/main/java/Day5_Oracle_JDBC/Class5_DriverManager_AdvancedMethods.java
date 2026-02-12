package Day5_Oracle_JDBC;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

/*
 Demonstrates DriverManager advanced methods

 IMPORTANT DB BEHAVIOR:
 1. This program DOES NOT connect to the database
 2. This program DOES NOT create tables
 3. This program DOES NOT execute SQL
 4. This program DOES NOT commit or rollback anything

 It only inspects JDBC drivers loaded in JVM memory
*/
public class Class5_DriverManager_AdvancedMethods {

    public static void main(String[] args) {

        try {
            // ================= JVM LEVEL =================
            // DriverManager maintains a list of JDBC drivers
            // that are REGISTERED with the JVM (not the DB)

            // Step 1: Fetch all registered JDBC drivers
            // This does NOT open DB connection
            Enumeration<Driver> drivers = DriverManager.getDrivers();

            // Step 2: Iterate over registered drivers
            // This reads driver metadata from JVM memory
            while (drivers.hasMoreElements()) {
                Driver d = drivers.nextElement();

                // Prints fully qualified driver class name
                // Example: oracle.jdbc.driver.OracleDriver
                System.out.println(
                        "Registered Driver: " + d.getClass().getName()
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
