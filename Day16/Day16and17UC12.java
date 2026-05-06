package Day16;
import java.util.Arrays;
public class Day16and17UC12 {
    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        // Find first missing positive
        Arrays.sort(arr);

        int missing = 1;

        for (int x : arr) {
            if (x == missing) {
                missing++;
            }
        }

        System.out.println("Missing: " + missing);

        // Binary search
        int target = 4;
        int index = Arrays.binarySearch(arr, target);

        System.out.println("Index: " + index);
    }
}
