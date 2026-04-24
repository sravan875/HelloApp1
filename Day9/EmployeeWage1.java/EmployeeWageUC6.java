class EmployeeWageUC6 {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours <= 100 && totalDays < 20) {

            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int hours = (empCheck == 1) ? 8 : (empCheck == 2) ? 4 : 0;

            totalHours += hours;
        }

        int totalWage = totalHours * wagePerHour;
        System.out.println("Total Wage: " + totalWage);
    }
}