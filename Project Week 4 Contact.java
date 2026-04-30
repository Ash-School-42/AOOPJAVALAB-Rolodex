/**
 * Name: James Ash
 * Date: 04-30-2026
 * Assignment: 4.2 Week 4 Project
 * 
 * Base class for all contacts (uses composition + interface)
 **/
public class Contact implements Displayable {

    // Stores contact name
    String name; 
    // Stores contact email
    String email; 
    // Composition: Contact HAS-A PhoneNumber
    PhoneNumber phone; 

    public Contact(String name, String email, String phoneNumber) {

        // Set name
        this.name = name;
         // Set email
        this.email = email;
        // Create phone object
        this.phone = new PhoneNumber(phoneNumber);
    }

    public void display() {

        // Print name
        System.out.println("Name: " + name);
         // Print email
        System.out.println("Email: " + email);
         // Print phone number
        System.out.println("Phone: " + phone.number);
    }
}
