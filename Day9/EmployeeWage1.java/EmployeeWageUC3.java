class EmployeeWageUC3 {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullTime = 8;
        int partTime = 4;

        int empCheck = (int)(Math.random() * 3);

        if (empCheck == 1) {
            System.out.println("Full Time Wage: " + (wagePerHour * fullTime));
        } else if (empCheck == 2) {
            System.out.println("Part Time Wage: " + (wagePerHour * partTime));
        } else {
            System.out.println("Absent. Wage: 0");
        }
    }
}