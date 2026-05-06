package Day16;
import java.util.Arrays;
public class Day16and17UC19 {
    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 14, 12};

        int max = 18;
        int[] count = new int[max + 1];

        for (int age : ages) {
            count[age]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ages[index++] = i;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(ages));
    }
}
