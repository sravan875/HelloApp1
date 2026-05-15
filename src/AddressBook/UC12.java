package AddressBookStream;

import java.util.ArrayList;
import java.util.Collections;

public class UC12 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Bangalore");

        Collections.sort(cities);

        System.out.println("Sorted Cities:");

        cities.forEach(System.out::println);
    }
}