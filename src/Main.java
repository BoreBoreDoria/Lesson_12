import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Пример 2
        Stream.of("a1","b1", "c1","a2","b2", "c2")
                .filter((s) -> {
                    System.out.println("Use filter:" + s);
                    return true;
                })
                .peek((s) -> System.out.println("Use peek:" + s));
//                .forEach((s) -> System.out.println("Use forEach: " + s)); Стримы ленивые.
//                Если не вызвать терминальную операцию, то он не выполняется

        Stream.of("a1","b1", "c1","a2","b2", "c2")
                .filter((s) -> {
                    System.out.println("Use filter:" + s);
                    return true;
                })
                .peek((s) -> System.out.println("Use peek:" + s))
                .forEach((s) -> System.out.println("Use forEach: " + s)); // Терминальная операция

    }
}