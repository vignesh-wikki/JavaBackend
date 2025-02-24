package Day13.JunitPrograms;

public class PrimeNumberChecker {
    public static boolean primeNumberCheck(int number) {
        if (number <= 1) {
            throw new IllegalArgumentException("invalid number give a number greater than 1");
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
