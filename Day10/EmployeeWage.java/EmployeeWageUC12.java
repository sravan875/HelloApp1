import java.util.*;

class UC12 {
    public static void main(String[] args) {
        ArrayList<Company> list = new ArrayList<>();

        list.add(new Company("TCS", 20, 20, 8));
        list.add(new Company("Infosys", 25, 22, 8));

        for (Company c : list) {
            c.compute();
            System.out.println(c.name + " Wage: " + c.total);
        }
    }
}