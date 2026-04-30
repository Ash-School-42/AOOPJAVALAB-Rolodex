/**
 * Name: James Ash
 * Date: 04-30-2026
 * Asssignment: 4.2 Week 4 Project
 * 
 * Handles SQLite database connection and CRUD operations
 **/

import java.sql.*;

public class DatabaseManager {

    private Connection conn; // database connection

    // Constructor
    public DatabaseManager() {
        try {
            // Load SQLite driver
            Class.forName("org.sqlite.JDBC");

            // Connect to database
            conn = DriverManager.getConnection("jdbc:sqlite:contacts.db");

            // Create table if it does not exist
            createTable();

        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    // Create table
    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS contacts ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT, "
                + "email TEXT, "
                + "phone TEXT, "
                + "type TEXT, "
                + "extra TEXT)";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    // CREATE
    public void addContact(String name, String email, String phone, String type, String extra) {
        String sql = "INSERT INTO contacts(name, email, phone, type, extra) VALUES(?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, phone);
            pstmt.setString(4, type);
            pstmt.setString(5, extra);
            pstmt.executeUpdate();
            System.out.println("Contact added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding contact: " + e.getMessage());
        }
    }

    // READ
    public void viewContacts() {
        String sql = "SELECT * FROM contacts";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nContacts:\n");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String type = rs.getString("type");
                String extra = rs.getString("extra");

                // Polymorphism: create correct object type
                Contact c;
                if (type.equalsIgnoreCase("Business")) {
                    c = new BusinessContact(name, email, phone, extra);
                } else {
                    c = new FamilyContact(name, email, phone, extra);
                }

                System.out.print(id + " | ");
                c.display(); // uses overridden display
            }

        } catch (SQLException e) {
            System.out.println("Error reading contacts: " + e.getMessage());
        }
    }

    // UPDATE
    public void updateContact(int id, String newPhone) {
        String sql = "UPDATE contacts SET phone = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newPhone);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Contact updated.");
        } catch (SQLException e) {
            System.out.println("Error updating contact: " + e.getMessage());
        }
    }

    // DELETE
    public void deleteContact(int id) {
        String sql = "DELETE FROM contacts WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Contact deleted.");
        } catch (SQLException e) {
            System.out.println("Error deleting contact: " + e.getMessage());
        }
    }
}
