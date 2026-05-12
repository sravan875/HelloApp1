
package AddressBook;

import java.util.ArrayList;

public class UC5 {

    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();

        contacts.add("Rahul");
        contacts.add("Arun");
        contacts.add("David");

        System.out.println("Multiple Contacts:");

        for (String person : contacts) {

            System.out.println(person);
        }
    }
}