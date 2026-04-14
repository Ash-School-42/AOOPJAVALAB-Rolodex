/**
 * Name: James Ash
 * Date: 04-14-2026
 * Assignment: 2.2 Week 2 Project
 * 
 * Main program for Rolodex application
 **/
public class App {

    public static void main(String[] args) {

        // Print a title and welcome message
        System.out.println("\nJames Ash -  Week 2 Rolodex App\n"); 
        System.out.println("Welcome to the Rolodex!\n"); 

        // Create business contact
        BusinessContact c1 = new BusinessContact(
                "Alice Johnson",
                "alice@email.com",
                "555-111-2222",
                "TechCorp"
        ); 
        
        // Create family contact
        FamilyContact c2 = new FamilyContact(
                "Bob Smith",
                "bob@email.com",
                "555-333-4444",
                "Brother"
        ); 

        // Polymorphism: parent reference array
        Contact[] contacts = { c1, c2 }; 

        // Section header
        System.out.println("Contacts:\n");

        // Polymorphism: calls correct version at runtime
        for (Contact c : contacts) {

            c.display();
        }

        // End message
        System.out.println("End of contact list.");
    }
}
