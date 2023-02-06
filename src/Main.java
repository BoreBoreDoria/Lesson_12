import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Мы можем записывать конкретную лямбду в переменную и далее её передавать
        Consumer<String> consumer = (v) -> System.out.println("Goodbye - " + v);
        test(consumer, "Maxim");

        System.out.println();

        //Так-же мы можем напрямую прям при вызове метода созджать лямбда-выражение
        test((v) -> System.out.println("Hello - " + v), "Maxim");
    }


    public static void test(Consumer<String> consumer, String value) {
        System.out.println("Use Consumer");
        consumer.accept(value);
    }
}