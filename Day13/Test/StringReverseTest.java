package Day13.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import Day13.JunitPrograms.StringReverse;

public class StringReverseTest {

    StringReverse stringReverse = new StringReverse();

    @Test
    public void testStringReverse() {
        assertEquals("olleh", stringReverse.reverseString("hello"));
    }

    @Test
    public void testSingleCharacterStringReverse() {
        assertEquals("V", stringReverse.reverseString("V"));
    }

    @Test
    public void testSpecialCharacrterStringReverse() {
        assertEquals("+_*&^%$#@!", stringReverse.reverseString("!@#$%^&*_+"));
    }

    @Test
    public void testNumberStringReverse() {
        assertEquals("0987654321", stringReverse.reverseString("1234567890"));
    }

    @Test
    public void testEmptyStringReverse() {
        assertEquals("", stringReverse.reverseString(""));
    }

    @Test
    public void testNullStringReverse() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringReverse.reverseString(null));
        assertEquals("invalid string", exception.getMessage());
    }

}
