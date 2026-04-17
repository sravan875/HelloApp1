package DAY6;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start...");
        sc.nextLine();
        long start = System.currentTimeMillis();

        System.out.println("Press ENTER to stop...");
        sc.nextLine();
        long end = System.currentTimeMillis();

        long elapsed = end - start;

        System.out.println("Elapsed Time: " + elapsed + " ms");
        System.out.println("Elapsed Time: " + (elapsed / 1000.0) + " seconds");
    }
}
