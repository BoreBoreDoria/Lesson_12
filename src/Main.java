import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {


    }

    /**
     * Классический вариант через создание классов
     */
    private static void ver3() {
        Test test = new Test();
        Test2 test2 = new Test2();

        test.sayHello();
        test.say();
        System.out.println();
        test2.sayHello();
        test2.say();
    }

    /**
     * Вариант через лямбда выражение
     */
    private static void ver2() {
        MyInterface test = () -> System.out.println("New Hello");
        MyInterface test2 = () -> System.out.println("Goodbye");

        test.sayHello();
        test.say();
        System.out.println();
        test2.sayHello();
        test2.say();
    }


    /**
     * Вариант через анонимные классы
     */
    private static void ver1() {
        MyInterface test = new MyInterface() {
            @Override
            public void say() {
                System.out.println("New Hello");
            }
        };


        MyInterface test2 = new MyInterface() {
            @Override
            public void say() {
                System.out.println("Goodbye");
            }
        };


        sayInfo(test);
        sayInfo(test2);
    }

    static void sayInfo(MyInterface myInterface) {
        myInterface.say();
    }
}