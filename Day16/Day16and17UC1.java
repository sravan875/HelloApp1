package Day16;

import java.util.Arrays;

public class Day16and17UC1 {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int target = 99999;

        // Linear Search
        long start1 = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) break;
        }
        long end1 = System.nanoTime();

        // Binary Search
        long start2 = System.nanoTime();
        Arrays.binarySearch(arr, target);
        long end2 = System.nanoTime();

        System.out.println("Linear Time: " + (end1 - start1));
        System.out.println("Binary Time: " + (end2 - start2));
    }
}