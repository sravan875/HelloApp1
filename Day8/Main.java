class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line implements Comparable<Line> {
    Point p1;
    Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // UC1 → Calculate length
    double calculateLength() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) +
                         Math.pow(p2.y - p1.y, 2));
    }

    // UC2 → equals method
    @Override
    public boolean equals(Object obj) {
        Line other = (Line) obj;
        return Double.compare(this.calculateLength(),
                              other.calculateLength()) == 0;
    }

    // UC3 → compareTo method
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.calculateLength(),
                              other.calculateLength());
    }
}

public class Main {

    public static void main(String[] args) {

        // Welcome message (as per rules)
        System.out.println("Welcome to Line Comparison Program");

        // Create two lines (UC4 OOP)
        Line line1 = new Line(new Point(0, 0), new Point(3, 4));
        Line line2 = new Line(new Point(1, 1), new Point(4, 5));

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        // UC1 → print lengths
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // UC2 → equals
        if (line1.equals(line2))
            System.out.println("Lines are Equal");
        else
            System.out.println("Lines are NOT Equal");

        // UC3 → compareTo
        int result = line1.compareTo(line2);

        if (result == 0)
            System.out.println("Both lines are equal");
        else if (result > 0)
            System.out.println("Line 1 is longer");
        else
            System.out.println("Line 2 is longer");
    }
}