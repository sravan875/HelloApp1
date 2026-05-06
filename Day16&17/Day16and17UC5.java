package Day16;
import java.util.*;

public class Day16and17UC5 {
    public static void main(String[] args) {

        int n = 100000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            set.add(i);
            tree.add(i);
        }

        // Array search
        long start1 = System.nanoTime();
        for (int x : arr) {
            if (x == target) break;
        }
        long end1 = System.nanoTime();

        // HashSet
        long start2 = System.nanoTime();
        set.contains(target);
        long end2 = System.nanoTime();

        // TreeSet
        long start3 = System.nanoTime();
        tree.contains(target);
        long end3 = System.nanoTime();

        System.out.println("Array: " + (end1 - start1));
        System.out.println("HashSet: " + (end2 - start2));
        System.out.println("TreeSet: " + (end3 - start3));
    }
}