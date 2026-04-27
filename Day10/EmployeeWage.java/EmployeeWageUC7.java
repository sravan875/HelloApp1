class EmpWage {
    static int computeWage() {
        int wagePerHour = 20;
        int total = 0;

        for (int i = 0; i < 20; i++) {
            total += 8 * wagePerHour;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(computeWage());
    }
}