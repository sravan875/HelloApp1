class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Account acc = new Account(1000);

        acc.debit(200);
        System.out.println("Balance: " + acc.getBalance());

        acc.debit(900); // should fail
        System.out.println("Balance: " + acc.getBalance());
    }
}