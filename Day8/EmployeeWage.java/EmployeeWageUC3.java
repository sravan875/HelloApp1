class EmployeeWageUC3 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTime = 8;
        int partTime = 4;

        int empCheck = (int)(Math.random() * 3);
        int hours = 0;

        if (empCheck == 1)
            hours = partTime;
        else if (empCheck == 2)
            hours = fullTime;

        int wage = hours * wagePerHour;
        System.out.println("Daily Wage: " + wage);
    }
}