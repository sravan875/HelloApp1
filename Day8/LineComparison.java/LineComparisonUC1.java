class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program");

        int x1 = 0, y1 = 0;
        int x2 = 3, y2 = 4;

        double length = Math.sqrt(Math.pow(x2 - x1, 2) +
                                 Math.pow(y2 - y1, 2));

        System.out.println("Length of Line: " + length);
    }
}