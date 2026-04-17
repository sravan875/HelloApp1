import java.util.*;

public class LargestThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + max);
    }
}