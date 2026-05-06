package Day16;

import java.util.Arrays;

public class Day16And17UC2 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        // Bubble Sort
        int[] bubble = arr.clone();
        long start1 = System.nanoTime();

        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

        long end1 = System.nanoTime();

        // Built-in sort
        int[] fast = arr.clone();
        long start2 = System.nanoTime();
        Arrays.sort(fast);
        long end2 = System.nanoTime();

        System.out.println("Bubble: " + (end1 - start1));
        System.out.println("Built-in: " + (end2 - start2));
    }
}