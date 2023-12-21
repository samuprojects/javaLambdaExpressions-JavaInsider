package lambda;

@SuppressWarnings("ALL")
public class AppString4 {

    public static void main(String[] args) {

        // nesse outro exemplo, temos um parâmetro com ele mesmo sendo passado para o String.valueOf
        //transformAndPrint(n -> String.valueOf(n), 100); // sem method reference
        transformAndPrint(String::valueOf, 100);

    }

    private static void transformAndPrint(NumberTransformer transformer, int number){
        System.out.println(transformer.transform(number));
    }
}
