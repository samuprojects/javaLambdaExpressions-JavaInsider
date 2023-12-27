package api;

import java.util.Optional;

@SuppressWarnings("ALL")
public class AppOptional7 {
    public static void main(String[] args) {

        //String s1 = Optional.of("A").orElse(get()); // o parâmetro do orElse é sempre avaliado mesmo que haja algo no Optional, o que pode reduzir drasticamente o desempenho caso tenha algum processamento mais pesado.
        //System.out.println(s1);

        String s2 = Optional.of("A").orElseGet(() -> get()); // só é chamado caso não haja nada no Optional o que é mais seguro caso tenha algum processamento mais pesado
        System.out.println(s2);
    }

    private static String get() { // incluído Thread de espera para mostrar que o método foi chamado no orElse comprometendo o tempo de resposta
        System.out.println("Calling get()...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "B";
    }
}
