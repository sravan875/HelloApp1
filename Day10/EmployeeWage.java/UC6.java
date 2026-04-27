public class UC6 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int totalHours = 0, totalDays = 0, totalWage = 0;

        while (totalHours < 100 && totalDays < 20) {
            totalDays++;
            int hours = 8;
            totalHours += hours;
            totalWage += hours * wagePerHour;
        }

        System.out.println("Total Wage: " + totalWage);
    }
}