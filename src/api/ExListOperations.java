package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ExListOperations {

    // Objetivo considerar a lista de números de 0 a 9 na ordem original 3, 6, 2, 4, 9, 7, 1, 5, 8, 0 e na sequência:
    // somar 2 em cada número, remover os pares, ordenar decrescente e imprimir o resultado tudo usando lambda

    public static void main(String[] args) {

        var numbers = new ArrayList<>(Arrays.asList(3, 6, 2, 4, 9, 7, 1, 5, 8, 0));

        System.out.println("Fase1 - lista original");
        System.out.println(numbers);
        System.out.println();

        numbers.replaceAll(n -> n + 2);
        System.out.println("Fase2 - somar 2 em cada número");
        System.out.println(numbers);
        System.out.println();

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Fase3 - remover os pares");
        System.out.println(numbers);
        System.out.println();

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Fase4 - listar decrescente");
        System.out.println(numbers);
        System.out.println();

        System.out.println("Fase5 - imprimir resultado final");
        numbers.forEach(System.out::println);

    }
}
