class EmployeeWageUC2 {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHour = 8;

        int isPresent = (int)(Math.random() * 2);

        if (isPresent == 1) {
            int salary = wagePerHour * fullDayHour;
            System.out.println("Daily Wage: " + salary);
        } else {
            System.out.println("Employee Absent. Wage: 0");
        }
    }
}