package api;

import java.util.Map;

@SuppressWarnings("ALL")
public class AppOptional4 {
    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        // caso dentro do Optional não haja nenhum valor é possível ainda utilizar outros métodos como a seguir:
        //String name = people.getNameById(3).orElse("X"); // permite apenas retornar uma String (sempre é processado o orElse mesmo que tenha algo no optional, o que pode ser prejudicial)
        //String name = people.getNameById(3).orElseGet(() -> "X"); // permite qualquer outro tipo de processamento usando lambda e pode retornar a string no final, e só roda se não houver nada no optional
        //String name = people.getNameById(6).orElseThrow(() -> new RuntimeException("ID not found")); // permite lançar uma exceção com mensagem personalizada
        String name = people.getNameById(6).orElseThrow(RuntimeException::new); // apenas lança a exceção
        System.out.println(name);
    }

}
