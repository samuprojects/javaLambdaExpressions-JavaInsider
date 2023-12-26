package api;

import java.util.Map;

public class AppOptional1 {

    // A classe Optional faz parte da API do java, pacote java util, que serve para representar retornos opcionais, podendo ou não ter uma informação.

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        var name = people.getNameById(6); // chamando key inexistente para testar uso do optional

        // Optional possui alguns métodos que permite verificar se há alguma informação como, por exemplo, o isPresent que tendo alguma coisa executará o get
        // e depois o toUpperCase
        if (name.isPresent()) {
            String upperName = name.get().toUpperCase();
            System.out.println(upperName);
        }
    } // poderia usar if checando se é null nesse exemplo, porém, em outros cenários o Optional combinado com as expressões lambda trazem outros recursos que serão abordados posteriormente.

}
