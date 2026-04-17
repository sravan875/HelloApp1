import java.util.*;

public class WindChill {
    public static void main(String[] args) {
        double t = 40, v = 10;

        double w = 35.74 + 0.6215 * t
                + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind Chill: " + w);
    }
}