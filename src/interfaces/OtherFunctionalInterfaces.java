package interfaces;

@SuppressWarnings("ALL")
public class OtherFunctionalInterfaces {
    /*
    *
    * Existem outras interfaces funcionais prontas (no pacote function do java util) disponíveis no Java como, por exemplo:
    *
    * BiPredicate, que pode ser utilizado quando temos dois parâmetros para retornar um boolean
    *
    * IntSupplier, que ao invés de retornar um tipo genérico, retorna um int (assim como temos DoubleSupplier, LongSupplier, etc).
    *
    * IntToDoubleFunction, que recebe um inteiro e retorna um double.
    * IntToLongFunction, que mapeia um int para um Long... essas interfaces foram criadas provavelmente por uma questão de desempenho, para evitar
    * talvez que o autoboxing fosse realizado (embrulhar e desembrulhar os tipos primitivos do Java) várias vezes.
    *
    * Na parte de Consumer temos, por exemplo, ObjIntConsumer que recebe um objeto de determinado tipo + um inteiro e consome esse valor
    *
    * ToDoubleBiFunction, uma função que retorna um double e recebe dois parâmetros de entrada
    *
    * Unary Operator, que estende Function, só que é uma function onde o tipo de retorno e o tipo do parâmetro da expressão são do mesmo tipo, utilizado quando
    * temos uma função que mapeia uma coisa em outra coisa e essas duas coisas são do mesmo tipo, sem a necessidade de usar Function, por exemplo.
    *
    * Professor recomendou visitar esse pacote para conhecer os outros modelos existentes
    *
    * */
}
