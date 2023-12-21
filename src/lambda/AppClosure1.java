package lambda;

public class AppClosure1 {

    public static void main(String[] args) {

        // essa variável fora da expressão lambda lembra o conceito de quando acessávamos variáveis locais que estavam fora da inner class
        int mult = 2;

        // a regra também se aplica em lambda: desde que a variável seja explicitamente ou implicitamente final
        Operation sum = ((n1, n2) -> (n1 + n2) * mult);

        System.out.println(sum.calculate(5, 2));
    }
}
