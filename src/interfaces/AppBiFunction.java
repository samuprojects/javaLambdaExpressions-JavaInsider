package interfaces;

import java.util.function.BiFunction;

@SuppressWarnings("ALL")
public class AppBiFunction { // recebe dois parâmetros de qualquer tipo e retorna um terceiro parâmetro de outro tipo ou do mesmo

    public static void main(String[] args) {
        System.out.println(combine(5, 2, (x, y) -> x + y));
        System.out.println(combine(5, 2, (x, y) -> x * y));

    }

    private static int combine(int n1, int n2, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(n1, n2);
    }
}
