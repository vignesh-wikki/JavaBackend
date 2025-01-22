package Day17.SupplierExample;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {

        Supplier<Integer> ranInt = () -> {
            Random ran = new Random();
            return ran.nextInt(1, 100);
        };

        for (int i = 1; i <= 5; i++) {
            System.out.println(ranInt.get());
        }

    }
}
