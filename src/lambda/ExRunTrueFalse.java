package lambda;

@SuppressWarnings("ALL")
public class ExRunTrueFalse {

    // Criar método run para receber 3 parâmetros s String, codeIfNotNull e codeIfNull lambdas para verificar se a String é nula.
    // A expressão lambda referente ao codeIfNotNull deve ter acesso ao objeto String para utilizá-lo caso necessário.

    public static void main(String[] args) {

        run("java",
                s -> System.out.println("My language is: " + s),
                () -> System.out.println("My language is none")
        );
    }

    private static void run(String s, CodeWithParam codeIfNotNull, CodeWithoutParam codeIfNull) { // método que recebe a String e as expressões lambda
        if (s != null) {
            codeIfNotNull.execute(s);
        } else {
            codeIfNull.execute();
        }
    }

    @FunctionalInterface
    interface CodeWithParam{ // interface quando possuir parâmetro
        void execute(String s);
    }

    @FunctionalInterface
    interface CodeWithoutParam { // interface quando não possuir
        void execute();
    }
}
