package busticketbookingmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Manages the database connection for the Bus Ticket Booking Management System.
 * This class provides the functionality to connect to a MySQL database using JDBC.
 * 
 * @author Saurabh Pardeshi
 */
public class database {
    
    /**
     * Establishes and returns a connection to the MySQL database.
     * This method loads the JDBC driver and attempts to connect to the database using a specified URL, username, and password.
     * 
     * @return A Connection object representing the database connection.
     */
    public static Connection connectDb(){
        
        try{
            // Loading the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establishing a connection to the database
            // Replace with your database URL, username, and password
            Connection connect = DriverManager.getConnection("jdbc:mysql://www.papademas.net:3307/510fp?autoReconnect=true&useSSL=false", "fp510", "510"); 
            return connect;
        } catch(Exception e) {
            // Handling any exceptions during database connection
            e.printStackTrace();
        }
        // Returning null if the connection fails
        return null;
    }
}
