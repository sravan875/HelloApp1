import java.util.*;

class Contact {
    String firstName, lastName, address, city, state, zip, phoneNumber, email;

    void display() {
        System.out.println(firstName + " " + lastName + " | " + city);
    }
}

class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contact Added!");
    }

    void displayContacts() {
        for (Contact c : contacts) {
            c.display();
        }
    }
}

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        System.out.println("Enter First Name:");
        String fn = sc.nextLine();

        Contact c = new Contact();
        c.firstName = fn;

        book.addContact(c);
        book.displayContacts();
    }
}