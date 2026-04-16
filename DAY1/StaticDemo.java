package DAY1;

public class StaticDemo {

    static int count;

    // Static block
    static {
        count = 100;
        System.out.println("Static block executed");
    }

    // Static method
    static void display() {
        System.out.println("Static method called");
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        display();
    }
}
