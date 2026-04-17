package DAY5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        // Handle edge cases
        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }

        // Generate remaining terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            // shift values
            first = second;
            second = next;
        }
    }
}