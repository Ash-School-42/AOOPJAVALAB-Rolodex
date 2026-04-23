/**
 * Name: James Ash
 * Date: 04-21-2026
 * Assignment: 3.2 Week 3 Project
 * 
 * Represents a family contact
 **/

public class FamilyContact extends Contact {

    // Private variable for relationship
    private String relationship;

    // Constructor
    public FamilyContact(String name, PhoneNumber phoneNumber, String relationship) {
        super(name, phoneNumber); // call parent constructor
        this.relationship = relationship;
    }

    // Display family contact info
    @Override
    public void display() {
        System.out.println("Family Contact:");
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNumber().getFullNumber());
        System.out.println("Relationship: " + relationship);
        System.out.println("----------------------");
    }
}
