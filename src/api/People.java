package api;

import java.util.Map;
import java.util.Optional;

public class People {
    private final Map<Integer, String> map;

    public People(Map<Integer, String> map) {
        this.map =map;
    }

    public Optional<String> getNameById(int id) { // para não retornar null podemos utilizar um dos métodos estáticos da classe Optional conforme abaixo
        for (var entry : map.entrySet()) {
            if (entry.getKey().equals(id)) {
                // of cria um optional com base num valor (e nunca pode ser nulo)
                // empty cria um optional vazio
                // ofNullable cria um optional com um valor e esse valor pode ser nulo

                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }
}
