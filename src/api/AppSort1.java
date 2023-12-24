package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("ALL")
public class AppSort1 {

    // Para ordenação de elementos podemos chamar Collections.sort passando uma list com elementos do tipo que implementam Comparable, ou uma list com um Comparator para dizer como as coisas serão comparadas
    // ou podemos usar lambda que nos permite utilizar o método sort da própria coleção (toda coleção do Java que pode ser ordenada tem esse método)
    public static void main(String[] args) {

        var letters = new ArrayList<>(Arrays.asList('C', 'B', 'E', 'F', 'A', 'D'));
        System.out.println(letters + " lista original");

        letters.sort((l1, l2) -> l1.compareTo(l2));
        System.out.println(letters + " utilizando compareTo");

        // se quiser inverter a ordem basta negar o compareTo
        letters.sort((l1, l2) -> -l1.compareTo(l2));
        System.out.println(letters + " negando o compareTo");

        // outro recurso é utilizar os métodos de Comparator
        letters.sort(Comparator.naturalOrder());
        System.out.println(letters + " utilizando métodos do Comparator");

        letters.sort(Comparator.reverseOrder());
        System.out.println(letters);
    }
}
