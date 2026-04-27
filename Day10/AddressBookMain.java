import java.util.*;

// UC1: Contact Class
class Contact {
    String firstName, lastName, address, city, state, zip, phone, email;

    Contact(String firstName, String lastName, String address, String city,
            String state, String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println(firstName + " " + lastName + " | " + city + " | " + phone);
    }
}

// UC2–UC5: AddressBook Class
class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact
    void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contact added successfully!");
    }

    // Display All Contacts
    void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (Contact c : contacts) {
            c.display();
        }
    }

    // UC3: Edit Contact
    void editContact(String name, Scanner sc) {
        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(name)) {
                System.out.print("Enter new city: ");
                c.city = sc.nextLine();
                System.out.print("Enter new phone: ");
                c.phone = sc.nextLine();
                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // UC4: Delete Contact
    void deleteContact(String name) {
        Iterator<Contact> itr = contacts.iterator();
        while (itr.hasNext()) {
            Contact c = itr.next();
            if (c.firstName.equalsIgnoreCase(name)) {
                itr.remove();
                System.out.println("Contact deleted!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}

// UC6: Multiple AddressBooks using HashMap
class AddressBookSystem {
    HashMap<String, AddressBook> books = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    void createAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        books.put(name, new AddressBook());
        System.out.println("Address Book created!");
    }

    AddressBook getBook() {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        return books.get(name);
    }
}

// MAIN CLASS
public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("\n1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    system.createAddressBook();
                    break;

                case 2: {
                    AddressBook book = system.getBook();
                    if (book == null) {
                        System.out.println("Address Book not found.");
                        break;
                    }

                    System.out.print("First Name: ");
                    String f = sc.nextLine();
                    System.out.print("Last Name: ");
                    String l = sc.nextLine();
                    System.out.print("Address: ");
                    String a = sc.nextLine();
                    System.out.print("City: ");
                    String c = sc.nextLine();
                    System.out.print("State: ");
                    String s = sc.nextLine();
                    System.out.print("Zip: ");
                    String z = sc.nextLine();
                    System.out.print("Phone: ");
                    String p = sc.nextLine();
                    System.out.print("Email: ");
                    String e = sc.nextLine();

                    book.addContact(new Contact(f, l, a, c, s, z, p, e));
                    break;
                }

                case 3: {
                    AddressBook book = system.getBook();
                    if (book != null)
                        book.displayContacts();
                    else
                        System.out.println("Address Book not found.");
                    break;
                }

                case 4: {
                    AddressBook book = system.getBook();
                    if (book != null) {
                        System.out.print("Enter name to edit: ");
                        String name = sc.nextLine();
                        book.editContact(name, sc);
                    }
                    break;
                }

                case 5: {
                    AddressBook book = system.getBook();
                    if (book != null) {
                        System.out.print("Enter name to delete: ");
                        String name = sc.nextLine();
                        book.deleteContact(name);
                    }
                    break;
                }

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}