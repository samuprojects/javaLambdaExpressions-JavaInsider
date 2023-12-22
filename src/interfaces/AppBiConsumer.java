package interfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class AppBiConsumer {

    public static void main(String[] args) {

        // Possui o mesmo conceito da interface anterior, porém, pode receber 2 parâmetros, um diferente do outro.

        var list = List.of("A", "B", "C", "D");

        iterate(list, (i, e) -> System.out.println(i + " -> " + e));
    }

    private static void iterate(List<String> list, BiConsumer<Integer, String> biConsumer) {
        for (int i = 0; i < list.size(); i++) {
            biConsumer.accept(i, list.get(i));
        }
    }
}
