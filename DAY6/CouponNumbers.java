package DAY6;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        Random rand = new Random();

        int count = 0;

        while (set.size() < n) {
            int num = rand.nextInt(n); // generates 0 to n-1
            set.add(num);
            count++;
        }

        System.out.println("Total random numbers needed: " + count);
        System.out.println("Distinct coupons: " + set);
    }
}