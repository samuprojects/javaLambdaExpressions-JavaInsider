package interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class AppSupplier { // retorna alguma coisa

    public static void main(String[] args) {

        int n1 = generate(() -> 1); // como Supplier não tem parâmetros passamos apenas o retorno
        System.out.println(n1);

        int n2 = generate(() -> (int) (Math.random() * 1000)); // agora geramos números aleatórios de 0 a 999
        System.out.println(n2);

        int n3 = generate(() -> { // usando lambda com Supplier podemos gerar alguma coisa, fornecendo um valor e que não precise de um parâmetro para isso
            Random random = new Random();
            return random.nextInt(10, 20);
        });
        System.out.println(n3);
    }

    private static int generate(Supplier<Integer> supplier) { // vamos utilizar como um gerador de números inteiros
        return supplier.get();
    }
}
