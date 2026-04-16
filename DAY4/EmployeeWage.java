package DAY4;

public class EmployeeWage {

    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;

        int employeeType = 1; // 1 = Full-time, 2 = Part-time

        int salary = 0;

        if (employeeType == 1) {
            salary = wagePerHour * fullDayHours;
            System.out.println("Full-time Employee Salary: " + salary);
        } else if (employeeType == 2) {
            salary = wagePerHour * partTimeHours;
            System.out.println("Part-time Employee Salary: " + salary);
        } else {
            System.out.println("Employee is absent. Salary = 0");
        }
    }
}