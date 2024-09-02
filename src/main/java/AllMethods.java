public class AllMethods {
    // Static method
    public static void staticMethod() {
        System.out.println("Static method");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method");
    }

    // Abstract method (in an abstract class)
    abstract class AbstractClass {
        abstract void abstractMethod();
    }

    // Final method
    public final void finalMethod() {
        System.out.println("Final method");
    }

    public static void main(String[] args) {
        AllMethods obj = new AllMethods();
        staticMethod();
        obj.instanceMethod();
        obj.finalMethod();
    }
}
