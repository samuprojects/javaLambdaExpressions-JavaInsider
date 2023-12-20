package lambda;

@SuppressWarnings("ALL")
public class AppCalc1 {

    public static void main(String[] args) {

        // sempre que temos uma classe anônima de uma interface que implementa um método, podemos transformá-la numa expressão lambda.

        Operation sum = new Operation() {
            @Override
            public int calculate(int n1, int n2) {
                return n1 + n2;
            }
        };

        // toda expressão lambda tem parametros, retorno e um corpo (como se fosse um método)
        // interessante observar que nem aparece o método calculate da interface, mas está implementando pois os parametros foram passados
        Operation mult = (int n1, int n2) -> {
            return n1 * n2;
        };

        run(sum);
        run(mult);
    }

    private static void run(Operation operation) {
        int r = operation.calculate(5, 4);
        System.out.println(r);
    }
}
