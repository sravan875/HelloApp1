package DAY3;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 80, 25};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest: " + max);
    }
}