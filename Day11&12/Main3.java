import java.util.*;

class CompanyShares {
    String symbol;
    int shares;
    Date date;

    CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.date = new Date();
    }
}

class StockAccount {
    List<CompanyShares> list = new ArrayList<>();

    void buy(String symbol, int shares) {
        list.add(new CompanyShares(symbol, shares));
        System.out.println("Bought " + shares + " of " + symbol);
    }

    void sell(String symbol, int shares) {
        for (CompanyShares cs : list) {
            if (cs.symbol.equals(symbol) && cs.shares >= shares) {
                cs.shares -= shares;
                System.out.println("Sold " + shares + " of " + symbol);
                return;
            }
        }
        System.out.println("Not enough shares to sell");
    }

    void printReport() {
        for (CompanyShares cs : list) {
            System.out.println(cs.symbol + " - " + cs.shares + " shares");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        StockAccount acc = new StockAccount();

        acc.buy("TCS", 50);
        acc.buy("INFY", 30);

        acc.sell("TCS", 20);

        acc.printReport();
    }
}