class EmployeeWageUC5 {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int totalWage = 0;

        for (int day = 1; day <= 20; day++) {

            int empCheck = (int)(Math.random() * 3);
            int hours = (empCheck == 1) ? 8 : (empCheck == 2) ? 4 : 0;

            totalWage += hours * wagePerHour;
        }

        System.out.println("Monthly Wage: " + totalWage);
    }
}