public class Hello {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        throw new RuntimeException("An error occurred in the main thread.");
    }
}