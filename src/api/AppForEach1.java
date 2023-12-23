package api;

import java.util.List;

@SuppressWarnings("ALL")
public class AppForEach1 {

    // a seguir como usar lambda dentro da api do java
    public static void main(String[] args) {

        var numbers = List.of(1, 2, 3, 4, 5, 6);

        // uma forma comum de imprimir a lista
//        for (var n : numbers) {
//            System.out.println(n);
//        }


        // em lambda
//        numbers.forEach(n -> System.out.println(n));
        numbers.forEach(System.out::println); // forma mais simplificada de lambda considerando que o próprio "n" era passado como parâmetro

        // lembrando que o forEach está disponível em todas as coleções do Java
    }
}
