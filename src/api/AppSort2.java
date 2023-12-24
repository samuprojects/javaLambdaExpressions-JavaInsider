package api;

import java.util.Arrays;
import java.util.Comparator;

public class AppSort2 {

    public static void main(String[] args) {

        var people = Arrays.asList(
                new Person("Pedro", 25),
                new Person("Paulo", 40),
                new Person("Joana", 34),
                new Person("Maria", 30),
                new Person("Paulo", 27)
        );

        // se quiser ordenar por nome podemos usar um Comparator
        people.sort((p1, p2) -> p1.name().compareTo(p2.name));

        // ou substituir por Comparator.comparing que permite criar um Comparator com base me uma função
        people.sort(Comparator.comparing(Person::name)); // lembrando que sem method reference ficaria people.sort(Comparator.comparing(p -> p.name()));

        // ou por idade
        people.sort(Comparator.comparing(Person::age));

        // se quiser inverter a idade, todos os métodos estáticos de Comparator retornam o próprio objeto do Comparator permitindo encadear chamadas com outros métodos
        people.sort(Comparator.comparing(Person::age).reversed());

        // com isso podemos adicionar dois Comparators caso desejemos, por exemplo, ordenar por nome e caso haja duplicidade por idade
        people.sort(Comparator.comparing(Person::name).thenComparing(Person::age)); // observar o resultado Paulo

        people.forEach(p -> System.out.println(p.name() + " - " + p.age));

    }

    record Person(String name, int age) {}
}
