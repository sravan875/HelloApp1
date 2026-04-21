class EmployeeWageUC7 {

    static final int WAGE_PER_HOUR = 20;
    static final int MAX_HOURS = 100;
    static final int MAX_DAYS = 20;

    static int computeWage() {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int hours = (empCheck == 2) ? 8 : (empCheck == 1) ? 4 : 0;

            totalHours += hours;
            totalWage += hours * WAGE_PER_HOUR;
        }

        return totalWage;
    }

    public static void main(String[] args) {
        int wage = computeWage();
        System.out.println("Total Employee Wage: " + wage);
    }
}