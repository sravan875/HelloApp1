package Day16;

public class Day16and17UC3 {
    public static void main(String[] args) {

        int n = 10000;

        // String
        long start1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "Java";
        }
        long end1 = System.nanoTime();

        // StringBuilder
        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("Java");
        }
        long end2 = System.nanoTime();

        System.out.println("String: " + (end1 - start1));
        System.out.println("StringBuilder: " + (end2 - start2));
    }
}