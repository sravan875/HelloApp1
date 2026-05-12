package AddressBook;

import java.util.ArrayList;

public class UC8 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chennai - Rahul");
        cities.add("Hyderabad - Arun");
        cities.add("Chennai - David");

        System.out.println("Persons in Chennai:");

        for (String person : cities) {

            if (person.contains("Chennai")) {

                System.out.println(person);
            }
        }
    }
}