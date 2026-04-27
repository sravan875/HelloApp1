import java.util.*;

class AddressBookSystem {
    HashMap<String, AddressBook> books = new HashMap<>();

    void addAddressBook(String name) {
        books.put(name, new AddressBook());
    }
}