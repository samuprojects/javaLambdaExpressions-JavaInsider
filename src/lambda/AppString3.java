package lambda;

@SuppressWarnings("ALL")
public class AppString3 {

    public static void main(String[] args) {

        // quando temos uma expressão lambda com uma linha, sem as chaves, que recebe um parâmetro, e na execução ele para retornar alguma coisa, podemos usar o method reference (ocultando o parâmetro)

        //transformAndPrint(s -> s.toUpperCase(), "java"); //sem method reference
        transformAndPrint(String::toUpperCase, "java");

        // se quiser mapear a String no seu toString, que não vai dar em nada, só para mostrar que é possível
        transformAndPrint(String::toString, "java");

        // relembrando que essa simplificação só serve quando temos 1 parâmetro, 1 linha e usamos o parâmetro na linha
    }

    private static void transformAndPrint(TextTransformer transformer, String text) {
        System.out.println(transformer.transform(text));
    }
}
