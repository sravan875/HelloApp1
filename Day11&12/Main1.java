import java.util.*;

class Stock {
    String name;
    int shares;
    double price;

    Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    double getValue() {
        return shares * price;
    }
}

class StockPortfolio {
    List<Stock> stocks = new ArrayList<>();

    void addStock(Stock s) {
        stocks.add(s);
    }

    void printReport() {
        double total = 0;
        for (Stock s : stocks) {
            double value = s.getValue();
            System.out.println(s.name + " Value: " + value);
            total += value;
        }
        System.out.println("Total Stock Value: " + total);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Shares: ");
            int shares = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            portfolio.addStock(new Stock(name, shares, price));
        }

        portfolio.printReport();
    }
}