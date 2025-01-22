package Day17.OptionalExample;

import java.util.Optional;

public class OptionalEx {
    public static void toUppercase(String str) {

        String string = Optional.ofNullable(str).filter((data) -> !data.isEmpty()).map((s) -> s.toUpperCase())
                .orElse("Empty string");

        System.out.println(string);
    }

    public static void main(String[] args) {
        toUppercase("Vignesh");
        toUppercase("");
        toUppercase(null);
    }
}
