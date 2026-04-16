public class StaticDemo {

    static int count;

    // Static block
    static {
        count = 50;
        System.out.println("Static block executed");
    }

    // Static method
    static void showCount() {
        System.out.println("Static method called");
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Inside main method");

        showCount();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.count = 100;

        System.out.println("obj1 count: " + obj1.count);
        System.out.println("obj2 count: " + obj2.count);
    }
}