/**
 * Name: James Ash
 * Date: 04-21-2026
 * Assignment: 3.2 Week 3 Project
 * 
 * Represents a business contact
 **/

public class BusinessContact extends Contact {

    // Private variable for company name
    private String company;

    // Constructor
    public BusinessContact(String name, PhoneNumber phoneNumber, String company) {
        super(name, phoneNumber); // call parent constructor
        this.company = company;
    }

    // Display business contact info
    @Override
    public void display() {
        System.out.println("Business Contact:");
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNumber().getFullNumber());
        System.out.println("Company: " + company);
        System.out.println("----------------------");
    }
}
