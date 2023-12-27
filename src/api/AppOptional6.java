package api;

import java.util.Map;

public class AppOptional6 {
    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        // o Optional faz tratamento para evitar que NullPointerExceptions aconteçam nos encadeamentos de chamadas
        // nesse exemplo utilizamos o método map para transformar o valor (String) em outro (int) da quantidade de caracteres da String
        int count = people.getNameById(5).map(String::length).orElse(0);
        System.out.println(count);
    }
}
