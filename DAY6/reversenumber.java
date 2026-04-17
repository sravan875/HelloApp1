package DAY6;

import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value :");
        int num1 = scanner.nextInt();
        int reverse = 0;
        int i = 0;
        while (num1 > 0) {
            int digit = num1 % 10;
            reverse = reverse * 10 + digit;
            num1 = num1 / 10;
        }
        System.out.println("reverse number :" + reverse);
    }
}

