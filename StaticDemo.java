public class StaticDemo {

    // Static variable (shared across all objects)
    static int count;

    // Static block (runs once when class loads)
    static {
        count = 50;
        System.out.println("Static block executed");
    }

    // Static method (can access only static data directly)
    static void showCount() {
        System.out.println("Static method called");
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Inside main method");

        // Calling static method
        showCount();

        // Creating objects
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        // Modifying static variable using one object
        obj1.count = 100;

        // Both objects reflect same value (shared)
        System.out.println("obj1 count: " + obj1.count);
        System.out.println("obj2 count: " + obj2.count);
    }
}