import java.util.*;

// UC11: Interface
interface EmpWageInterface {
    void addCompany(String name, int wagePerHour, int maxDays, int maxHours);
    void computeWages();
    int getTotalWage(String companyName);
}

// UC9: Company Class (Instance Variables)
class CompanyEmpWage {
    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalWage;
    ArrayList<Integer> dailyWages = new ArrayList<>();

    CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String toString() {
        return companyName + " Total Wage: " + totalWage + " | Daily: " + dailyWages;
    }
}

// UC10 + UC12 + UC14: Manage multiple companies
class EmpWageBuilder implements EmpWageInterface {

    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private HashMap<String, CompanyEmpWage> companyMap = new HashMap<>();

    // UC8: Add multiple companies
    public void addCompany(String name, int wagePerHour, int maxDays, int maxHours) {
        CompanyEmpWage company = new CompanyEmpWage(name, wagePerHour, maxDays, maxHours);
        companyList.add(company);
        companyMap.put(name, company);
    }

    // UC1–UC6 logic + UC13 (daily wage storage)
    public void computeWages() {
        for (CompanyEmpWage company : companyList) {

            int totalHours = 0;
            int totalDays = 0;
            int totalWage = 0;

            while (totalHours < company.maxWorkingHours && totalDays < company.maxWorkingDays) {
                totalDays++;

                int empCheck = (int)(Math.random() * 3);
                int hours = 0;

                switch (empCheck) {
                    case 1: hours = 8; break; // Full Time
                    case 2: hours = 4; break; // Part Time
                    default: hours = 0;       // Absent
                }

                int dailyWage = hours * company.wagePerHour;
                company.dailyWages.add(dailyWage);

                totalHours += hours;
                totalWage += dailyWage;
            }

            company.setTotalWage(totalWage);
            System.out.println(company);
        }
    }

    // UC14: Get total wage by company
    public int getTotalWage(String companyName) {
        if (companyMap.containsKey(companyName)) {
            return companyMap.get(companyName).totalWage;
        }
        return -1;
    }
}

// MAIN CLASS
public class EmployeeWageMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilder builder = new EmpWageBuilder();

        // UC8: Add Companies
        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);
        builder.addCompany("Wipro", 18, 20, 100);

        // Compute Wages
        builder.computeWages();

        // UC14: Query
        System.out.println("\nQuery Result:");
        System.out.println("TCS Wage: " + builder.getTotalWage("TCS"));
    }
}