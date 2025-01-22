package Day17.BinaryOperatorExample;

import java.util.function.BinaryOperator;

public class BinaryOperatorEX {
    public static void main(String[] args) {
        BinaryOperator<Integer> b1 = Integer::max;
        System.out.println(b1.apply(100, 99));
        System.out.println(b1.apply(-1, -0));
        System.out.println(b1.apply(9876, 9876));

    }
}
