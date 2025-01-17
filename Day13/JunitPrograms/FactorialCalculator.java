package Day13.JunitPrograms;

public class FactorialCalculator {
    public int factorialCheck(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else if (number < 0)
            return 0;
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
            if (factorial >= Integer.MAX_VALUE)
                throw new IllegalArgumentException("input not valid integer");
        }
        return factorial;
    }
}
