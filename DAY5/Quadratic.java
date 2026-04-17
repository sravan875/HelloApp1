import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;

        double delta = b * b - 4 * a * c;

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(root1 + " " + root2);
    }
}