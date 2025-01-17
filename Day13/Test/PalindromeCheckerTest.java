package Day13.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assume.assumeFalse;

import org.junit.Test;

import Day13.JunitPrograms.PalindromeChecker;

public class PalindromeCheckerTest {
    PalindromeChecker check = new PalindromeChecker();

    @Test
    public void testPalindromeCheck() {
        assertEquals(true, check.palindromeCheck("malayalam"));
    }
     @Test
    public void testNullPalindromeCheck() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> check.palindromeCheck(null));
        assertEquals("invalid string", exception.getMessage());
    }

    @Test
    public void testInvalidPalindromeCheck() {
        assumeFalse(check.palindromeCheck("Vignesh"));
    }

    @Test
    public void testEmptyPalindromeCheck() {
        assumeFalse(check.palindromeCheck(""));
    }

    @Test
    public void testCasesensitivePalindromeCheck() {
        assumeFalse(check.palindromeCheck("Hello, hi I am Vignesh"));
    }
}
