package Day17.StaticMethodRefernece;

import java.util.List;
import java.util.function.Function;

public class MethodRefernece {
    public static void main(String[] args) {
        Function<Integer, Double> f1 = Math::sqrt;

        List.of(9, 8, 7, 6, 5, 4, 3, 2, 1).forEach((number) -> {
            System.out.println(number + " Square root is: " + (f1.apply(number)));
        });
    }

}
