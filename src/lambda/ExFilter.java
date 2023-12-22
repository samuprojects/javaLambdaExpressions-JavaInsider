package lambda;

import java.util.ArrayList;
import java.util.List;

public class ExFilter {

    //Objetivo: criar método filter para receber list de inteiros e condition em lambda para iterar sobre os elementos da coleção
    // após iterar os elementos se a condição da expressão lambda for verdadeira nada muda, se for falsa remove o elemento e retorna uma nova lista

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(list, i -> i % 2 == 0));
        System.out.println(filter(list, i -> i % 2 != 0));
        System.out.println(filter(list, i -> i >= 5));
    }

    private static List<Integer> filter(List<Integer> list, Condition condition) {
        List<Integer> newList = new ArrayList<>();
        for (int i : list){
            if (condition.test(i)){
                newList.add(i);
            }
        }
        return newList;
    }

    @FunctionalInterface
    interface Condition {
        boolean test(int i);
    }
}
