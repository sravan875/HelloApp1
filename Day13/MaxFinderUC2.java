package Day13;

public class MaxFinderUC2 {
    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static Float findMax(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("UC1 Integer Max: " + findMax(10, 20, 15));
        System.out.println("UC2 Float Max: " + findMax(10.5f, 20.3f, 15.2f));
    }
}

