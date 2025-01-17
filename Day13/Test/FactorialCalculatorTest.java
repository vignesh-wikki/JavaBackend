package Day13.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigInteger;

import org.junit.Test;

import Day13.JunitPrograms.FactorialCalculator;

public class FactorialCalculatorTest {
    FactorialCalculator check = new FactorialCalculator();

    @Test
    public void testFactorialCalculator() {
        assertEquals(6, check.factorialCheck(3));
    }

    @Test
    public void testBigintegerFactorialCalculator() {
        assertEquals(0, check.factorialCheck(150));
    }

    @Test
    public void testZeroFactorialCalculator() {
        assertEquals(0, check.factorialCheck(0));
    }

    @Test
    public void testNegativeFactorialCalculator() {
        assertEquals(0, check.factorialCheck(-7));
    }

    @Test
    public void testBigintergerFactorialCalculator() {
        BigInteger result = calculator.calculateFactorial(214748364787);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            check.calculateFactorial(result);
        });
        assertEquals("input not valid integer", exception.getMessage());
    }

}
