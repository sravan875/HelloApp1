package Day16;

public class Day16and17UC9 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1};

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            boolean leftCheck = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightCheck = (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

            if (leftCheck && rightCheck) {
                System.out.println("Peak: " + arr[mid]);
                break;
            }

            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }   
}
