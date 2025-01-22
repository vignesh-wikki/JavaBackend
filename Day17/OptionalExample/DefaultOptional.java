package Day17.OptionalExample;

import java.util.Optional;

public class DefaultOptional {
    public static void checkDefault(String name) {

        System.out.println("Hi, " + (Optional.of(name).filter((str) -> !str.isEmpty()).orElse("Alien")));

    }
    public static void main(String[] args) {
        checkDefault("Wikki");
        checkDefault("");
    }
}
