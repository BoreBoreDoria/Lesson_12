import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Задача 3. Из массива строк, вывести только те, что имеют внутри символ "a"
        Stream.of("a1", "b1", "c1", "a2", "b2", "c2")
                .filter((s) -> {
                    System.out.println("Use filter:" + s);
                    return s.contains("a");
                })
                .peek((s) -> System.out.println("Use peek:" + s))
                .forEach((s) -> System.out.println("Use forEach: " + s));

        //Задача 4. Отфильтровать массив строк и вернуть оставшиеся
        List<String> collect = Stream.of("a1", "b1", "c1", "a2", "b2", "c2")
                .filter((s) -> s.contains("c"))
                .collect(Collectors.toList());

        System.out.println(collect);
        //Задача 5. Данн массив интов, необходимо их все умножить на самого себя и вернуть массив Long
        List<Long> result = Stream.of(12, 5, 16, 56, 87, 35, 9, 7, 55, 13)
                .map((i) -> i * i)
                .peek((s) -> System.out.print(s + ","))
                .map((s) -> String.valueOf(s))
                .map((i) -> Long.valueOf(i))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(result);
    }
}