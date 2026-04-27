class Company {
    String name;
    int rate, days, hours, total;

    Company(String name, int rate, int days, int hours) {
        this.name = name;
        this.rate = rate;
        this.days = days;
        this.hours = hours;
    }

    void compute() {
        total = rate * days * hours;
    }
}