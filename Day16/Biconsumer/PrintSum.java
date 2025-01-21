package Day16.Biconsumer;

import java.util.function.BiConsumer;

public class PrintSum {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer = (num1, num2) -> System.out
                .println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        consumer.accept(3, 5);
    }
}
