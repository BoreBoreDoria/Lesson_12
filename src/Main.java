import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[]{3, 8, 3, 5, 8, 5, 6, 9, 3, 4, 5, 3, 5, 6, 3, 6, 13, 1, 13, 13, 13, 13};
        //Задача 1. Из массива целых чисел найти максимальное значение.
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
        }
        System.out.println(max);

        //Вариант с стримами;
        int maxStream = 0;
        maxStream = Arrays.stream(mas).max().getAsInt();
        System.out.println(maxStream);
    }
}