import java.sql.DriverManager;
import java.sql.Driver;
import java.util.Enumeration;

public class CheckJDBC {
    public static void main(String[] args) {
        try {
            // List all the available drivers
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            if (!drivers.hasMoreElements()) {
                System.out.println("No JDBC drivers found!");
            } else {
                while (drivers.hasMoreElements()) {
                    Driver driver = drivers.nextElement();
                    System.out.println("JDBC Driver Found: " + driver.getClass().getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Error checking JDBC drivers!");
            e.printStackTrace();
        }
    }
}
