/**
 * Name: James Ash
 * Date: 04-30-2026
 * Assignment: Week 4 Rolodex Database App
 * 
 * Main program with menu and user interaction
 **/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DatabaseManager db = new DatabaseManager();

        // Title
        System.out.println("\nJames Ash - Week 4 Rolodex Database App\n");
        System.out.println("Welcome! Manage your contacts using the database.\n");

        int choice = 0;

        while (choice != 5) {

            // Menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    // Get basic info
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();

                    // Choose type
                    System.out.println("Contact Type:");
                    System.out.println("1. Business");
                    System.out.println("2. Family");
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine();

                    String type = "";
                    String extra = "";

                    if (typeChoice == 1) {
                        type = "Business";
                        System.out.print("Company: ");
                        extra = scanner.nextLine();
                    } else {
                        type = "Family";
                        System.out.print("Relationship: ");
                        extra = scanner.nextLine();
                    }

                    db.addContact(name, email, phone, type, extra);
                    break;

                case 2:
                    db.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New Phone: ");
                    String newPhone = scanner.nextLine();

                    db.updateContact(updateId, newPhone);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();

                    db.deleteContact(deleteId);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
