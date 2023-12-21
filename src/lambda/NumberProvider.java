package lambda;

public class NumberProvider {

    private int n;

    public void setN(int n){
        this.n = n;
    }

    public Number provide(){
        int v = n; // utilizando essa variável para obter o valor do atributo e, ...
        return () -> v; // ... Ao utilizar variável na expressão lambda conseguimos evitar o problema do exemplo anterior quando utilizavam o atributo diretamente
    }

    @FunctionalInterface
    public interface Number{
        int get();
    }
}
