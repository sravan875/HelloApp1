import java.util.*;

class UC14 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("TCS", 3200);
        map.put("Infosys", 4000);

        System.out.println("TCS Wage: " + map.get("TCS"));
    }
}