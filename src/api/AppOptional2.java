package api;

import java.util.Map;

public class AppOptional2 {
    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        // Utilizar o método ifPresent de Optional é mais interessante do que a implementação passada, pois, recebe um Consumer que pode ser representado por lambda
        // que recebe um parâmetro e não é preciso retornar nada. Essa combinação permite simplificar ao máximo o código.

        people.getNameById(2).ifPresent(n -> System.out.println(n.toUpperCase()));
    }

}
