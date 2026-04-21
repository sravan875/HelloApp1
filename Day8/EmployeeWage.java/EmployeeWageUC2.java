class EmployeeWageUC2 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;

        int isPresent = (int)(Math.random() * 2);

        if (isPresent == 1) {
            int dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee Absent. Wage = 0");
        }
    }
}