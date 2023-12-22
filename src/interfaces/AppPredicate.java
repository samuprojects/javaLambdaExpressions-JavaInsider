package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppPredicate { // recebe um parâmetro e retorna um boolean

    public static void main(String[] args) {
        var list = List.of("A", "B", "C", "D", "AB", "BC");
        System.out.println(filter(list, s -> s.length() == 2));
    }

    private static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        for (String e : list) {
            if (predicate.test(e)) {
                newList.add(e);
            }
        }
        return newList;
    }
}
