package Day9;
import java.util.*;

// UC1: Contact Class (Data)
class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    void display() {
        System.out.println(firstName + " " + lastName);
        System.out.println(address + ", " + city + ", " + state + " - " + zip);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}

// UC2–UC4: AddressBook Logic
class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    // UC2: Add Contact
    void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contact Added Successfully!");
    }

    // UC3: Edit Contact
    void editContact(String name, Scanner sc) {
        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(name)) {

                System.out.println("Enter new city:");
                c.city = sc.nextLine();

                System.out.println("Enter new phone:");
                c.phoneNumber = sc.nextLine();

                System.out.println("Contact Updated!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // UC4: Delete Contact
    void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.firstName.equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact Deleted!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // Display All
    void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
    }
}

// Main Class
public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("\n1.Add  2.Edit  3.Delete  4.Display  5.Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Contact c = new Contact();

                    System.out.print("First Name: ");
                    c.firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    c.lastName = sc.nextLine();

                    System.out.print("Address: ");
                    c.address = sc.nextLine();

                    System.out.print("City: ");
                    c.city = sc.nextLine();

                    System.out.print("State: ");
                    c.state = sc.nextLine();

                    System.out.print("Zip: ");
                    c.zip = sc.nextLine();

                    System.out.print("Phone: ");
                    c.phoneNumber = sc.nextLine();

                    System.out.print("Email: ");
                    c.email = sc.nextLine();

                    book.addContact(c);
                    break;

                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = sc.nextLine();
                    book.editContact(editName, sc);
                    break;

                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = sc.nextLine();
                    book.deleteContact(deleteName);
                    break;

                case 4:
                    book.displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}