package lambda;

@SuppressWarnings("ALL")
@FunctionalInterface
public interface PersonCreator {

    Person create(String name);
}
