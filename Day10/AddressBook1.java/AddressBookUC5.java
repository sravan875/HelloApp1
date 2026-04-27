import java.util.*;

class AddressBook {
    ArrayList<Contact> list = new ArrayList<>();

    void addContact(Contact c) {
        list.add(c);
    }

    void display() {
        for (Contact c : list) {
            System.out.println(c.firstName + " " + c.lastName);
        }
    }
}