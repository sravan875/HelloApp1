import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}