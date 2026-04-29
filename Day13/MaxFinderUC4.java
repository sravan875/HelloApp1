package Day13;

import java.util.Arrays;

public class MaxFinderUC4 {
    public static <T extends Comparable<T>> T findMax(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("UC4 Max: " + findMax(10, 20, 30, 5, 99));
    }
}

