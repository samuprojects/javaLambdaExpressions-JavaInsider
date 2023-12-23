package interfaces;

import java.util.function.Function;

@SuppressWarnings("ALL")
public class AppFunction { // recebe o parâmetro de um tipo e retorna outro tipo (ou do mesmo), muito utilizada onde precisamos mapear tipos de dados

    public static void main(String[] args) {

        Person p1 = new Person("Pedro", "Silva");
        System.out.println(map(p1, Person::getFirstName));
        System.out.println(map(p1, Person::getLastName));
        System.out.println(map(p1, p -> p.getFirstName() + " " + p.getLastName()));
    }

    private static String map(Person person, Function<Person, String> function) { // recebe uma pessoa Person e aplica uma Function como parâmetro uma Pessoa + uma String
        // o primeiro tipo de dado passado é o da expressão lambda e o segundo é o tipo de dado do retorno da expressão lambda
        return function.apply(person);
    }

    static class Person {
        private final String firstName;
        private final String lastName;

        public Person (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
