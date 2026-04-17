package DAY6;

import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value :");
        int num1 = scanner.nextInt();
        boolean is_prime = true;
        if (num1 < 1) {
            is_prime = false;
        }
        for (int i = 2; i <= num1-1; i++) {
            if (num1 % 2 == 0) {
                is_prime = false;
            }
        }
        if (is_prime == true) {
            System.out.println(num1 + " is prime");
            }
        else {
            System.out.println(num1 + " is not prime");
        }
    }
}
