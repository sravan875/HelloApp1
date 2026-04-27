public class UC5 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int totalWage = 0;

        for (int day = 1; day <= 20; day++) {
            totalWage += 8 * wagePerHour;
        }

        System.out.println("Monthly Wage: " + totalWage);
    }
}