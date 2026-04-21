import java.util.Random;

class Main {

    // UC7 → Class Variables
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    // UC7 → Class Method
    static int computeEmployeeWage() {

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        Random random = new Random();

        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {

            totalDays++;

            // UC1 → Attendance check
            int attendance = random.nextInt(3); 
            // 0 = Absent, 1 = Part-time, 2 = Full-time

            int hoursWorked = 0;

            // UC4 → Switch case
            switch (attendance) {
                case 1:
                    hoursWorked = PART_TIME_HOURS; // UC3
                    break;
                case 2:
                    hoursWorked = FULL_TIME_HOURS; // UC2
                    break;
                default:
                    hoursWorked = 0;
            }

            totalHours += hoursWorked;

            // UC2 → Daily Wage calculation
            int dailyWage = hoursWorked * WAGE_PER_HOUR;

            totalWage += dailyWage;

            // (Optional Debug Output)
            System.out.println("Day " + totalDays +
                    " | Hours: " + hoursWorked +
                    " | Daily Wage: " + dailyWage);
        }

        // UC6 → Stop by condition
        return totalWage;
    }

    public static void main(String[] args) {

        // UC0 → Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC7 → Call method
        int totalSalary = computeEmployeeWage();

        // UC5 → Monthly Wage output
        System.out.println("\nTotal Employee Wage for Month: " + totalSalary);
    }
}