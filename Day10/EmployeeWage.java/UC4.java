public class UC4 {
    public static void main(String[] args) {
        int empCheck = (int)(Math.random() * 3);
        int hours = 0;

        switch (empCheck) {
            case 1: hours = 8; break;   // Full Time
            case 2: hours = 4; break;   // Part Time
            default: hours = 0;         // Absent
        }

        int wage = hours * 20;
        System.out.println("Daily Wage: " + wage);
    }
}