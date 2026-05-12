
package AddressBook;

import java.util.HashMap;

public class UC6 {

    public static void main(String[] args) {

        HashMap<String, String> addressBooks = new HashMap<>();

        addressBooks.put("Friends", "Rahul");
        addressBooks.put("Family", "Arun");

        System.out.println(addressBooks);
    }
}