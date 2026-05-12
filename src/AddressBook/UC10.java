package AddressBook;

import java.util.HashMap;

public class UC10 {

    public static void main(String[] args) {

        HashMap<String, Integer> cityCount = new HashMap<>();

        cityCount.put("Chennai", 2);
        cityCount.put("Hyderabad", 1);

        System.out.println("Count By City:");

        for (String city : cityCount.keySet()) {

            System.out.println(city + " : " + cityCount.get(city));
        }
    }
}