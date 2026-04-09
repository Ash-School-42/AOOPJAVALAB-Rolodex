/**
 * Name: James Ash
 * Date: 04-07-2026
 * Assignment: 1.5 Week 1 Project
 *
 * This class represents a business contact.
 * It inherits from the Contact class (Inheritance)
 * and adds additional information specific to business contacts.
 **/
class BusinessContact extends Contact {

    // Variable to store the company name
    String company;

    // Constructor for BusinessContact
    // Uses 'super' to call the parent (Contact) constructor
    BusinessContact(String name, String email, String phoneNumber, String company) {

        // Calls the constructor from the Contact class (Inheritance)
        super(name, email, phoneNumber);

        // Sets the company name for this business contact
        this.company = company;
    }

    // Display method
    // Overrides the display() method from the Contact class
    void display() {

        // Calls the display method from the parent class
        super.display();

        // Displays additional business-specific information
        System.out.println("Type: Business");
        System.out.println("Company: " + company);

        // Separator line
        System.out.println("---------------------");
    }
}
