package Day16;
import java.util.Arrays;
public class Day16and17UC14 {

    public static void main(String[] args) {

        int[] ids = {105, 102, 109, 101};

        for (int i = 1; i < ids.length; i++) {

            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }

        System.out.println(Arrays.toString(ids));
    }
}
