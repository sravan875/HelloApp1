package Day16;
public class Day16and17UC4 {

    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    static int fibIterative(int n) {
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 30;

        long start1 = System.nanoTime();
        fibRecursive(n);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        fibIterative(n);
        long end2 = System.nanoTime();

        System.out.println("Recursive: " + (end1 - start1));
        System.out.println("Iterative: " + (end2 - start2));
    }
}