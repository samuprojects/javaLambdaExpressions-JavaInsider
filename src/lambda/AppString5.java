package lambda;

@SuppressWarnings("ALL")
public class AppString5 {

    public static void main(String[] args) {

        //createAndPrint(n -> new Person(n), "Carlos"); // sem method reference, nesse cenário vamos passar o parâmetro no construtor (1º foi no próprio parâmetro, 2º foi no método estático)
        createAndPrint(Person::new, "Carlos");
    }

    private static void createAndPrint(PersonCreator creator, String name) {
        System.out.println(creator.create(name));
    }
}
