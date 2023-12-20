package lambda;

@SuppressWarnings("ALL")
public class AppCalc2 {

    public static void main(String[] args) {
        // como o java sabe que o método calculate está implementado por inferencia dos parametros é possível simplificar ainda mais a expressão lambda omitindo tipo de dado
        // será obrigatório informar o tipo de dado caso tenha alguma situação de ambiguidade, mas do contrário só o nome das variáveis já funciona.
        // Quando temos um bloco de uma expressão lambda com apenas uma linha, e que retorna um valor, o return pode ser omitido bem como as chaves
        // inclusive a variável que controlava a operação pode ser descartada

        run((n1, n2) -> n1 + n2);

        run((n1, n2) -> n1 * n2);
    }

    private static void run(Operation operation) {
        int r = operation.calculate(5, 4);
        System.out.println(r);
    }
}
