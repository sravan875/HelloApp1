class EmployeeWage {

    // Method to compute wage (UC7 + UC8)
    static int computeWage(int wagePerHour, int maxHours, int maxDays) {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours <= maxHours && totalDays < maxDays) {

            totalDays++;

            int empCheck = (int)(Math.random() * 3); // UC1

            int hours = 0;

            // UC4 (Switch Case)
            switch (empCheck) {
                case 1:
                    hours = 8; // full time (UC2)
                    break;
                case 2:
                    hours = 4; // part time (UC3)
                    break;
                default:
                    hours = 0; // absent
            }

            totalHours += hours;
        }

        return totalHours * wagePerHour; // UC5 & UC6
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8: Multiple companies
        int company1Wage = computeWage(20, 100, 20);
        int company2Wage = computeWage(25, 120, 22);

        System.out.println("Company 1 Total Wage: " + company1Wage);
        System.out.println("Company 2 Total Wage: " + company2Wage);
    }
}