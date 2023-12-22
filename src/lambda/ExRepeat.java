package lambda;

@SuppressWarnings("ALL")
public class ExRepeat {

    //Objetivo: criar método repeat com parâmetros "n" para o número vezes + code código em lambda que tenha acesso ao índice da execução
    public static void main(String[] args) {
        repeat(5, i -> System.out.println("Number " + i));
    }

    private static void repeat(int n, RepeatCode code){ // recebe a quantidade de vezes e o número da execução atual
        for (int i = 0; i < n; i++) {
            code.repeat(i);
        }
    }

    @FunctionalInterface
    interface RepeatCode {
        void repeat(int index);
    }
}
