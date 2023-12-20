package lambda;

@SuppressWarnings("ALL")
public class AppCalc3 {

    public static void main(String[] args) {

        // quando uma expressão lambda não tem parâmetros é obrigatório uso dos parenteses, e dentro dele não vai nada.
        print(() -> "Hi!");
        print(() -> "Hello!");

        // senão informar o tipo de dado o uso do parenteses é opcional e só vale para quando tem apenas 1 parâmetro
        print(s -> s.toUpperCase(), "abc");
        print(s -> new StringBuilder(s).reverse().toString(), "abc");
    }

    private static void print(TextProvider textProvider) {
        System.out.println(textProvider.getText());
    }

    private static void print(TextTransformer textTransformer, String text) {
        System.out.println(textTransformer.transform(text));
    }
}
