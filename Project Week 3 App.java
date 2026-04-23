/**
 * Name: James Ash
 * Date: 04-21-2026
 * Assignment: 3.2 Week 3 Project
 * 
 * Main application class
 **/

public class App {

    public static void main(String[] args) {

        // Display title
        System.out.println("\nJames Ash - Week 3 Project\n");

        // Display welcome message
        System.out.println("Welcome to the Rolodex Application!");
        System.out.println("This program stores and displays contacts.\n");

        // Create phone number objects
        PhoneNumber phone1 = new PhoneNumber("757", "123-4567");
        PhoneNumber phone2 = new PhoneNumber("757", "987-6543");

        // Create contact objects
        Contact contact1 = new BusinessContact("Alice Johnson", phone1, "Tech Corp");
        Contact contact2 = new FamilyContact("Bob Smith", phone2, "Brother");

        // Display contact information
        contact1.display();
        contact2.display();
    }
}
