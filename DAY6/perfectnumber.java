package DAY6;

import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value :");
        int num1 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num1/2; i++) {
            if (num1 % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num1) {
            System.out.println("number is perfect:" + num1);
        }
        else {
            System.out.println("number is not perfect:" + num1);
        }
    }
}
