/**
 * Name: James Ash
 * Date: 04-14-2026
 * Assignment: 2.2 Week 2 Project
 * 
 * Family contact class (inheritance example)
 **/
public class FamilyContact extends Contact {

    // Stores relationship type
    String relationship;

    public FamilyContact(String name, String email, String phoneNumber, String relationship) {

        // Call parent constructor
        super(name, email, phoneNumber);

        // Set relationship
        this.relationship = relationship;
    }

    public void display() {

        // Display base info
        super.display(); 

        // Show contact type
        System.out.println("Type: Family");

        // Show relationship
        System.out.println("Relationship: " + relationship);

        // Separator line
        System.out.println("---------------------"); 
    }
}
