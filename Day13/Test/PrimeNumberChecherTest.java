package Day13.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Day13.JunitPrograms.PrimeNumberChecker;

public class PrimeNumberChecherTest {
    PrimeNumberChecker check = new PrimeNumberChecker();

    @Test
    public void testPrimeNumbercheck() {
        assertTrue(check.primeNumberCheck(7));
    }

    @Test
    public void testNotPrimeNumbercheck() {
        assertFalse(check.primeNumberCheck(4));
    }


    @Test
    public void testinvalidPrimeNumbercheck() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            check.primeNumberCheck(0);
        });
        assertEquals("invalid number give a number greater than 1", exception.getMessage());
    }

    @Test
    public void testNegativePrimeNumbercheck() {
        assertFalse(check.primeNumberCheck(-7));
    }

}
