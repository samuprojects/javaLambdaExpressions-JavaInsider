package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private final Map<String, String> entries = new HashMap<>();

    public PhoneBook() {
        entries.put("pedro", "223-444");
        entries.put("joao", "555-444");
        entries.put("maria", "777-888");
        entries.put("josefa", "336-888");
    }

    public Optional<String> findByName(String name) {
        return Optional.ofNullable(entries.get(name)); // se usar só o of vai lançar exceção na construção do Optional
    }
}
