package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("ALL")
public class AppRemoveIf1 {

    // Podemos usar uma operação com lambda em coleções que nos permite remover elementos com base em condições

    public static void main(String[] args) {

        // no exemplo abaixo não foi utilizado um List.of porque ele retorna uma lista imutável, utilizado o ArraysList que recebe um var args e no passamos no construtor de um asList que permite remover elementos
        var letters = new ArrayList<>(Arrays.asList('A', 'b', 'C', 'd', 'E', 'f'));
        System.out.println(letters);

        // se quiser, por exemplo, eliminar da lista todas as letras minúsculas do jeito clássico (sem lambda)
        Iterator<Character> iter = letters.iterator();
        while (iter.hasNext()) {
            var c = iter.next();
            if (Character.isLowerCase(c)) {
                iter.remove();
            }
        }
        System.out.println(letters + " utilizando a forma tradicional");

        // podemos simplificar com lambda utilizando um método removeIf que recebe um Predicate (recebe um parâmetro e retorna um boolean) que se for verdadeiro é removido
        letters.removeIf(c -> Character.isLowerCase(c));
        System.out.println(letters + " utilizando Lambda");

        // ou simplificar, como o parâmetro da expressão também é passado como parâmetro para o isLowerCase podemos omitir os dois por ser apenas uma linha e 1 parâmetro.
        letters.removeIf(Character::isLowerCase);
        System.out.println(letters + " utilizando lambda mais simplificado");

        // lembrando que o removeIf também retorna true (que não foi capturado no exemplo acima) se teve alteração na coleção, ou false se não houve mudança alguma
    }
}
