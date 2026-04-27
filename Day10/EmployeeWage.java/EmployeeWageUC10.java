class UC10 {
    public static void main(String[] args) {
        Company[] companies = {
            new Company("TCS", 20, 20, 8),
            new Company("Infosys", 25, 22, 8)
        };

        for (Company c : companies) {
            c.compute();
            System.out.println(c.name + " Wage: " + c.total);
        }
    }
}