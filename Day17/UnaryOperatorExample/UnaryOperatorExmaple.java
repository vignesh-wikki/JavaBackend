package Day17.UnaryOperatorExample;

import java.util.function.UnaryOperator;

public class UnaryOperatorExmaple {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(u1.apply("Vignesh"));
        System.out.println(u1.apply("hello hi, i am vignesh"));

    }
}
