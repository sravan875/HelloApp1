class EmployeeWageUC6 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < 100 && totalDays < 20) {
            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int hours = (empCheck == 2) ? 8 : (empCheck == 1) ? 4 : 0;

            totalHours += hours;
            totalWage += hours * wagePerHour;
        }

        System.out.println("Total Wage: " + totalWage);
    }
}