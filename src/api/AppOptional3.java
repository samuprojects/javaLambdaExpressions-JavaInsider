package api;

import java.util.Map;

public class AppOptional3 {
    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        // se quiser aproveitar a abordagem do "if/else" no Optional pode utilizar ifPresentOrElse que recebe dois parâmetros, um Consumer e um Runnable
        // no Consumer informamos o que deve ser executado caso o valor esteja lá e no Runnable (é uma interface funcional com um método que não
        // recebe parâmetros e não deve retornar nada) o resultado caso não haja nenhum valor.

        people
                .getNameById(6)
                .ifPresentOrElse(
                        n -> System.out.println(n.toUpperCase()),
                        () -> System.out.println("ID not found")
                );
    }

}
