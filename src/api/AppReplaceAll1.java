package api;

import java.util.Arrays;

public class AppReplaceAll1 {

    public static void main(String[] args) {

        var numbers = Arrays.asList(0, 1, 2, 3, 4, 5);

        // se quiser substituir os elementos pelo dobro do valor deles podemos usar um replaceAll para alterar todos
        // dentro do replaceAll recebe um Unary Operator (que é uma Function, que possui apenas um método que é receber um valor e retornar outro)
        // e que no Unary temos o mesmo tipo de dado para o mesmo tipo de retorno (ou seja, pegamos um número inteiro e transformamos em outro número inteiro)
        numbers.replaceAll(n -> n * 2);
        System.out.println(numbers);
    }
}
