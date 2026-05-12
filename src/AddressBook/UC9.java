package AddressBook;

import java.util.HashMap;

public class UC9 {

    public static void main(String[] args) {

        HashMap<String, String> cityMap = new HashMap<>();

        cityMap.put("Rahul", "Chennai");
        cityMap.put("Arun", "Hyderabad");
        cityMap.put("David", "Chennai");

        System.out.println("View Persons By City:");

        for (String person : cityMap.keySet()) {

            System.out.println(person + " : " + cityMap.get(person));
        }
    }
}