package busticketbookingmanagementsystem;

import java.sql.Date;

/**
 * Represents a bus in the Bus Ticket Booking Management System.
 * This class stores information about a bus, including its ID, location, status, price, and date.
 * 
 * @author Saurabh Pardeshi
 */
public class busData {
    
    // Member variable to store the unique ID of the bus
    private Integer busId;

    // Member variable to store the location of the bus
    private String location;

    // Member variable to store the current status of the bus (e.g., active, inactive)
    private String status;

    // Member variable to store the price associated with the bus
    private Double price;

    // Member variable to store the date related to the bus information
    private Date date;
    
    /**
     * Constructor to initialize a busData object with provided values.
     * 
     * @param busId The unique ID of the bus.
     * @param location The location of the bus.
     * @param status The current status of the bus.
     * @param price The price associated with the bus.
     * @param date The date related to the bus information.
     */
    public busData(Integer busId, String location, String status, Double price, Date date){
        this.busId = busId;
        this.location = location;
        this.status = status;
        this.price = price;
        this.date = date;
    }
    
    // Getter method to retrieve the bus ID
    public Integer getBusId(){
        return busId;
    }

    // Getter method to retrieve the location of the bus
    public String getLocation(){
        return location;
    }

    // Getter method to retrieve the current status of the bus
    public String getStatus(){
        return status;
    }

    // Getter method to retrieve the price of the bus
    public Double getPrice(){
        return price;
    }

    // Getter method to retrieve the date related to the bus
    public Date getDate(){
        return date;
    }
}