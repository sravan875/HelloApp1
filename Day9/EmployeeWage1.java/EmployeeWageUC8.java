class EmployeeWageUC8 {

    static int calculateWage(int wagePerHour, int maxHours, int maxDays) {
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

        int company1 = calculateWage(20, 100, 20);
        int company2 = calculateWage(25, 120, 22);

        System.out.println("Company1 Wage: " + company1);
        System.out.println("Company2 Wage: " + company2);
    }
}