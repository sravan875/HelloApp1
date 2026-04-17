package DAY3;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 80, 25};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest: " + min);
    }
}