package AddressBook;

import java.util.ArrayList;

public class UC7 {

    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();

        String person1 = "Rahul";
        String person2 = "Rahul";

        // Add First Contact
        contacts.add(person1);

        // Check Duplicate
        if (contacts.contains(person2)) {

            System.out.println("Duplicate Contact Found");

        } else {

            contacts.add(person2);

            System.out.println("Contact Added");
        }

        System.out.println(contacts);
    }
}