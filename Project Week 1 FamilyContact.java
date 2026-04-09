/**
 * Name: James Ash
 * Date: 2026-04-09
 * Assignmnet: 1.5 Week 1 Project
 *
 * This class represents a family contact.
 * It inherits from the Contact class (Inheritance)
 * and adds additional information specific to family members.
 **/
class FamilyContact extends Contact {

    // Variable to store the relationship
    String relationship;

    
    // Constructor for FamilyContact
    // Uses 'super' to call the parent (Contact) constructor
    FamilyContact(String name, String email, String phoneNumber, String relationship) {

        // Calls the constructor from the Contact class (Inheritance)
        super(name, email, phoneNumber);

        // Sets the relationship for this family contact
        this.relationship = relationship;
    }

    // Display method
    // Overrides the display() method from the Contact class
    void display() {

        // Calls the display method from the parent class
        super.display();

        // Displays additional family-specific information
        System.out.println("Type: Family");
        System.out.println("Relationship: " + relationship);

        // Separator line
        System.out.println("---------------------");
    }
}
