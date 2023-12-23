package interfaces;

public class AppRunnable {

    public static void main(String[] args) {
        execute(() -> System.out.println("Hi!"));
        execute(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }

    private static void execute(Runnable runnable) { // Existe desde o Java 1 e recebeu também a anotação de Functional Interface
        runnable.run(); // não tem parâmetro, não retorna nada
    }
}
