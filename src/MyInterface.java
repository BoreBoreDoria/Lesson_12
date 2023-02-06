@FunctionalInterface
public interface MyInterface {
    void say();

    default void sayHello() {
        System.out.println("Hello World");
    }
}
