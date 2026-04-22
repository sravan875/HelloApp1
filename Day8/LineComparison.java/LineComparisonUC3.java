class Main {
    public static void main(String[] args) {

        int x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        int x3 = 1, y3 = 1, x4 = 4, y4 = 5;

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) +
                                  Math.pow(y2 - y1, 2));

        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) +
                                  Math.pow(y4 - y3, 2));

        int result = Double.compare(length1, length2);

        if (result == 0)
            System.out.println("Lines are Equal");
        else if (result > 0)
            System.out.println("Line 1 is Longer");
        else
            System.out.println("Line 2 is Longer");
    }
}