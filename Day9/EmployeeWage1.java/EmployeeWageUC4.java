class EmployeeWageUC4 {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int hours = 0;

        int empCheck = (int)(Math.random() * 3);

        switch (empCheck) {
            case 1:
                hours = 8;
                break;
            case 2:
                hours = 4;
                break;
            default:
                hours = 0;
        }

        System.out.println("Wage: " + (hours * wagePerHour));
    }
}