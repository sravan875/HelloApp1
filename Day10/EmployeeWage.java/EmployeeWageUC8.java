class UC8 {
    static int compute(String name, int rate, int days, int hours) {
        return rate * days * hours;
    }

    public static void main(String[] args) {
        System.out.println("TCS Wage: " + compute("TCS", 20, 20, 8));
        System.out.println("Infosys Wage: " + compute("Infosys", 25, 22, 8));
    }
}