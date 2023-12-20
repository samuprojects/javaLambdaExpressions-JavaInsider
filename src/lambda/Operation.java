package lambda;

@FunctionalInterface
public interface Operation {

    // o java não sabe qual é o método da interface, por isso não pode haver outros com os mesmos parametros
    // uma interface com apenas uma método não implementado pode receber uma anotação para indicar que só tem um método e que pode ser usado em lambda
    // todas as expressões lambda, no caso do exemplo, deverão respeitar os parametros não implementados que são: dois números inteiros e um de retorno

    int calculate(int n1, int n2);
}
