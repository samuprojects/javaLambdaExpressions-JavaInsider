package lambda;

@SuppressWarnings("ALL")
public class Calculator {

    private int mult;

    int calculate(int x, int y) {
        mult = 2;
        Operation operation = (n1, n2) -> (n1 + n2) * mult;
        mult = 3; // foi possível alterar o valor da variável sem causar erro porque aqui, na verdade, é um atributo
        // e está fora da regra anterior (apenas para variáveis locais).
        // por isso muito cuidado ao utilizar expressões lambda que referenciam atributos de uma classe, pois,
        // pode ocorrer de no momento da execução o valor ter mudado e resultar em algo diferente do esperado
        return operation.calculate(x, y);
    }
}
