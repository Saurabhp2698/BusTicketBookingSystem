package busticketbookingmanagementsystem;

import java.sql.Date;

/**
 * Represents customer data in the Bus Ticket Booking Management System.
 * This class stores information about a customer, including personal details and ticket booking details.
 * 
 * @author Saurabh Pardeshi
 */
public class customerData {
    
    // Member variable for the unique customer number
    private Integer customerNum;

    // Member variables for the customer's first and last names
    private String firstName;
    private String lastName;

    // Member variable for the customer's gender
    private String gender;

    // Member variable for the customer's phone number
    private String phoneNum;

    // Member variable for the bus ID associated with the customer's booking
    private Integer busId;

    // Member variable for the location related to the customer's booking
    private String location;

    // Member variable for the type of ticket booked (e.g., economy, business)
    private String type;

    // Member variable for the seat number booked by the customer
    private Integer seatNum;

    // Member variable for the total amount paid by the customer
    private Double total;

    // Member variable for the date of the customer's booking
    private Date date;
    

    public customerData(Integer customerNum, String firstName, String lastName, String gender, String phoneNum, Integer busId, String location, String type, Integer seatNum, Double total, Date date){
        this.customerNum = customerNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.busId = busId;
        this.location = location;
        this.type = type;
        this.seatNum = seatNum;
        this.total = total;
        this.date = date;
    }
    
    public Integer getCustomerNum(){
        return customerNum;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public Integer getBusId(){
        return busId;
    }
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    public Integer getSeatNum(){
        return seatNum;
    }
    public Double getTotal(){
        return total;
    }
    public Date getDate(){
        return date;
    }
    
}
