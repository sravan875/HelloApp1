package Day16;

public class Day16and17UC6 {
    public static void main(String[] args) {

        int[] arr = {10, 5, -3, 7, -1};

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break; // early return (best practice)
            }
        }

        System.out.println("Index: " + index);
    }
}

