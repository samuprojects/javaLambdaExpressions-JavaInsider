package interfaces;

import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class AppConsumer {

    public static void main(String[] args) {

        // o java traz diversas interfaces funcionais prontas, ficando a necessidade do programador criar uma em casos especiais.

        repeat(4, System.out::println);
    }

    private static void repeat(int n, Consumer<Integer> consumer) {
        for (int i = 0; i < n; i++) {
            consumer.accept(i);
        }
    }
}
