package lambda;

@SuppressWarnings("ALL")
public class AppString2 {

    public static void main(String[] args) {

        // Expressões lambda com mais de uma linha precisam de chaves e obrigatoriamente de um return

        print(
                s -> {
                    char[] chars = s.toCharArray();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < chars.length; i += 2) {
                        sb.append(chars[i]);
                    }
                    return sb.toString();
                }, // print recebe primeiro parâmetro que é a expressão lambda
                "java rocks!"
        ); // e o segundo parâmetro que é a String
    }

    private static void print(TextTransformer textTransformer, String text) {
        System.out.println(textTransformer.transform(text));
    }
}
