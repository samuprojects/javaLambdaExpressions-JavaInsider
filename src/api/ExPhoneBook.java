package api;

public class ExPhoneBook {

    // Objetivo: criar uma classe PhoneBook representando uma agenda telefônica mapeando o nome de uma pessoa a um número de telefone.
    // Criar um método findByName para retornar o telefone que está associado a um nome.
    // Na execução quando localizar o telefone exibir na tela, ou lançar uma IllegalArgumentException.

    public static void main(String[] args) {

        var p = new PhoneBook();

        // primeira forma de resolver
        //String phone = p.findByName("pedra").orElseThrow(IllegalArgumentException::new);
        //System.out.println(phone);

        //segunda forma de resolver
        p.findByName("pedro").ifPresentOrElse(System.out::println, () -> {throw new IllegalArgumentException();}
        ); // quando a expressão lambda lança alguma exceção é obrigatório o uso das chaves

    }
}