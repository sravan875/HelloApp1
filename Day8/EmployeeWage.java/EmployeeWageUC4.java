class EmployeeWageUC4 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTime = 8;
        int partTime = 4;

        int empCheck = (int)(Math.random() * 3);
        int hours = 0;

        switch (empCheck) {
            case 1:
                hours = partTime;
                break;
            case 2:
                hours = fullTime;
                break;
            default:
                hours = 0;
        }

        System.out.println("Daily Wage: " + (hours * wagePerHour));
    }
}