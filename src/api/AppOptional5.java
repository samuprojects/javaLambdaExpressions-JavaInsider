package api;

import java.util.Map;

public class AppOptional5 {
    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        // as expressões lambda facilitam muito o encadeamento de chamadas permitindo construir um caminho intuitivo de possibilidades
        // no exemplo a seguir utilizamos o método filter de Optional que recebe um Predicate (teste boolean) que se verdadeiro o elemento continua dentro do Optional
        // em caso negativo cria um novo Optional vazio, vamos filtrar, por exemplo, nomes que começam com "R"
        people.getNameById(5).filter(n -> n.startsWith("R")).ifPresentOrElse(System.out::println, () -> System.out.println("Name does not start with R"));
    }
}
