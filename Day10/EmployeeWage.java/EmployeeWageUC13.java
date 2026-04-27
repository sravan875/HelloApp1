import java.util.*;

class UC13 {
    public static void main(String[] args) {
        ArrayList<Integer> daily = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < 20; i++) {
            int wage = 8 * 20;
            daily.add(wage);
            total += wage;
        }

        System.out.println("Daily Wages: " + daily);
        System.out.println("Total: " + total);
    }
}