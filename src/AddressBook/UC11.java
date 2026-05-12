package AddressBook;

import java.util.ArrayList;
import java.util.Collections;

public class UC11 {

    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();

        contacts.add("Rahul");
        contacts.add("David");
        contacts.add("Arun");

        // Sort Contacts
        Collections.sort(contacts);

        System.out.println("Sorted Contacts:");

        for (String person : contacts) {

            System.out.println(person);
        }
    }
}