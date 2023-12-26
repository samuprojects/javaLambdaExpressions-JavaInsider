package api;

public class ExCache {

    // Objetivo: criar Map que mapeia uma String para o seu tamanho (String → Integer), implementar método para receber a String e procurar no Map
    // o valor associado a ela. Caso não exista como chave inserir nova entrada no Map antes de retornar o valor.
    // Uma dica é usar o método computeIfAbsent() para adicionar uma nova entrada no Map caso ela não exista.

    public static void main(String[] args) {

        Cache cache = new Cache();
        System.out.println(cache.get("java"));
        System.out.println(cache.get("java"));
        System.out.println(cache.get("java"));
        System.out.println(cache.get("java"));

        System.out.println(cache.get("Spring Boot"));
        System.out.println(cache.get("Spring Boot"));
        System.out.println(cache.get("Spring Boot"));

        System.out.println(cache.get("Spring"));
        System.out.println(cache.get("Spring"));

    }
}