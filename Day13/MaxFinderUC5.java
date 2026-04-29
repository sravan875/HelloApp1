package Day13;

public class MaxFinderUC5 {
    public static <T extends Comparable<T>> T findMax(T... values) {
        T max = values[0];

        for (T val : values) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }

        printMax(max);
        return max;
    }

    public static <T> void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        findMax(10, 20, 30, 5, 99);
        findMax(10.5f, 20.3f, 15.2f);
        findMax("Apple", "Peach", "Banana");
    }
}

