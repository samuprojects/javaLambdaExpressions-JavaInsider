package api;

import java.util.Map;

public class AppForEach2 {

    public static void main(String[] args) {

        var people = Map.of(
                1, "Pedro",
                2, "Maria",
                3, "Paulo",
                4, "Joana"
        );

        people.keySet().forEach(System.out::println); // method reference para mostrar as chaves usando o forEach do método keySet
        people.values().forEach(System.out::println); // ou method reference para mostrar os valores usando o forEach do método value
        people.forEach((k, v) -> System.out.println(k + " => " + v)); // utilizando o forEach do Map ao invés de um Consumer devemos passar um BiConsumer na expressão lambda
        // dessa forma chave e valor são contemplados como uma única entrada para exibição posterior

    }
}
