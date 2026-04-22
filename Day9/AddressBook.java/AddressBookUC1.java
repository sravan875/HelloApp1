package Day9;

import java.util.*;

class BankAccount {
    String accountnumber;
    double balance;
    BankAccount(String a, double b) {
        this.accountnumber = a;
        this.balance = b;
    }
    void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Successfully deposited Amount to Account number");
        } else {
            System.out.println("amount is invalid");
        }
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient amount");
        }
        else if (amount <= 0) {
            System.out.println("Amount is invalid");
        }
        else {
            balance = balance - amount;
            System.out.println("Amount is Successfully withdraw");
        }
    }
    void display() {
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Account Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Account Number: ");
        String accountnumber = scanner.nextLine();
        System.out.println("Enter the Account Balance: ");
        double balance = scanner.nextDouble();

        BankAccount cand = new BankAccount(accountnumber, balance);

        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();
        cand.deposit(depositAmount);
        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = scanner.nextDouble();
        cand.withdraw(withdrawAmount);

        System.out.println("\nFinal Details:");
        cand.display();
        scanner.close();
    }   
}