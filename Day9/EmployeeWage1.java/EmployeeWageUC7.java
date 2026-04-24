class EmployeeWageUC7 {

    static int wagePerHour = 20;
    static int maxHours = 100;
    static int maxDays = 20;

    static int calculateWage() {
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours <= maxHours && totalDays < maxDays) {
            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int hours = (empCheck == 1) ? 8 : (empCheck == 2) ? 4 : 0;

            totalHours += hours;
        }

        return totalHours * wagePerHour;
    }

    public static void main(String[] args) {
        System.out.println("Total Wage: " + calculateWage());
    }
}