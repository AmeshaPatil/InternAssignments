public class BlocksDemo {
    static {
        System.out.println("Static Block"); // runs once when class is loaded
    }

    {
        System.out.println("Instance Block"); // runs before constructor
    }

    BlocksDemo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        BlocksDemo obj1 = new BlocksDemo();
        BlocksDemo obj2 = new BlocksDemo();
    }
}